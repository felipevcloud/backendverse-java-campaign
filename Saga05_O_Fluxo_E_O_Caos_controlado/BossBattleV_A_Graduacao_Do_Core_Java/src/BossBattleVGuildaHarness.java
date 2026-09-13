import java.math.BigDecimal;
import java.time.LocalDate;

public class BossBattleVGuildaHarness {

    public static void main(String[] args) {

        CentralContratos central = new CentralContratos();
        QuadroAventureiros quadro = new QuadroAventureiros();

        Guilda guilda = new Guilda(central, quadro);

        Aventureiro arya = new Aventureiro(
                "AV-001",
                "Arya",
                Categoria.OURO,
                LocalDate.of(2024, 5, 10)
        );

        Aventureiro borin = new Aventureiro(
                "AV-002",
                "Borin",
                Categoria.PRATA,
                LocalDate.of(2025, 1, 20)
        );

        quadro.registrarAventureiro(arya);
        quadro.registrarAventureiro(borin);

        ContratoGuilda contrato1 = novoContrato(
                "CT-001",
                "Recuperar artefato"
        );

        ContratoGuilda contrato2 = novoContrato(
                "CT-002",
                "Escoltar caravana"
        );

        ContratoGuilda contrato3 = novoContrato(
                "CT-003",
                "Investigar ruínas"
        );

        central.cadastrar(contrato1);
        central.cadastrar(contrato2);
        central.cadastrar(contrato3);


        System.out.println("=== ATRIBUICAO VALIDA ===");

        guilda.atribuirAventureiro("CT-001", "AV-001");
        guilda.atribuirAventureiro("CT-002", "AV-001");

        System.out.println(
                "CT-001 responsável: "
                        + contrato1.getAventureiro()
                        .map(Aventureiro::nome)
                        .orElse("AUSENTE")
        );

        System.out.println(
                "CT-002 responsável: "
                        + contrato2.getAventureiro()
                        .map(Aventureiro::nome)
                        .orElse("AUSENTE")
        );


        System.out.println();
        System.out.println("=== CONTRATO INEXISTENTE ===");

        try {
            guilda.atribuirAventureiro("CT-999", "AV-001");
            System.out.println("FAIL - contrato inexistente foi aceito");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS - contrato inexistente foi rejeitado");
        }


        System.out.println();
        System.out.println("=== AVENTUREIRO INEXISTENTE ===");

        try {
            guilda.atribuirAventureiro("CT-003", "AV-999");
            System.out.println("FAIL - aventureiro inexistente foi aceito");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS - aventureiro inexistente foi rejeitado");
        }

        System.out.println(
                "CT-003 continua sem responsável: "
                        + contrato3.getAventureiro().isEmpty()
        );


        System.out.println();
        System.out.println("=== SEGUNDA ATRIBUICAO ===");

        try {
            guilda.atribuirAventureiro("CT-001", "AV-002");
            System.out.println("FAIL - responsável foi substituído");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS - segunda atribuição foi rejeitada");
        }

        System.out.println(
                "CT-001 ainda pertence a: "
                        + contrato1.getAventureiro()
                        .map(Aventureiro::nome)
                        .orElse("AUSENTE")
        );


        System.out.println();
        System.out.println("=== CONTRATOS DE ARYA ===");

        guilda.listarContratosDoAventureiro("AV-001")
                .forEach(contrato ->
                        System.out.println(contrato.getId())
                );


        System.out.println();
        System.out.println("=== BORIN SEM CONTRATOS ===");

        System.out.println(
                "Quantidade: "
                        + guilda.listarContratosDoAventureiro("AV-002").size()
        );


        System.out.println();
        System.out.println("=== AVENTUREIRO NAO REGISTRADO ===");

        try {
            guilda.listarContratosDoAventureiro("AV-999");
            System.out.println("FAIL - consulta de aventureiro inexistente foi aceita");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS - consulta inválida foi rejeitada");
        }
    }

    private static ContratoGuilda novoContrato(
            String id,
            String titulo
    ) {
        return new ContratoGuilda(
                id,
                titulo,
                new Recompensa(new BigDecimal("100.00")),
                LocalDate.of(2026, 12, 1)
        );
    }
}