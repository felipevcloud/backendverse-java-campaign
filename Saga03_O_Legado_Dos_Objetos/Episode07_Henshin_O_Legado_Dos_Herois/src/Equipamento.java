public class Equipamento {

    private String nome;
    private int nivelPoder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public void exibirDetalhes() {
        System.out.println("Equipamento: " + getNome());
        System.out.println("Nível de poder: " + getNivelPoder());
    }
}
