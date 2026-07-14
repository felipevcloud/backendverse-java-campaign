import java.util.ArrayList;

public class BibliotecaTecnicas {

    private ArrayList<TecnicaRegistrada> tecnicas = new ArrayList<>();

    void adicionarTecnica (TecnicaRegistrada tecnica) {
        if (tecnica != null) {
            tecnicas.add(tecnica);
            System.out.println("Técnica adicionada ao grimório.");
        }
    }

    int consultarQuantidade () {
        return tecnicas.size();
    }

    void listarTecnicas () {
        if (tecnicas.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for(int i = 0; i < consultarQuantidade(); i++) {
                tecnicas.get(i).mostrarFicha();
            }
        }
    }

    boolean contemTecnica (String nomeBuscado) {
        for (TecnicaRegistrada tecnica : tecnicas) {
            if (tecnica.possuiNome(nomeBuscado)) {
                return true;
            }
        }
        return false;
    }

    boolean removerTecnicaPorNome (String nomeBuscado) {
        for (int i = 0; i < consultarQuantidade(); i++) {
            if (tecnicas.get(i).possuiNome(nomeBuscado)) {
                tecnicas.remove(tecnicas.get(i));
                return true;
            }
        }
        return false;
    }

    void mostrarTecnicaNaPosicao (int indice) {
        if (indice >= 0 && indice < consultarQuantidade()) {
            System.out.println("Técnica encontrada na posição " + indice + ":\n");
            tecnicas.get(indice).mostrarFicha();
        } else {
            System.out.println("Posição " + indice + " inválida.\n");
        }
    }
}
