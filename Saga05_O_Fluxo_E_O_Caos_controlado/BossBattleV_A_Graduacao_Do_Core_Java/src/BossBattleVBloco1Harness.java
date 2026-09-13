import java.math.BigDecimal;
import java.time.LocalDate;

public class BossBattleVBloco1Harness {

    public static void main(String[] args) {
        CentralContratos central = new CentralContratos();

        ContratoGuilda contrato = new ContratoGuilda(
                "CT-001",
                "Caçar o Dragão de NullPointer",
                new Recompensa(new BigDecimal("125.555")),
                LocalDate.of(2026, 10, 15)
        );

        System.out.println("=== BLOCO 1 ===");
        System.out.println("ID: " + contrato.getId());
        System.out.println("Título: " + contrato.getTitulo());
        System.out.println("Recompensa: " + contrato.getRecompensa().valor());
        System.out.println("Status inicial: " + contrato.getStatus());

        System.out.println();
        System.out.println("Quantidade antes: " + central.quantidade());
        System.out.println("Existe CT-001 antes: " + central.existe("CT-001"));

        central.cadastrar(contrato);

        System.out.println("Quantidade depois: " + central.quantidade());
        System.out.println("Existe CT-001 depois: " + central.existe("CT-001"));

        System.out.println();
        testarInvalido("recompensa zero",
                () -> new Recompensa(BigDecimal.ZERO));

        testarInvalido("título em branco",
                () -> new ContratoGuilda(
                        "CT-002",
                        "   ",
                        new Recompensa(new BigDecimal("50")),
                        LocalDate.of(2026, 11, 1)
                ));
    }

    private static void testarInvalido(String nome, Runnable acao) {
        try {
            acao.run();
            System.out.println("FAIL - " + nome + " foi aceito");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS - " + nome + " foi rejeitado");
        }
    }
}