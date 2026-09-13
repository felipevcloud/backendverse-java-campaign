import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class BossBattleVFinalHarness {

    private static int pass = 0;
    private static int fail = 0;

    public static void main(String[] args) throws TransicaoContratoException {

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

        ContratoGuilda c1 = contrato(
                "CT-001",
                "Recuperar artefato",
                "100.00",
                LocalDate.of(2026, 10, 1)
        );

        ContratoGuilda c2 = contrato(
                "CT-002",
                "Escoltar caravana",
                "250.50",
                LocalDate.of(2026, 10, 1)
        );

        ContratoGuilda c3 = contrato(
                "CT-003",
                "Eliminar slime alfa",
                "49.50",
                LocalDate.of(2026, 9, 20)
        );

        central.cadastrar(c1);
        central.cadastrar(c2);
        central.cadastrar(c3);


        System.out.println("=== VALORES E INVARIANTES ===");

        Recompensa arredondada =
                new Recompensa(new BigDecimal("125.555"));

        check(
                arredondada.valor()
                        .compareTo(new BigDecimal("125.56")) == 0,
                "BigDecimal arredondado corretamente"
        );


        System.out.println();
        System.out.println("=== OPTIONAL ===");

        check(
                central.buscarPorId("CT-001").isPresent(),
                "busca existente retorna presente"
        );

        check(
                central.buscarPorId("CT-999").isEmpty(),
                "busca inexistente retorna vazio"
        );


        System.out.println();
        System.out.println("=== STREAMS E ORDENACAO ===");

        List<ContratoGuilda> abertos =
                central.listarPorStatus(StatusContrato.ABERTO);

        check(
                abertos.size() == 3,
                "três contratos abertos"
        );

        check(
                abertos.get(0).getId().equals("CT-003")
                        && abertos.get(1).getId().equals("CT-001")
                        && abertos.get(2).getId().equals("CT-002"),
                "prazo e desempate por id"
        );

        check(
                central.totalRecompensasPorStatus(StatusContrato.ABERTO)
                        .compareTo(new BigDecimal("400.00")) == 0,
                "reduce soma recompensas"
        );


        System.out.println();
        System.out.println("=== ASSOCIACAO ===");

        guilda.atribuirAventureiro("CT-001", "AV-001");
        guilda.atribuirAventureiro("CT-002", "AV-001");

        check(
                c1.getAventureiro()
                        .map(Aventureiro::codigo)
                        .orElse("")
                        .equals("AV-001"),
                "responsável atribuído"
        );

        check(
                c3.getAventureiro().isEmpty(),
                "ausência de responsável explícita"
        );

        check(
                guilda.listarContratosDoAventureiro("AV-001").size() == 2,
                "consulta contratos de Arya"
        );

        check(
                guilda.listarContratosDoAventureiro("AV-002").isEmpty(),
                "aventureiro registrado sem contratos"
        );


        System.out.println();
        System.out.println("=== ADVERSARIAL ===");

        try {
            guilda.atribuirAventureiro("CT-001", "AV-002");
            fail("segunda atribuição deveria falhar");

        } catch (IllegalArgumentException e) {
            check(
                    c1.getAventureiro()
                            .map(Aventureiro::codigo)
                            .orElse("")
                            .equals("AV-001"),
                    "falha não substitui responsável"
            );
        }


        try {
            guilda.atribuirAventureiro("CT-003", "AV-999");
            fail("aventureiro inexistente deveria falhar");

        } catch (IllegalArgumentException e) {
            check(
                    c3.getAventureiro().isEmpty(),
                    "falha mantém contrato sem responsável"
            );
        }


        System.out.println();
        System.out.println("=== TRANSICOES E INTEGRIDADE ===");

        c1.aceitar();
        c1.concluir();

        check(
                c1.getStatus() == StatusContrato.CONCLUIDO,
                "ABERTO -> ACEITO -> CONCLUIDO"
        );

        try {
            c1.cancelar();
            fail("CONCLUIDO -> CANCELADO deveria falhar");

        } catch (TransicaoContratoException e) {
            check(
                    c1.getStatus() == StatusContrato.CONCLUIDO,
                    "exception preserva estado concluído"
            );
        }


        System.out.println();
        System.out.println("==============================");
        System.out.println("PASS: " + pass);
        System.out.println("FAIL: " + fail);
        System.out.println("==============================");

        if (fail > 0) {
            throw new AssertionError(
                    "Boss Battle V falhou em " + fail + " verificação(ões)"
            );
        }

        System.out.println(
                quadro.nomeOuPadrao("AV-001", "DESCONHECIDO")
        );

        System.out.println(
                quadro.nomeOuPadrao("AV-999", "DESCONHECIDO")
        );
    }

    private static ContratoGuilda contrato(
            String id,
            String titulo,
            String recompensa,
            LocalDate prazo
    ) {
        return new ContratoGuilda(
                id,
                titulo,
                new Recompensa(new BigDecimal(recompensa)),
                prazo
        );
    }

    private static void check(boolean condicao, String descricao) {
        if (condicao) {
            pass++;
            System.out.println("PASS - " + descricao);
        } else {
            fail++;
            System.out.println("FAIL - " + descricao);
        }
    }

    private static void fail(String descricao) {
        fail++;
        System.out.println("FAIL - " + descricao);
    }
}