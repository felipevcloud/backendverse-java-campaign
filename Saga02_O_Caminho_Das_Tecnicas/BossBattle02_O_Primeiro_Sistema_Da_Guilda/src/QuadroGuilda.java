import java.util.ArrayList;

public class QuadroGuilda {

    private ArrayList<MissaoGuilda> missoes = new ArrayList<>();

    void adicionarMissao(MissaoGuilda missao) {
        if(missao != null) {
            missoes.add(missao);
            System.out.println("Nova missão registrada.");
        } else {
            System.out.println("Referência de missão inválida.");
        }
    }

    int consultarQuantidade() {
        return missoes.size();
    }

    void listarMissoes() {
        if(!missoes.isEmpty()) {
            for(int i = 0; i < consultarQuantidade(); i++) {
                missoes.get(i).mostrarFicha();
                System.out.println();
            }
        } else {
            System.out.println("Quadro sem missões");
        }
    }

    boolean contemMissao (String tituloBuscado) {
        for(MissaoGuilda missao : missoes) {
            if (missao.possuiTitulo(tituloBuscado)) {
                return true;
            }
        }
        return false;
    }

    boolean removerMissaoPorTitulo(String tituloBuscado) {
        for(int i = 0; i < consultarQuantidade(); i++) {
            if(missoes.get(i).possuiTitulo(tituloBuscado)) {
                missoes.remove(i);
                return true;
            }
        }
        return false;
    }

    boolean concluirMissao(String tituloBuscado, AventureiroGuilda aventureiro) {
        if (aventureiro != null) {
            for (MissaoGuilda missao : missoes) {
                if (missao.possuiTitulo(tituloBuscado)) {
                    if (missao.estaDisponivel() && aventureiro.executarMissao(missao.consultarCustoEnergia(), missao.consultarRecompensaExperiencia())) {
                        missao.concluir();
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
