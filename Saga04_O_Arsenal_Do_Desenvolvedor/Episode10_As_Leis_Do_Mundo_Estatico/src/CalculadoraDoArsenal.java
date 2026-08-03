public class CalculadoraDoArsenal {
    public static int calcularPoderFinal(int poderBase, double multiplicador) {
        return (int) Math.min(Math.round(poderBase * multiplicador), Artefato.LIMITE_MAXIMO);
    }
}
