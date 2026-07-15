public class TesteSistemaGuilda {
    public static void main(String[] args) {

        System.out.println("=== Testes do Sistema da Guilda ===\n");
        QuadroGuilda quadroTeste = new QuadroGuilda();
        MissaoGuilda missaoTeste = new MissaoGuilda();
        MissaoGuilda missaoNull = null;
        AventureiroGuilda aventureiroTeste = new AventureiroGuilda();

        missaoTeste.configurar("Teste", "Teste", 2, 1);
        quadroTeste.adicionarMissao(missaoTeste);
        if(quadroTeste.consultarQuantidade() == 1) {
            System.out.println("[PASS] Missão adicionada corretamente.");
        } else {
            System.out.println("[FAIL] Missão não foi adicionada corretamente.");
        }

        quadroTeste.adicionarMissao(missaoNull);
        if(quadroTeste.consultarQuantidade() == 1) {
            System.out.println("[PASS] Referência null foi rejeitada.");
        } else {
            System.out.println("[FAIL] Referência null não foi rejeitada.");
        }

        if(quadroTeste.contemMissao("Teste")) {
            System.out.println("[PASS] Missão existente foi encontrada.");
        } else {
            System.out.println("[FAIL] Missão existente não foi encontrada.");
        }

        if(!quadroTeste.contemMissao("missao")) {
            System.out.println("[PASS] Missão inexistente não foi encontrada.");
        } else {
            System.out.println("[FAIL] Missão inexistente foi encontrada.");
        }

        aventureiroTeste.configurar("Teste", "Teste", 2);
        if(!quadroTeste.concluirMissao("Teste", aventureiroTeste) && missaoTeste.estaDisponivel() && aventureiroTeste.consultarExperiencia() == 0) {
            System.out.println("[PASS] Missão foi recusada por energia insuficiente.");
            System.out.println("[PASS] Missão permaneceu disponível.");
        } else {
            System.out.println("[FAIL] Missão não foi recusada por energia insuficiente.");
            System.out.println("[FAIL] Missão não permaneceu disponível.");
        }

        aventureiroTeste.descansar(5);
        if(quadroTeste.concluirMissao("Teste", aventureiroTeste) && !missaoTeste.estaDisponivel() && aventureiroTeste.consultarExperiencia() == 1) {
            System.out.println("[PASS] Missão foi concluída após o descanso.");
            System.out.println("[PASS] Energia e experiência foram atualizadas.");
        } else {
            System.out.println("[FAIL] Missão não foi concluída após o descanso.");
            System.out.println("[FAIL] Energia e experiência não foram atualizadas.");
        }

        quadroTeste.removerMissaoPorTitulo("Teste");
        if(quadroTeste.consultarQuantidade() == 0) {
            System.out.println("[PASS] Missão foi removida pelo título.");
        } else {
            System.out.println("[FAIL] Missão não foi removida pelo título.");
        }

        System.out.println();
        System.out.println("Testes concluídos.");
    }
}



