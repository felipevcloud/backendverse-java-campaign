public class AprendizRegistro {

    String nome;
    String tecnicaPrincipal;
    int nivel;
    boolean ativo;

    void apresentar() {
        System.out.println("Eu sou " + nome + ", aprendiz da Academia Backend.");
    }

    void mostrarFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Técnica Principal: " + tecnicaPrincipal);
        System.out.println("Nível: " + nivel);
        if(ativo) {
            System.out.println("Status: Ativo");
        } else {
            System.out.println("Status: Inativo");
        }
    }

    void treinar() {
        nivel++;
        System.out.println("Treinamento especial iniciado...");
        System.out.println(nome + " treinou e subiu de nível.");
    }
}
