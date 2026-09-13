import java.math.BigDecimal;
import java.time.LocalDate;

public class BossBattleVBloco3Harness {

    public static void main(String[] args) throws TransicaoContratoException {

        System.out.println("=== CAMINHO NORMAL ===");

        ContratoGuilda contrato = novoContrato("CT-100");

        System.out.println("Inicial: " + contrato.getStatus());

        contrato.aceitar();
        System.out.println("Após aceitar: " + contrato.getStatus());

        contrato.concluir();
        System.out.println("Após concluir: " + contrato.getStatus());


        System.out.println();
        System.out.println("=== FALHA E INTEGRIDADE ===");

        try {
            contrato.cancelar();

            System.out.println("FAIL - contrato concluído foi cancelado");
        } catch (TransicaoContratoException e) {
            System.out.println("PASS - falha capturada: " + e.getMessage());
        }

        System.out.println(
                "Estado depois da falha: " + contrato.getStatus()
        );


        System.out.println();
        System.out.println("=== CANCELAMENTO DE ABERTO ===");

        ContratoGuilda aberto = novoContrato("CT-200");

        aberto.cancelar();

        System.out.println(
                "ABERTO -> " + aberto.getStatus()
        );


        System.out.println();
        System.out.println("=== CANCELAMENTO DE ACEITO ===");

        ContratoGuilda aceito = novoContrato("CT-300");

        aceito.aceitar();
        aceito.cancelar();

        System.out.println(
                "ACEITO -> " + aceito.getStatus()
        );
    }

    private static ContratoGuilda novoContrato(String id) {
        return new ContratoGuilda(
                id,
                "Contrato de teste",
                new Recompensa(new BigDecimal("100.00")),
                LocalDate.of(2026, 12, 1)
        );
    }
}