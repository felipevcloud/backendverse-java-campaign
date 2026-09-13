import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class BossBattleVBloco2Harness {

    public static void main(String[] args) {
        CentralContratos central = new CentralContratos();

        central.cadastrar(new ContratoGuilda(
                "CT-003",
                "Escoltar caravana",
                new Recompensa(new BigDecimal("49.50")),
                LocalDate.of(2026, 10, 1)
        ));

        central.cadastrar(new ContratoGuilda(
                "CT-002",
                "Eliminar slime alfa",
                new Recompensa(new BigDecimal("250.50")),
                LocalDate.of(2026, 9, 20)
        ));

        central.cadastrar(new ContratoGuilda(
                "CT-001",
                "Recuperar artefato",
                new Recompensa(new BigDecimal("100.00")),
                LocalDate.of(2026, 10, 1)
        ));

        System.out.println("=== BUSCA ===");
        System.out.println("CT-002 presente: "
                + central.buscarPorId("CT-002").isPresent());

        System.out.println("CT-999 presente: "
                + central.buscarPorId("CT-999").isPresent());

        System.out.println();
        System.out.println("=== ORDENACAO ABERTOS ===");

        List<ContratoGuilda> abertos =
                central.listarPorStatus(StatusContrato.ABERTO);

        for (ContratoGuilda contrato : abertos) {
            System.out.println(
                    contrato.getId() + " | " + contrato.getPrazo()
            );
        }

        System.out.println();
        System.out.println("=== LISTA VAZIA ===");
        System.out.println(
                "ACEITO quantidade: "
                        + central.listarPorStatus(StatusContrato.ACEITO).size()
        );

        System.out.println();
        System.out.println("=== TOTAL ===");
        System.out.println(
                "ABERTO: "
                        + central.totalRecompensasPorStatus(StatusContrato.ABERTO)
        );

        System.out.println(
                "ACEITO: "
                        + central.totalRecompensasPorStatus(StatusContrato.ACEITO)
        );
    }
}