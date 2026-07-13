public class AlvoTreinamento {

    private String nome;
    private int resistencia;
    private boolean destruido;

    void configurar (String novoNome, int resistenciaInicial) {
        if (resistenciaInicial > 0) {
            nome = novoNome;
            resistencia = resistenciaInicial;
            destruido = false;
        } else {
            nome = novoNome;
            resistencia = 0;
            destruido = false;
        }
    }

    int receberAtaque (int dano) {
        if (destruido == false && dano > 0) {
            resistencia -= dano;
            if (resistencia <= 0) {
                resistencia = 0;
                destruido = true;
            }
        }
        return resistencia;
    }

    boolean estaDestruido () {
        return destruido;
    }

    int consultarResistencia () {
        return resistencia;
    }

    void mostrarStatus () {
        System.out.println("Nome: " + nome);
        System.out.println("Resistência: " + resistencia);
        if (!destruido) {
            System.out.println("Status: Ativo\n");
        } else {
            System.out.println("Status: Destruído\n");
        }
    }
}
