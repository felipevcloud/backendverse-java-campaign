public class LaboratorioHeap {
    public static void main(String[] args) {

        System.out.println("=== Backendverse Academy ===\n" +
                "Episode 03 — O Chakra das Referências: Ecos do Heap");
        System.out.println();

        System.out.println("[Primitivos]");
        int nivelOriginal = 5;
        int nivelCopia = nivelOriginal;
        nivelCopia = 3;
        System.out.println("Nível original: " + nivelOriginal);
        System.out.println("Nível cópia: " + nivelCopia);
        System.out.println();

        System.out.println("[Referências]");
        AprendizChakra varyon = new AprendizChakra();
        varyon.nome = "Varyon";
        varyon.tecnica = "Java Shadow Clone";
        varyon.nivel = 3;
        AprendizChakra sombra = varyon;
        sombra.nivel = 4;
        System.out.println("Ficha de referência original:");
        varyon.mostrarFicha();
        System.out.println();
        System.out.println("Ficha de referência sombra:");
        sombra.mostrarFicha();
        System.out.println();

        System.out.println("[Array de Primitivos]");
        int[] chakra = {10, 20, 30};
        for(int i = 0; i < chakra.length; i++) {
            System.out.println("Chakra " + (i + 1) + ": " + chakra[i]);
        }
        System.out.println();

        System.out.println("[Array de Objetos]");
        AprendizChakra[] aprendizes = new AprendizChakra[3];
        AprendizChakra varyonArray = new AprendizChakra();
        varyonArray.nome = "Varyon";
        varyonArray.tecnica = "Java";
        varyonArray.nivel = 3;
        AprendizChakra luna = new AprendizChakra();
        luna.nome = "Luna";
        luna.tecnica = "Lógica";
        luna.nivel = 2;
        aprendizes[0] = varyonArray;
        aprendizes[1] = luna;
        for(int i = 0; i < aprendizes.length; i++) {
            if(aprendizes[i] != null){
                System.out.println("Slot " + i + " ocupado:");
                aprendizes[i].mostrarFicha();
                System.out.println();
            } else {
                System.out.println("Slot " + i + " vazio detectado.");
                System.out.println();
            }
        }

        System.out.println("[Null]");
        AprendizChakra vazio = null;
        if(vazio == null) {
            System.out.println("Nenhum aprendiz vinculado à referência perdida.");
        }
        System.out.println();

        System.out.println("Câmara do Heap concluída com sucesso.");

    }
}
