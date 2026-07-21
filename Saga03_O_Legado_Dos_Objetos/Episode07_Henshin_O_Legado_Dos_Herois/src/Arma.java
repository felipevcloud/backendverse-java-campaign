public class Arma extends Equipamento{

    public void usar() {
        System.out.println(getNome() + " utilizada com nível de poder " + getNivelPoder() + "!");
        System.out.println();
    }

}
