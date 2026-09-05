import java.util.*;
import java.util.stream.Collectors;

public class Revisit12ArenaDasFuncoes {

    static class Tamer {
        private final String nickname;
        private final int power;
        private final boolean online;
        private final List<String> techniques;

        Tamer(String nickname, int power, boolean online, List<String> techniques) {
            this.nickname = nickname;
            this.power = power;
            this.online = online;
            this.techniques = techniques;
        }

        String getNickname() {
            return nickname;
        }

        int getPower() {
            return power;
        }

        boolean isOnline() {
            return online;
        }

        List<String> getTechniques() {
            return techniques;
        }

        @Override
        public String toString() {
            return nickname + "(" + power + ")";
        }
    }

    public static void main(String[] args) {

        Tamer varyon = new Tamer(
                "varyon",
                87,
                true,
                List.of("Pepper Breath", "Mega Flame", "Guard")
        );

        Tamer mika = new Tamer(
                "mika",
                74,
                true,
                List.of("Guard", "Holy Shot")
        );

        Tamer zer0 = new Tamer(
                "zer0",
                120,
                false,
                List.of("Darkness Wave", "Mega Flame")
        );

        Tamer luna = new Tamer(
                "luna",
                -15,
                true,
                List.of("Heal", "Guard")
        );

        Tamer byteTamer = new Tamer(
                "byte",
                91,
                true,
                List.of("Mega Flame", "Giga Destroyer")
        );

        List<List<Tamer>> squads = List.of(
                List.of(varyon, mika),
                List.of(zer0, luna),
                List.of(byteTamer, varyon)
        );

        System.out.println("=== TESTE 1 ===");
        System.out.println(buildTechniqueCodex(squads, 70));

        System.out.println("\n=== TESTE 2 ===");
        Map<String, Long> frequencies =
                countTechniqueUsage(squads, 70);

        System.out.println("Guard = " + frequencies.get("GUARD"));
        System.out.println("Mega Flame = " + frequencies.get("MEGA FLAME"));
        System.out.println("Holy Shot = " + frequencies.get("HOLY SHOT"));
        System.out.println("Giga Destroyer = " + frequencies.get("GIGA DESTROYER"));

        System.out.println("\n=== TESTE 3 ===");
        System.out.println(findChampionName(squads, 70));
        System.out.println(findChampionName(squads, 100));
        System.out.println(findChampionName(List.of(), 50));
    }

    // VOCÊ IMPLEMENTA
    static String buildTechniqueCodex(List<List<Tamer>> squads, int minimumPower) {
        return squads.stream()
                .flatMap(List::stream)
                .filter(tamer -> tamer.isOnline() && tamer.getPower() >= minimumPower)
                .map(tamer -> tamer.getTechniques())
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.joining(" | "));
    }

    // VOCÊ IMPLEMENTA
    static Map<String, Long> countTechniqueUsage(List<List<Tamer>> squads, int minimumPower) {
        return squads.stream()
                .flatMap(List::stream)
                .filter(tamer -> tamer.isOnline() && tamer.getPower() >= minimumPower)
                .map(tamer -> tamer.getTechniques())
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(technique -> technique, Collectors.counting()));
    }

    // VOCÊ IMPLEMENTA
    static String findChampionName(List<List<Tamer>> squads, int minimumPower) {
        return squads.stream()
                .flatMap(List::stream)
                .filter(tamer -> tamer.isOnline() && tamer.getPower() >= minimumPower)
                .reduce((tamer1, tamer2) -> {
                    if (tamer1.getPower() > tamer2.getPower()) {
                        return tamer1;
                    } else {
                        return tamer2;
                    }
                })
                .map(tamer -> tamer.getNickname().toUpperCase())
                .orElse("NO CHAMPION");
    }
}