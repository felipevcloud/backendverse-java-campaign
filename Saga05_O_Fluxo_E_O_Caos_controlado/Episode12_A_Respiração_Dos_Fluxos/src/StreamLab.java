import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class StreamLab {

    record Digimon(String name, int attack, boolean active) {
    }

    record Player(String nickname, int level, boolean online) {
    }

    public static void main(String[] args) {

        List<Digimon> team = List.of(
                new Digimon("Agumon", 70, true),
                new Digimon("Gabumon", 65, true),
                new Digimon("Patamon", 40, false),
                new Digimon("Gatomon", 75, true),
                new Digimon("Tentomon", 50, false)
        );

        List<Player> players = List.of(
                new Player("varyon", 32, true),
                new Player("mika", 12, true),
                new Player("zer0", 41, false),
                new Player("luna", 25, true),
                new Player("byte", 18, false)
        );

        List<Digimon> trickyTeam = List.of(
                new Digimon("Agumon", 70, true),
                new Digimon("MetalGreymon", 75, false),
                new Digimon("Gatomon", 75, true)
        );

        Predicate<Digimon> battleReady = digimon -> digimon.active() && digimon.attack() >= 65;

        //System.out.println(calculateActivePower(team));
        //System.out.println(findVeteranPlayers(players));
        //System.out.println(findByName(team, "Gatomon"));
        //System.out.println(findByName(team, "Veemon"));
        //System.out.println(findAttackDescription(team, "Gatomon"));
        //System.out.println(findAttackDescription(team, "Veemon"));
        //System.out.println(findFirstVeteranNickname(players, 32));
        //System.out.println(findFirstVeteranNickname(players, 50));
        //System.out.println(findFirstVeteranNickname(List.of(), 20));
        //System.out.println(findFirstEligibleDigimon(team, 70));
        //System.out.println(findFirstEligibleDigimon(team, 100));
        //System.out.println(findFirstEligibleDigimon(List.of(), 50));
        System.out.println(selectDigimonNames(team, battleReady));
        System.out.println(findStrongestEligibleName(trickyTeam, battleReady));
        Predicate<Digimon> impossible =
                digimon -> digimon.attack() >= 999;

        System.out.println(selectDigimonNames(team, impossible));
        System.out.println(findStrongestEligibleName(team, impossible));
    }

    static int calculateActivePower(List<Digimon> team) {
        return team.stream()
                .filter(digimon -> digimon.active())
                .filter(digimon -> digimon.attack() >= 60)
                .map(digimon -> digimon.attack())
                .reduce(0, (accumulator, attack) -> accumulator + attack);

    }

    static List<String> findVeteranPlayers(List<Player> players) {
        return players.stream()
                .filter(player -> player.online())
                .filter(player -> player.level() >= 20)
                .map(player -> player.nickname().toUpperCase())
                .toList();
    }

    static Optional<Digimon> findByName(List<Digimon> digimons, String name) {
        return digimons.stream()
                .filter(digimon -> digimon.name().equals(name))
                .findFirst();
    }

    static String findAttackDescription(List<Digimon> digimons, String name) {
        return findByName(digimons, name)
                .map(digimon -> "Attack: " + digimon.attack())
                .orElse("Digimon not found");
    }

    static Optional<String> findFirstVeteranNickname(List<Player> players, int minimumLevel) {
        return players.stream()
                .filter(player -> player.online())
                .filter(player -> player.level() >= minimumLevel)
                .findFirst()
                .map(player -> player.nickname().toUpperCase());
    }

    static Optional<String> findFirstEligibleDigimon(List<Digimon> digimons, int minimumAttack) {
        return digimons.stream()
                .filter(digimon -> digimon.active())
                .filter(digimon -> digimon.attack() >= minimumAttack)
                .findFirst()
                .map(digimon -> digimon.name());
    }

    static List<String> selectDigimonNames(List<Digimon> digimons, Predicate<Digimon> rule) {
        return digimons.stream()
                .filter(rule)
                .map(digimon -> digimon.name().toUpperCase())
                .collect(Collectors.toList());
    }

    static Optional<String> findStrongestEligibleName(List<Digimon> digimons, Predicate<Digimon> rule) {
        int max = digimons.stream()
                .filter(rule)
                .map(digimon -> digimon.attack())
                .reduce(0, (currentMax, attack) -> max(currentMax, attack));

        return digimons.stream()
                .filter(rule)
                .filter(digimon -> digimon.attack() == max)
                .findFirst()
                .map(digimon -> digimon.name());
    }
}