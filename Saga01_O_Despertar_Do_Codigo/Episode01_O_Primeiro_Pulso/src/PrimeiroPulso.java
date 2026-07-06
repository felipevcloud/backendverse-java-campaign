public class PrimeiroPulso{
    public static void main(String[] args) {

        String name = "Varyon";
        int level = 1;

        System.out.println("=== Backendverse Academy ===");
        System.out.println();

        System.out.println("Aprendiz detectado: " + name);
        System.out.println("Nível inicial: " + level);
        System.out.println("Iniciando primeiro pulso do código...");
        System.out.println();

        for(int i = 1; i <= 3; i++){
            System.out.println("Pulso " + i + " carregado.");
        }
        System.out.println();

        if(level >= 1){
            System.out.println("Status: aprendiz autorizado a iniciar a campanha.");
        }
        else{
            System.out.println("Status: aprendiz não autorizado a iniciar a campanha.");
        }
        System.out.println();

        System.out.println("Episode 01 iniciado.\n" +
                "A jornada rumo ao título de Jonin Backend começou.");

    }
}