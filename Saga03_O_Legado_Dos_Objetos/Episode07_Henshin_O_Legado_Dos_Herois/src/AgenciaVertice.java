import java.util.ArrayList;

public class AgenciaVertice {

    private ArrayList<Combatente> combatentes = new ArrayList<>();

    public void adicionarCombatente(Combatente combatente) {
        combatentes.add(combatente);
    }

    public void apresentarFormacao() {
        for (Combatente combatente : combatentes) {
            combatente.apresentar();
        }
    }

    public void transformarTodos() {
        for (Combatente combatente : combatentes) {
            combatente.transformar();
        }
    }

    public void ordenarAtaques() {
        for (Combatente combatente : combatentes) {
            combatente.atacar();
        }
    }

    public void ordenarGolpesFinais() {
        for (Combatente combatente : combatentes) {
            combatente.executarGolpeFinal();
        }
    }

    public void desfazerTransformacoes() {
        for (Combatente combatente : combatentes) {
            combatente.desfazerTransformacao();
        }
    }
}
