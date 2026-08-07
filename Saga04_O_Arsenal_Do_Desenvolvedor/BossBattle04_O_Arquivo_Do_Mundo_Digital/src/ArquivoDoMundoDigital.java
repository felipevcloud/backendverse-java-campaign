public class ArquivoDoMundoDigital {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Boss Battle IV — O Arquivo do Mundo Digital\n");
        System.out.println("=== REGISTROS DO ARQUIVO DIGITAL ===\n");

        Digimon wargreymon = new Digimon("DG-004", "WarGreymon", "Guerreiro Dragão", 900, 1800);
        Digimon agumon = new Digimon("DG-001", "Agumon", "Réptil", 120, 300);
        Digimon metalgreymon = new Digimon("DG-003", "MetalGreymon", "Ciborgue", 650, 1200);
        Digimon angewomon = new Digimon("DG-005", "Angewomon", "Anjo", 700, 1500);
        Digimon greymon = new Digimon("DG-002", "Greymon", "Dinossauro", 300, 700);
        Digimon metalgreymon2 = new Digimon("DG-003", "MetalGreymon", "Ciborgue", 650, 1200);
        Digimon wargreymon2 = new Digimon("DG-004", "WarGreymon", "Guerreiro Dragão", 900, 1800);

        ArquivoDigital arquivoDigital = new ArquivoDigital();

        arquivoDigital.registrarDigimon(wargreymon);
        arquivoDigital.registrarDigimon(agumon);
        arquivoDigital.registrarDigimon(metalgreymon);
        arquivoDigital.registrarDigimon(angewomon);
        arquivoDigital.registrarDigimon(greymon);
        arquivoDigital.registrarDigimon(metalgreymon2);
        arquivoDigital.registrarDigimon(wargreymon2);
        arquivoDigital.registrarDigimon(null);

        System.out.println("\n=== BUSCA POR CÓDIGO ===\n");

        System.out.println("DG-003: \n" + arquivoDigital.buscarPorCodigo("DG-003").getNome());
        System.out.println("DG-999: \n" + arquivoDigital.buscarPorCodigo("DG-999"));

        System.out.println("\n=== BUSCA POR NOME ===\n");

        System.out.println("Termo: greymon\n");

        for (Digimon digimon : arquivoDigital.buscarPorNome("greymon")) {
            System.out.println(digimon.getNome());
        }

        System.out.println("\n=== CATÁLOGO DIGITAL ===\n");

        arquivoDigital.apresentarCatalogo();

        System.out.println("\n=== AVISTAMENTOS ===\n");

        arquivoDigital.apresentarAvistamentos();

        System.out.println("\n=== RELATÓRIO FINAL ===\n");

        arquivoDigital.apresentarRelatorioFinal();

        System.out.println("=== FIM DO ARQUIVO ===\n" +
                "\n" +
                "Os registros do Mundo Digital foram restaurados.");
    }
}
