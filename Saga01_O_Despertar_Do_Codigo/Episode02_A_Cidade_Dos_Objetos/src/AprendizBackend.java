public class AprendizBackend {

    String nome;
    String especialidade;
    int nivel;

    void apresentar(){
        System.out.println("Aprendiz registrado na Academia Backend.\n" +
                "Meu nome é " + nome + " e minha especialidade inicial é " + especialidade + ".");
    }

    void mostrarStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Nível: " + nivel);
    }
}
