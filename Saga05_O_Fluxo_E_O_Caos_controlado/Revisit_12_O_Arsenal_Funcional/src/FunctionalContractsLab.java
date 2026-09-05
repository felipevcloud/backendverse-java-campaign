import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.lang.Math.max;

public class FunctionalContractsLab {

    public static void main(String[] args) {

        // 1. verdadeiro quando o nível for pelo menos 30
        Predicate<Integer> veteran = level -> level >= 30;

        // 2. transforma um nickname em sua quantidade de caracteres
        Function<String, Integer> nicknameLength = nickname -> nickname.length();

        // 3. imprime: Jogador: <nome>
        Consumer<String> announcePlayer = nome -> System.out.println("Jogador: " + nome);

        // 4. fornece exatamente a String "READY"
        Supplier<String> initialStatus = () -> "READY";

        // 5. recebe uma String e devolve a mesma String em maiúsculas
        UnaryOperator<String> shout = lower -> lower.toUpperCase();

        // 6. recebe dois Integer e devolve o maior
        BinaryOperator<Integer> strongest = (num1, num2) -> max(num1, num2);

        // 7. transforme esta lambda em method reference
        Function<String, Integer> nicknameLengthRef = String::length;

        System.out.println(veteran.test(32));              // true
        System.out.println(veteran.test(12));              // false

        System.out.println(nicknameLength.apply("varyon")); // 6

        announcePlayer.accept("varyon");                   // Jogador: varyon

        System.out.println(initialStatus.get());            // READY

        System.out.println(shout.apply("gabumon"));          // GABUMON
        System.out.println(strongest.apply(70, 85));         // 85
        System.out.println(nicknameLengthRef.apply("varyon")); // 6

        List<List<String>> squads = List.of(
                List.of("Agumon", "Gabumon", "Patamon"),
                List.of("Gatomon", "Agumon"),
                List.of("Tentomon", "Gabumon")
        );

        System.out.println(uniqueSortedMembers(squads));

        System.out.println(squadRoster(squads));
        System.out.println(countMembersByNameLength(squads));

        System.out.println(totalPower(List.of(10, 20, 30)));       // 60
        System.out.println(totalPower(List.of()));                 // 0

        System.out.println(strongestPower(List.of(10, 20, 30)));   // Optional[30]
        System.out.println(strongestPower(List.of(-20, -5, -12))); // Optional[-5]
        System.out.println(strongestPower(List.of()));              // Optional.empty

        System.out.println(normalizePlayerName(Optional.of("  varyon  "))); // VARYON
        System.out.println(normalizePlayerName(Optional.of("   ")));        // ANONYMOUS
        System.out.println(normalizePlayerName(Optional.empty()));          // ANONYMOUS

        System.out.println(requirePositivePower(Optional.of(80)));          // 80
        System.out.println(requirePositivePower(Optional.of(0)));           // exception
    }

    static List<String> uniqueSortedMembers(List<List<String>> squads) {
        return squads.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
    }

    static String squadRoster(List<List<String>> squads) {
        return squads.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.joining(" | "));
    }

    static Map<Integer, Long> countMembersByNameLength(List<List<String>> squads) {
        return squads.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }

    static int totalPower(List<Integer> powers) {
        return powers.stream()
                .reduce(0, Integer::sum);
    }

    static Optional<Integer> strongestPower(List<Integer> powers) {
        return powers.stream()
                .reduce(Integer::max);
    }

    static String normalizePlayerName(Optional<String> name) {
        return name.filter(n -> !n.isBlank())
                .map(String::trim)
                .map(String::toUpperCase)
                .orElseGet(() -> "ANONYMOUS");
    }

    static int requirePositivePower(Optional<Integer> power) {
        return power.filter(p -> p > 0)
                .orElseThrow(() -> new IllegalArgumentException("Power inválido"));
    }
}