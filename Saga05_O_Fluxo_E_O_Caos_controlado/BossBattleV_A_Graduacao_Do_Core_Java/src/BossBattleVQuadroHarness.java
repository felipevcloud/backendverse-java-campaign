import java.time.LocalDate;

public class BossBattleVQuadroHarness {

    public static void main(String[] args) {

        QuadroAventureiros quadro = new QuadroAventureiros();

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

        System.out.println("=== REGISTRO ===");
        System.out.println("Quantidade inicial: " + quadro.quantidade());

        quadro.registrarAventureiro(arya);
        quadro.registrarAventureiro(borin);

        System.out.println("Quantidade após registros: " + quadro.quantidade());


        System.out.println();
        System.out.println("=== BUSCA ===");

        System.out.println(
                "AV-001 presente: "
                        + quadro.buscarPorCodigo("AV-001").isPresent()
        );

        System.out.println(
                "AV-999 presente: "
                        + quadro.buscarPorCodigo("AV-999").isPresent()
        );


        System.out.println();
        System.out.println("=== DUPLICIDADE ===");

        try {
            quadro.registrarAventureiro(
                    new Aventureiro(
                            "AV-001",
                            "Clone da Arya",
                            Categoria.PLATINA,
                            LocalDate.of(2026, 1, 1)
                    )
            );

            System.out.println("FAIL - código duplicado foi aceito");

        } catch (IllegalArgumentException e) {
            System.out.println("PASS - código duplicado foi rejeitado");
        }

        System.out.println(
                "Quantidade depois da duplicidade: "
                        + quadro.quantidade()
        );

        System.out.println(
                "Nome preservado em AV-001: "
                        + quadro.buscarPorCodigo("AV-001")
                        .map(Aventureiro::nome)
                        .orElse("AUSENTE")
        );


        System.out.println();
        System.out.println("=== INVARIANTE DE NASCIMENTO ===");

        try {
            new Aventureiro(
                    "AV-003",
                    "   ",
                    Categoria.BRONZE,
                    LocalDate.of(2026, 3, 1)
            );

            System.out.println("FAIL - nome em branco foi aceito");

        } catch (IllegalArgumentException e) {
            System.out.println("PASS - nome em branco foi rejeitado");
        }
    }
}