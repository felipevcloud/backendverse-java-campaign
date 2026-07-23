import java.util.ArrayList;

public class SantuarioDasAlmas {

    private ArrayList<Entidade> santuario = new ArrayList<>();

    public void registrarEntidade(Entidade entidade) {
        if (entidade != null) {
            santuario.add(entidade);
            System.out.println(entidade.getNome() + " foi vinculado ao Santuário das Almas.");
        } else {
            System.out.println("Não foi possível registrar uma entidade inexistente.");
        }
    }

    public void apresentarEntidades() {
        for (Entidade entidade : santuario) {
            entidade.apresentar();
        }
    }

    public void ordenarManifestacoes() {
        for (Entidade entidade : santuario) {
            entidade.manifestarPoder();
        }
    }

    public boolean desvincularEntidade(Entidade entidade) {
        if (santuario.remove(entidade)) {
            System.out.println(entidade.getNome() + " foi desvinculado do Santuário das Almas.");
            return true;
        } else {
            System.out.println("A entidade informada não estava vinculada ao santuário.");
            return false;
        }
    }

    public void apresentarRelatorioFinal() {
        for (Entidade entidade : santuario) {
            System.out.println(entidade.getNome() + " | Energia espiritual: " + entidade.getEnergia());
        }
    }
}
