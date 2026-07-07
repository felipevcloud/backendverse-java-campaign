public class AcademiaBackend {
    public static void main(String[] args) {

        System.out.println("=== Backendverse Academy ===\n" + "Episode 02 — A Cidade dos Objetos\n");

        AprendizBackend varyon = new AprendizBackend();
        varyon.nome = "Varyon";
        varyon.especialidade = "Java";
        varyon.nivel = 2;

        AprendizBackend luna = new AprendizBackend();
        luna.nome = "Luna";
        luna.especialidade = "Html";
        luna.nivel = 1;

        varyon.apresentar();
        varyon.mostrarStatus();

        System.out.println();

        luna.apresentar();
        luna.mostrarStatus();

        System.out.println();

        System.out.println("Cidade dos Objetos acessada com sucesso.");
    }
}
