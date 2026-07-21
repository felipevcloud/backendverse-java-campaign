public class Rider extends Combatente{

    @Override
    public void transformar() {
        getDispositivoTransformacao().ativar();
        System.out.println("HENSHIN!");
        System.out.println("A armadura sombria envolve " + getCodinome());
        setTransformado(true);
        System.out.println();
    }

    @Override
    public void executarGolpeFinal() {
        if(podeExecutarGolpeFinal()) {
            System.out.println("RIDER KICK - IMPACTO ECLIPSE");
            consumirEnergiaGolpeFinal();
            System.out.println("Energia restante de " + getCodinome() + ": " + getEnergia());
            System.out.println();
        }
    }
}
