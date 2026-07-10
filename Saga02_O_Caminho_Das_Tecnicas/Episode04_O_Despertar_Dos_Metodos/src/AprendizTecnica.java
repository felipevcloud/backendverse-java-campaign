public class AprendizTecnica {

    private String nome;
    private String tecnicaPrincipal;
    private int energia;
    private int experiencia;

    void definirDados(String novoNome, String novaTecnica) {
        nome = novoNome;
        tecnicaPrincipal = novaTecnica;
        energia = 20;
        experiencia = 0;
    }

    void treinar(int custoEnergia, int ganhoExperiencia) {
        if (energia >= custoEnergia) {
            energia -= custoEnergia;
            experiencia += ganhoExperiencia;
            System.out.println(nome + " treinou " + tecnicaPrincipal + ".\n" +
                    "Energia reduzida.\n" +
                    "Experiência aumentada.");
        } else {
            System.out.println(nome + " precisa descansar para treinar mais.");
        }
    }

    void descansar(int energiaRecuperada) {
        energia += energiaRecuperada;
        System.out.println(nome + " descansou e recuperou energia.");
    }

    boolean podeTreinar(int custoEnergia){
        if(energia >= custoEnergia){
            return true;
        } else {
            return false;
        }
    }

    int consultarNivel(){
        if (experiencia < 10) {
           return 1;
        } else if (experiencia >= 10 && experiencia < 19) {
            return 2;
        } else {
            return 3;
        }
    }

    void mostrarStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Técnica Principal: " + tecnicaPrincipal);
        System.out.println("Energia: " + energia);
        System.out.println("Experiência: " + experiencia);
        System.out.println("Nível: " + consultarNivel());
    }
}
