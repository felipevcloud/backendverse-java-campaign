public class InventarioDosCacadores {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 11 — O Inventário dos Caçadores");

        ItemDeCaca arco = new ItemDeCaca("IC-001", "Arco da Tempestade", "Arma", 380, 900.00);
        ItemDeCaca essencia = new ItemDeCaca("IC-002", "Essência de Dragão", "Material", 150, 320.00);
        ItemDeCaca grimorio = new ItemDeCaca("IC-003", "Grimório do Abismo", "Grimório", 620, 1500.00);
        ItemDeCaca lamina = new ItemDeCaca("IC-004", "Lâmina do Eclipse", "Arma", 480, 1100.00);
        ItemDeCaca fakeGrimorio = new ItemDeCaca("IC-003", "Grimório do Abismo", "Grimório", 620, 1500.00);
        ItemDeCaca fakeLamina = new ItemDeCaca("IC-004", "Lâmina do Eclipse", "Arma", 480, 1100.00);

        System.out.println("\n=== REGISTRO DAS RELÍQUIAS ===\n");

        InventarioDaGuilda inventario = new InventarioDaGuilda();

        inventario.registrarItem(arco);
        inventario.registrarItem(essencia);
        inventario.registrarItem(grimorio);
        inventario.registrarItem(lamina);
        inventario.registrarItem(fakeGrimorio);
        inventario.registrarItem(fakeLamina);
        inventario.registrarItem(null);

        System.out.println("\n=== CATÁLOGO ALFABÉTICO ===\n");

        inventario.apresentarCatalogoAlfabetico();

        System.out.println("\n=== RANKING DE PODER ===\n");

        inventario.apresentarRankingDePoder();

        System.out.println("\n=== QUANTIDADES ARMAZENADAS ==\n");

        inventario.apresentarQuantidades();

        System.out.println("\n=== RELATÓRIO FINAL ===\n");

        inventario.apresentarRelatorioFinal();

        System.out.println("\n=== FIM DO INVENTÁRIO ===\n" +
                "\n" +
                "Os registros da Guilda do Horizonte foram estabilizados.");

    }
}
