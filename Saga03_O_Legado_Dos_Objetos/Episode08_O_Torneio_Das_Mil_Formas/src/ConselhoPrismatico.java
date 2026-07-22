import java.util.ArrayList;

public class ConselhoPrismatico {

    private ArrayList<Participante> participantes = new ArrayList<>();
    private ArrayList<Transformavel> transformaveis = new ArrayList<>();
    private ArrayList<Invocador> invocadores = new ArrayList<>();

    void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    void adicionarTransformavel(Transformavel transformavel) {
        transformaveis.add(transformavel);
    }

    void adicionarInvocador(Invocador invocador) {
        invocadores.add(invocador);
    }

    void apresentarFormacao() {
        for (Participante participante : participantes) {
            participante.apresentar();
        }
    }

    void coordenarTransformacoes() {
        for (Transformavel transformavel : transformaveis) {
            transformavel.transformar();
        }
    }

    void coordenarInvocacoes() {
        for (Invocador invocador : invocadores) {
            invocador.invocar();
        }
    }

    void ordenarTecnicasEspeciais() {
        for (Participante participante : participantes) {
            participante.executarTecnicaEspecial();
        }
    }

    void apresentarRelatorioFinal() {
        for (Participante participante : participantes) {
            System.out.println(participante.getNome() + " | Energia restante: " + participante.getEnergia() + "\n");
        }
    }
}
