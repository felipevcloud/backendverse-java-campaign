public abstract class Entidade {

    private String nome;
    private int energia;

    public Entidade(String nome, int energia) {
        if (nome == null || nome == "") {
            nome = "Alma Sem Nome";
            this.nome = nome;
            System.out.println("[Entidade] Nome inválido. Valor padrão aplicado: Alma Sem Nome.");
        } else {
            this.nome = nome;
        }

        if (energia <= 0) {
            energia = 1;
            this.energia = energia;
            System.out.println("[Entidade] Energia inválida. Valor mínimo aplicado: 1.");
        } else {
            this.energia = energia;
        }
        System.out.println("[Entidade] Essência de " + nome + " estabilizada.");
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void apresentar() {
        System.out.println("Entidade: " + nome);
        System.out.println("Energia espiritual: " + energia + "\n");
    }

    public abstract void manifestarPoder();
}
