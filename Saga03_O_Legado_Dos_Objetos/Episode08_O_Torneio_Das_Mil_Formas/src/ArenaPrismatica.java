public class ArenaPrismatica {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 08 — O Torneio das Mil Formas\n");

        GuerreiroQuimera kael = new GuerreiroQuimera();
        OraculoAstral lyra = new OraculoAstral();
        SoberanoEclipse nox = new SoberanoEclipse();

        kael.setNome("Kael Quimera");
        kael.setEnergia(70);
        kael.setTecnicaEspecial("RUPTURA QUIMÉRICA");
        kael.setCustoTecnicaEspecial(30);

        lyra.setNome("Lyra Astral");
        lyra.setEnergia(20);
        lyra.setTecnicaEspecial("JULGAMENTO CELESTIAL");
        lyra.setCustoTecnicaEspecial(35);

        nox.setNome("Nox Eclipse");
        nox.setEnergia(90);
        nox.setTecnicaEspecial("CATACLISMO DO ECLIPSE");
        nox.setCustoTecnicaEspecial(45);

        ConselhoPrismatico conselho = new ConselhoPrismatico();

        conselho.adicionarParticipante(kael);
        conselho.adicionarParticipante(lyra);
        conselho.adicionarParticipante(nox);

        conselho.adicionarTransformavel(kael);
        conselho.adicionarTransformavel(nox);

        conselho.adicionarInvocador(lyra);
        conselho.adicionarInvocador(nox);

        System.out.println("=== FORMAÇÃO DO TORNEIO ===\n");
        conselho.apresentarFormacao();

        System.out.println("=== TRANSFORMAÇÕES ===\n");
        conselho.coordenarTransformacoes();

        System.out.println("=== INVOCAÇÕES ===\n");
        conselho.coordenarInvocacoes();

        System.out.println("=== TÉCNICAS ESPECIAIS ===\n");
        conselho.ordenarTecnicasEspeciais();

        System.out.println("=== RELATÓRIO FINAL ===\n");
        conselho.apresentarRelatorioFinal();

        System.out.println("=== FIM DO TORNEIO ===\n");
        System.out.println("O Torneio das Mil Formas foi encerrado!");

    }
}
