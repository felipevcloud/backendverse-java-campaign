public class TecnicaRegistrada {

    private String nome;
    private String categoria;
    private int poder;
    private boolean ativa;

    void definirDados (String novoNome, String novaCategoria, int poderInicial) {
        nome = novoNome;
        categoria = novaCategoria;
        if (poderInicial > 0) {
            poder = poderInicial;
        } else {
            poder = 0;
        }
        ativa = true;
    }

    void aprimorar (int aumento) {
        if (aumento > 0) {
            poder += aumento;
            System.out.println("Técnica " + nome + " aumentou seu poder para " + poder);
        }
    }

    void desativar () {
        ativa = false;
    }

    boolean possuiNome (String nomeBuscado) {
        return nome.equals(nomeBuscado);
    }

    void mostrarFicha () {
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Poder: " + poder);
        if (ativa) {
            System.out.println("Status: Ativa\n");
        } else {
            System.out.println("Status: Inativa\n");
        }
    }
}
