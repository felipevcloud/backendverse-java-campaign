public class MissaoGuilda {

    private String titulo;
    private String categoria;
    private int custoEnergia;
    private int recompensaExperiencia;
    private boolean disponivel;

    void configurar(String novoTitulo, String novaCategoria, int novoCusto, int novaRecompensa) {
        titulo = novoTitulo;
        categoria = novaCategoria;
        if (novoCusto < 0) {
            custoEnergia = 0;
        } else {
            custoEnergia = novoCusto;
        }
        if (novaRecompensa < 0) {
            recompensaExperiencia = 0;
        } else {
            recompensaExperiencia = novaRecompensa;
        }
        disponivel = true;
    }

    boolean possuiTitulo(String tituloBuscado) {
        if(titulo.equals(tituloBuscado)) {
            return true;
        } else {
            return false;
        }
    }

    boolean estaDisponivel() {
        return disponivel;
    }

    int consultarCustoEnergia() {
        return custoEnergia;
    }

    int consultarRecompensaExperiencia() {
        return recompensaExperiencia;
    }

    void concluir() {
        disponivel = false;
        System.out.println("Missão concluída!");
    }

    void mostrarFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Custo de energia: " + custoEnergia);
        System.out.println("Recompensa de experiência: " + recompensaExperiencia);
        if(disponivel) {
            System.out.println("Status: Disponível");
        } else {
            System.out.println("Status: Concluída");
        }
    }
}
