public class ProvacaoDoArsenal {
    public static void main(String[] args) {

        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 05 — O Arsenal do Sensei: A Provação dos Cem Alvos\n");

        AlvoTreinamento madeira = new AlvoTreinamento();
        AlvoTreinamento ferro = new AlvoTreinamento();
        AlvoTreinamento amaldicoado = new AlvoTreinamento();

        madeira.configurar("Alvo de Madeira", 12);
        ferro.configurar("Alvo de Ferro", 18);
        amaldicoado.configurar("Alvo Amaldiçoado", 25);

        AlvoTreinamento[] alvos = new AlvoTreinamento[3];
        alvos[0] = madeira;
        alvos[1] = ferro;
        alvos[2] = amaldicoado;

        int[] arsenal = {4, 6, 8, 10};

        System.out.println("Status inicial:");
        System.out.println();

        for (AlvoTreinamento it : alvos) {
            it.mostrarStatus();
        }

        System.out.println("Iniciando provação...");
        System.out.println();

        int destruidos = 0;
        int ataques = 0;
        for (int i = 0; i < alvos.length; i++){
            System.out.println("Alvo " + i);
            int dmgcount = 0;
            while(alvos[i].estaDestruido() != true){
                System.out.println("Ataque de " + arsenal[dmgcount] + " pontos.");
                alvos[i].receberAtaque(arsenal[dmgcount]);
                System.out.println("Resistência restante: " + alvos[i].consultarResistencia() + "\n");
                dmgcount++;
                ataques++;
            }
            destruidos++;
            System.out.println("Alvo destruído após " + dmgcount + " ataques.\n");
        }

        System.out.println("=== Relatório Final ===");
        System.out.println("Alvos destruídos: " + destruidos);
        System.out.println("Ataques executados: " + ataques);
        System.out.println();

        System.out.println("Status final:");
        System.out.println("Alvo de Madeira — Destruído\n" +
                "Alvo de Ferro — Destruído\n" +
                "Alvo Amaldiçoado — Destruído\n");
        System.out.println("Provação do Arsenal concluída com sucesso.");
    }
}
