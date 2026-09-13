import java.util.List;

public class Guilda {

    private final CentralContratos centralContratos;
    private final QuadroAventureiros quadroAventureiros;

    public Guilda (CentralContratos centralContratos, QuadroAventureiros quadroAventureiros) {
        if (centralContratos == null || quadroAventureiros == null) {
            throw new IllegalArgumentException("Null Attribute");
        }

        this.centralContratos = centralContratos;
        this.quadroAventureiros = quadroAventureiros;
    }

    public void atribuirAventureiro(String idContrato, String codigoAventureiro) {
        centralContratos.buscarPorId(idContrato)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Contract"))
                .atribuirAventureiro(quadroAventureiros.buscarPorCodigo(codigoAventureiro)
                        .orElseThrow(() -> new IllegalArgumentException("Invalid Adventurer")));
    }

    public List<ContratoGuilda> listarContratosDoAventureiro(String codigoAventureiro) {
        if (!quadroAventureiros.existe(codigoAventureiro)) {
            throw new IllegalArgumentException("Inexistent Adventurer");
        }

        return centralContratos.listarPorAventureiro(codigoAventureiro);
    }
}
