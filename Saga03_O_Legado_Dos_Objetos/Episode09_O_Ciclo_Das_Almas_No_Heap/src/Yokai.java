public class Yokai extends Entidade {

    public Yokai(String nome, int energia) {
        super(nome, energia);
        System.out.println("[Yokai] Forma ilusória materializada.");
    }

    @Override
    public void manifestarPoder() {
        System.out.println(getNome() + " distorce os sentidos com o Labirinto das Ilusões!\n");
    }
}
