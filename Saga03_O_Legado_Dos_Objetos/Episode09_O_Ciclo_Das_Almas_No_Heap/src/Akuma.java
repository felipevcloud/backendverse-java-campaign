public class Akuma extends Entidade {

    public Akuma(String nome, int energia) {
        super(nome, energia);
        System.out.println("[Akuma] Forma sombria materializada.");
    }

    @Override
    public void manifestarPoder() {
        System.out.println(getNome() + " espalha a Maldição das Sombras Eternas!\n");
    }
}
