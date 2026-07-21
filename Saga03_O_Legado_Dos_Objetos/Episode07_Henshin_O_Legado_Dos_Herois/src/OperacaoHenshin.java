public class OperacaoHenshin {
    public static void main(String[] args) {

        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 07 — Henshin! O Legado dos Hérois\n");

        Arma armaRider = new Arma();
        Arma armaRanger = new Arma();

        armaRider.setNome("Lâmina Eclipse");
        armaRider.setNivelPoder(35);

        armaRanger.setNome("Sabre Fênix");
        armaRanger.setNivelPoder(15);

        DispositivoTransformacao driver = new DispositivoTransformacao();
        DispositivoTransformacao morpher = new DispositivoTransformacao();

        driver.setNome("Eclipse Driver");
        morpher.setNome("Morfador Fênix");

        Rider rider = new Rider();
        Ranger ranger = new Ranger();

        rider.setCodinome("Rider Eclipse");
        rider.setEnergia(80);
        rider.setCustoGolpeFinal(30);
        rider.setArmaPrincipal(armaRider);
        rider.setDispositivoTransformacao(driver);

        ranger.setCodinome("Ranger Fênix");
        ranger.setEnergia(40);
        ranger.setCustoGolpeFinal(30);
        ranger.setArmaPrincipal(armaRanger);
        ranger.setDispositivoTransformacao(morpher);

        AgenciaVertice agenciaVertice = new AgenciaVertice();
        agenciaVertice.adicionarCombatente(rider);
        agenciaVertice.adicionarCombatente(ranger);

        System.out.println("=== TESTE INICIAL ===");
        rider.executarGolpeFinal();
        System.out.println();

        System.out.println("=== FORMAÇÃO DA AGÊNCIA VÉRTICE ===\n");
        agenciaVertice.apresentarFormacao();
        System.out.println();

        System.out.println("=== TRANSFORMAÇÃO ===\n");
        agenciaVertice.transformarTodos();
        System.out.println();

        System.out.println("=== ATAQUES ===\n");
        agenciaVertice.ordenarAtaques();
        System.out.println();

        System.out.println("=== GOLPES FINAIS ===\n");
        agenciaVertice.ordenarGolpesFinais();
        agenciaVertice.ordenarGolpesFinais();
        System.out.println();

        System.out.println("=== FIM DA OPERAÇÃO ===\n");
        agenciaVertice.desfazerTransformacoes();
    }
}
