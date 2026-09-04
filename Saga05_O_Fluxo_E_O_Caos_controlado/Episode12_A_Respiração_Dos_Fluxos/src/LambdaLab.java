import java.util.function.Predicate;

public class LambdaLab {

    public static void main(String[] args) {

        // VOCÊ ESCREVE:
        // Predicate<Integer> isEven = ...
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(8));
        System.out.println(isEven.test(11));
    }
}