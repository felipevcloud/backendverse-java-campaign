public class RitualDasAlmasDigitais {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 09 — O Ciclo das Almas no Heap\n");

        System.out.println("=== MATERIALIZAÇÃO DAS ALMAS ===\n");
        Entidade kami = new Kami();
        System.out.println();
        Entidade amaterasu = new Kami("Amaterasu", 140);
        System.out.println();
        Entidade kitsune = new Yokai("Kitsune do Espelho", 65);
        System.out.println();
        Entidade akuma = new Akuma("", -40);
        System.out.println();

        System.out.println("=== VÍNCULO COM O SANTUÁRIO ===\n");
        SantuarioDasAlmas santuario = new SantuarioDasAlmas();

        santuario.registrarEntidade(kami);
        santuario.registrarEntidade(amaterasu);
        santuario.registrarEntidade(kitsune);
        santuario.registrarEntidade(akuma);
        System.out.println();

        System.out.println("=== ENTIDADES MATERIALIZADAS ===\n");
        santuario.apresentarEntidades();

        System.out.println("=== MANIFESTAÇÕES ESPIRITUAIS ===\n");
        santuario.ordenarManifestacoes();

        System.out.println("=== CICLO DE VIDA NO HEAP ===\n");

        System.out.println("Kitsune do Espelho possui uma referência local e uma referência mantida pelo santuário.\n");
        santuario.desvincularEntidade(kitsune);
        System.out.println("A referência do santuário foi removida, mas a variável local ainda alcança o objeto.\n");
        kitsune = null;
        System.out.println("A última referência controlada pelo programa foi removida.\n" +
                "Kitsune do Espelho agora está elegível para coleta.\n" +
                "Isso não significa que o objeto foi destruído imediatamente.\n");

        System.out.println("=== RELATÓRIO FINAL ===\n");
        santuario.apresentarRelatorioFinal();

        System.out.println("\n=== FIM DO RITUAL ===\n");
        System.out.println("O Santuário das Almas Digitais concluiu o ciclo de materialização.");
    }
}
