public class ArquivoDosSabios {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 06 — A Biblioteca dos Sábios: O Grimório Infinito\n");
        System.out.println("Registrando técnicas...\n");

        TecnicaRegistrada impact = new TecnicaRegistrada();
        TecnicaRegistrada infinite = new TecnicaRegistrada();
        TecnicaRegistrada barrier = new TecnicaRegistrada();
        TecnicaRegistrada strike = new TecnicaRegistrada();

        impact.definirDados("Java Impact", "Ataque", 15);
        infinite.definirDados("Loop Infinito", "Defesa", 12);
        barrier.definirDados("Barreira de Null", "Controle", 18);
        strike.definirDados("Golpe do ArrayList", "Ataque", 20);

        BibliotecaTecnicas biblioteca = new BibliotecaTecnicas();
        biblioteca.adicionarTecnica(impact);
        biblioteca.adicionarTecnica(barrier);
        biblioteca.adicionarTecnica(infinite);

        System.out.println();
        System.out.println("Quantidade registrada: " + biblioteca.consultarQuantidade());
        System.out.println();

        System.out.println("=== Técnicas do Grimório ===\n");
        biblioteca.listarTecnicas();

        System.out.println("[Busca]");
        if (biblioteca.contemTecnica("Java Impact")) {
            System.out.println("Java Impact foi encontrada.");
        } else {
            System.out.println("Java Impact não foi encontrada.");
        }

        if (biblioteca.contemTecnica("Técnica Proibida")) {
            System.out.println("Técnica Proibida foi encontrada.");
        } else {
            System.out.println("Técnica Proibida não foi encontrada.");
        }
        System.out.println();

        biblioteca.adicionarTecnica(strike);
        System.out.println("Quantidade registrada: " + biblioteca.consultarQuantidade());
        System.out.println();

        System.out.println("[Remoção]");
        if (biblioteca.removerTecnicaPorNome("Loop Infinito")) {
            System.out.println("Loop Infinito foi removida.");
        } else {
            System.out.println("Loop Infinito não foi removida.");
        }
        System.out.println();

        System.out.println("[Consulta por posição]");
        biblioteca.mostrarTecnicaNaPosicao(0);
        biblioteca.mostrarTecnicaNaPosicao(20);

        System.out.println("=== Relatório Final ===");
        System.out.println("Quantidade de técnicas: " + biblioteca.consultarQuantidade());
        System.out.println();
        biblioteca.listarTecnicas();
        System.out.println("Biblioteca dos Sábios atualizada com sucesso.");
    }
}
