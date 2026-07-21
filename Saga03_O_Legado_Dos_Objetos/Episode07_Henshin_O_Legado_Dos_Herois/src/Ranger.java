public class Ranger extends Combatente{

    @Override
    public void transformar() {
        getDispositivoTransformacao().ativar();
        System.out.println("GOKAI CHANGE!");
        System.out.println(getCodinome() + " assume sua forma escarlate!");
        setTransformado(true);
        System.out.println();
    }

    @Override
    public void executarGolpeFinal() {
        if(podeExecutarGolpeFinal()) {
            System.out.println("FINAL WAVE — CORTE DA FÊNIX ESCARLATE!");
            consumirEnergiaGolpeFinal();
            System.out.println("Energia restante de " + getCodinome() + ": " + getEnergia());
            System.out.println();
        }
    }
}
