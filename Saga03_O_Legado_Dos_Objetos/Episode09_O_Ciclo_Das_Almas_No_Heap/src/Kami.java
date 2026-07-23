public class Kami extends Entidade{

    public Kami() {
        this("Kami Ancestral", 100);
        System.out.println("[Kami] Ritual padrão concluído.");
    }

    public Kami(String nome, int energia) {
        super(nome, energia);
        System.out.println("[Kami] Forma divina materializada.");
    }

    @Override
    public void manifestarPoder() {
        System.out.println(getNome() + " concede a Bênção da Aurora!\n");
    }
}
