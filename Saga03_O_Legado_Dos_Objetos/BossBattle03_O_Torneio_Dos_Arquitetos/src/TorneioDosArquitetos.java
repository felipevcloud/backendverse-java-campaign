public class TorneioDosArquitetos {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Boss Battle III — O Torneio dos Arquitetos\n");

        System.out.println("=== MATERIALIZAÇÃO DOS PROJETOS ===\n");

        FortalezaAegis prime = new FortalezaAegis();

        NucleoArquitetonico arc = new NucleoArquitetonico("Matriz Nexus", 55);
        CidadeNexus arcadia = new CidadeNexus("Nova Arcádia", "Lina Vector", 85, arc, "Rede de Expansão Modular", 30);

        NucleoArquitetonico prs = new NucleoArquitetonico("Prisma Central", 70);
        BastiaoPrismatico bastiao = new BastiaoPrismatico("Bastião Prismático", "Orion Kaleido", 120, prs, "Domínio Prismático", 45);

        System.out.println("=== REGISTRO NO CONSELHO ===\n");

        ConselhoDosArquitetos conselho = new ConselhoDosArquitetos();
        conselho.registrarConstrucao(prime);
        conselho.registrarConstrucao(arcadia);
        conselho.registrarConstrucao(bastiao);

        conselho.registrarDefensora(prime);
        conselho.registrarDefensora(bastiao);

        conselho.registrarExpansora(arcadia);
        conselho.registrarExpansora(bastiao);

        System.out.println("\n=== PROJETOS APRESENTADOS ===\n");
        conselho.apresentarProjetos();

        System.out.println("=== ATIVAÇÃO DOS SISTEMAS PRINCIPAIS ===\n");
        conselho.ordenarAtivacoes();

        System.out.println("=== SISTEMAS DEFENSIVOS ===\n");
        conselho.coordenarDefesas();

        System.out.println("\n=== SISTEMAS DE EXPANSÃO ===\n");
        conselho.coordenarExpansoes();

        System.out.println("\n=== PROVA DE RESISTÊNCIA ENERGÉTICA ===\n");
        bastiao.ativarSistemaPrincipal();

        System.out.println("\n=== RETIRADA DE PROJETO ===\n");
        conselho.removerConstrucao(arcadia);

        System.out.println("\n=== RELATÓRIO FINAL ===\n");
        conselho.apresentarRelatorioFinal();

        System.out.println("\n=== FIM DO TORNEIO ===\n");
        System.out.println("O Conselho reconheceu os arquitetos capazes de construir para o Backendverse.");
    }
}
