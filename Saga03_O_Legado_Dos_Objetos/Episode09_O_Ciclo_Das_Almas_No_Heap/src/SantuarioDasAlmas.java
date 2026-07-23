import java.util.ArrayList;

public class SantuarioDasAlmas {

    private ArrayList<Entidade> entidades = new ArrayList<>();

    public void registrarEntidade(Entidade entidade) {
        if (entidade != null) {
            entidades.add(entidade);
            System.out.println(entidade.getNome() + " foi vinculado ao Santuário das Almas.");
        } else {
            System.out.println("Não foi possível registrar uma entidade inexistente.");
        }
    }

    public void apresentarEntidades() {
        for (Entidade entidade : entidades) {
            entidade.apresentar();
        }
    }

    public void ordenarManifestacoes() {
        for (Entidade entidade : entidades) {
            entidade.manifestarPoder();
        }
    }

    public boolean desvincularEntidade(Entidade entidade) {
        if (entidades.remove(entidade)) {
            System.out.println(entidade.getNome() + " foi desvinculado do Santuário das Almas.");
            return true;
        } else {
            System.out.println("A entidade informada não estava vinculada ao santuário.");
            return false;
        }
    }

    public void apresentarRelatorioFinal() {
        for (Entidade entidade : entidades) {
            System.out.println(entidade.getNome() + " | Energia espiritual: " + entidade.getEnergia());
        }
    }
}
