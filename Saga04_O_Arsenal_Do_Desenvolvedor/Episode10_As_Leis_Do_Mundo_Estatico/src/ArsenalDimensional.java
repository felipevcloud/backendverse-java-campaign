public class ArsenalDimensional {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 10 — As Leis do Mundo Estático\n");

        System.out.println("=== LEITURA DOS REGISTROS DIMENSIONAIS ===\n");

        System.out.println("Poderes e multiplicadores convertidos com sucesso.\n");

        System.out.println("=== CRIAÇÃO DOS ARTEFATOS ===\n");

        Artefato lamina = new Artefato("Lâmina do Eclipse", Integer.parseInt("420"), Double.parseDouble("1.50"));
        Artefato orbe = new Artefato("Orbe do Vazio", Integer.parseInt("780"), Double.parseDouble("1.40"));
        Artefato arco = new Artefato("Arco da Aurora", Integer.parseInt("250"), Double.parseDouble("1.25"));

        System.out.println("\n=== REGISTRO NO ARSENAL ===\n");

        RegistroDoArsenal registro = new RegistroDoArsenal();
        registro.registrarArtefato(lamina);
        registro.registrarArtefato(orbe);
        registro.registrarArtefato(arco);

        System.out.println("\n=== CATÁLOGO DIMENSIONAL ===\n");

        registro.calcularPoderesFinais();
        registro.apresentarCatalogo();
        System.out.println("=== RELATÓRIO FINAL ===\n");
        registro.apresentarRelatorioFinal();
        System.out.println("\n=== FIM DO REGISTRO ===\n" +
                "\n" +
                "As leis estáticas do Arsenal Dimensional foram estabilizadas.");
    }
}
