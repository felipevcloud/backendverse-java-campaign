public class SistemaGuilda {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Boss Battle II — O Primeiro Sistema da Guilda\n");

        AventureiroGuilda varyon = new AventureiroGuilda();
        AventureiroGuilda luna = new AventureiroGuilda();

        varyon.configurar("Varyon", "Especialista Java", 25);
        luna.configurar("Luna", "Estrategista de Lógica", 15);

        MissaoGuilda cacada = new MissaoGuilda();
        MissaoGuilda defesa = new MissaoGuilda();
        MissaoGuilda investigacao = new MissaoGuilda();
        MissaoGuilda cerco = new MissaoGuilda();

        cacada.configurar("Caçada ao Null Sombrio", "S", 30, 20);
        defesa.configurar("Defesa da Ponte de Loops", "A" , 20, 15);
        investigacao.configurar("Investigação do Array Perdido", "B", 10, 10);
        cerco.configurar("Cerco ao Servidor Fantasma", "C", 5, 5);

        QuadroGuilda missoes = new QuadroGuilda();
        System.out.println("Registrando missões...\n");
        missoes.adicionarMissao(cacada);
        missoes.adicionarMissao(defesa);
        missoes.adicionarMissao(investigacao);
        System.out.println("\nQuantidade inicial: " + missoes.consultarQuantidade() + "\n");
        System.out.println("=== Quadro da Guilda ===");
        missoes.listarMissoes();

        missoes.adicionarMissao(cerco);
        System.out.println("Quantidade atual: " + missoes.consultarQuantidade() + "\n");

        System.out.println("[Busca]");
        if(missoes.contemMissao("Caçada ao Null Sombrio")) {
            System.out.println("Caçada ao Null Sombrio encontrada");
        } else {
            System.out.println("Caçada ao Null Sombrio não encontrada");
        }
        if(missoes.contemMissao("Dragão do Spring")) {
            System.out.println("Dragão do Spring encontrada");
        } else {
            System.out.println("Dragão do Spring não encontrada");
        }
        System.out.println();

        System.out.println("[Tentativa de missão]");
        missoes.concluirMissao("Caçada ao Null Sombrio", varyon);
        System.out.println();

        System.out.println("[Descanso]");
        varyon.descansar(5);
        System.out.println();

        System.out.println("[Nova tentativa]");
        missoes.concluirMissao("Caçada ao Null Sombrio", varyon);
        System.out.println();
        missoes.concluirMissao("Cerco ao Servidor Fantasma", luna);
        System.out.println();

        System.out.println("[Remoção]");
        if(missoes.removerMissaoPorTitulo("Investigação do Array Perdido")) {
            System.out.println("Missão removida!");
        } else {
            System.out.println("Missão não encontrada.");
        }
        System.out.println();

        System.out.println("=== Relatório Final ===");
        System.out.println();
        System.out.println("Missões registradas: " + missoes.consultarQuantidade());
        System.out.println();
        varyon.mostrarFicha();
        System.out.println();
        luna.mostrarFicha();
        System.out.println();
        System.out.println("Boss Battle II concluída.\n" +
                "O primeiro sistema da Guilda foi validado.");
    }
}
