public class AventureiroGuilda {

    private String nome;
    private String especialidade;
    private int energia;
    private int experiencia;
    private boolean ativo;

    void configurar(String novoNome, String novaEspecialidade, int energiaInicial) {
        nome = novoNome;
        especialidade = novaEspecialidade;
        if (energiaInicial < 0) {
            energia = 0;
        } else {
            energia = energiaInicial;
        }
        experiencia = 0;
        ativo = true;
    }

    boolean podeExecutarMissao(int custoEnergia) {
        if(ativo && custoEnergia > 0 && custoEnergia <= energia) {
            return true;
        } else {
            return false;
        }
    }

    boolean executarMissao(int custoEnergia, int recompensaExperiencia) {
        if(podeExecutarMissao(custoEnergia) && recompensaExperiencia > 0) {
            energia -= custoEnergia;
            experiencia += recompensaExperiencia;
            System.out.println(nome + " concluiu a missão.");
            return true;
        } else {
            System.out.println(nome + " não possui energia suficiente.");
            return false;
        }
    }

    void descansar(int energiaRecuperada) {
        if(energiaRecuperada > 0) {
            energia += energiaRecuperada;
            System.out.println(nome + " recuperou energia.");
        }
    }

    int consultarNivel() {
        if(experiencia >= 0 && experiencia <= 9) {
            return 1;
        } else if (experiencia >= 10 && experiencia <= 24) {
            return 2;
        } else if (experiencia >= 25 && experiencia <= 49) {
            return 3;
        } else {
            return 4;
        }
    }

    int consultarEnergia() {
        return energia;
    }

    int consultarExperiencia() {
        return experiencia;
    }

    boolean possuiNome(String nomeBuscado){
        if(nome.equals(nomeBuscado)) {
            return true;
        } else {
            return false;
        }
    }

    void mostrarFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Energia: " + energia);
        System.out.println("Experiência: " + experiencia);
        System.out.println("Nível: " + consultarNivel());
        if(ativo) {
            System.out.println("Status: Ativo");
        } else {
            System.out.println("Status: Inativo");
        }
    }
}
