public class Artefato {

    private String nome;
    private int poderBase;
    private double multiplicador;

    private static int totalDeArtefatos = 0;
    public static final int LIMITE_MAXIMO = 1000;

    public Artefato(String nome, int poderBase, double multiplicador) {
        if (nome == null || nome.isEmpty()) {
            nome = "Artefato Sem Nome";
        }

        if (poderBase <= 0) {
            poderBase = 1;
        }

        if (multiplicador <= 0.0) {
            multiplicador = 1.0;
        }
        this.nome = nome;
        this.poderBase = poderBase;
        this.multiplicador = multiplicador;
        totalDeArtefatos++;
        System.out.println("[Artefato] " + nome + " registrado nas leis do arsenal.");
    }

    public String getNome() {
        return nome;
    }

    public int getPoderBase() {
        return poderBase;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public static int getTotalDeArtefatos() {
        return totalDeArtefatos;
    }

    public void apresentarDados() {
        System.out.println("Artefato: " + nome + "\n" +
                "Poder base: " + poderBase + "\n" +
                "Multiplicador: " + String.format("%.2f", multiplicador));
    }
}
