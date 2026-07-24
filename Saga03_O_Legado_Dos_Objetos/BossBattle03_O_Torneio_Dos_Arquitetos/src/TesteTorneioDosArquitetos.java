public class TesteTorneioDosArquitetos {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Boss Battle III — Testes do Torneio dos Arquitetos\n");

        NucleoArquitetonico nucleo = new NucleoArquitetonico("", -10);
        if (nucleo.getIdentificacao().equals("Núcleo Desconhecido") && nucleo.getEnergia() == 1) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        FortalezaAegis fort = new FortalezaAegis();
        if (fort.getNome().equals("Fortaleza Aegis Prime") && fort.getArquiteto().equals("Mestre Atlas") && fort.getIntegridade() == 100 && fort.getNucleo().getEnergia() == 60 && fort.getCustoAtivacao() == 15) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        ConselhoDosArquitetos conselho = new ConselhoDosArquitetos();

        if (conselho.registrarConstrucao(fort)) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (!conselho.registrarConstrucao(null)) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (conselho.quantidadeDeConstrucoes() == 1) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (fort.ativarSistemaPrincipal()) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (fort.getNucleo().getEnergia() == 45) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        FortalezaAegis test = new FortalezaAegis("test", "test", 100, new NucleoArquitetonico("test", 10), "test", 15);

        if (!test.ativarSistemaPrincipal()) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (test.getNucleo().getEnergia() == 10) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (conselho.removerConstrucao(fort)) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (conselho.quantidadeDeConstrucoes() == 0) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        if (!conselho.removerConstrucao(fort)) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        Construcao projeto = new FortalezaAegis("test", "test", 100, new NucleoArquitetonico("test", 10), "test", 5);

        if (projeto.ativarSistemaPrincipal()) {
            System.out.println("[PASS]");
        } else {
            System.out.println("[FAIL]");
        }

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
