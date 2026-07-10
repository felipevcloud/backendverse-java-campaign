public class DojoTecnicas {
    public static void main(String[] args) {
        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 04 — O Despertar dos Métodos: Técnicas que Movem Objetos\n");

        AprendizTecnica varyon = new AprendizTecnica();
        varyon.definirDados("Varyon", "Java Strike");
        AprendizTecnica luna = new AprendizTecnica();
        luna.definirDados("Luna", "Logic Blow");

        System.out.println("Status inicial:");
        varyon.mostrarStatus();
        System.out.println();
        luna.mostrarStatus();
        System.out.println();

        varyon.treinar(10, 10);
        System.out.println();

        System.out.println("Verificação de treino:");
        if(varyon.podeTreinar(10)){
            System.out.println("Varyon ainda pode treinar.");
        } else {
            System.out.println("Varyon precisa descansar");
        }
        System.out.println();

        varyon.descansar(15);
        System.out.println();
        varyon.treinar(15, 5);
        System.out.println();

        System.out.println("Status final:");
        varyon.mostrarStatus();
        System.out.println();

        System.out.println("Dojo das Técnicas concluído com sucesso.");
    }
}
