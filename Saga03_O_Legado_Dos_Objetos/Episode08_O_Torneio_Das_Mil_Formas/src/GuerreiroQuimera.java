public class GuerreiroQuimera extends Participante implements Transformavel {

    @Override
    public void transformar() {
        System.out.println(getNome() + " rompe o selo bestial!\n" +
                "Forma Quimera Prismática ativada!\n");
    }

    @Override
    public void executarTecnicaEspecial() {
        if (podeExecutarTecnicaEspecial()) {
            System.out.println("As garras prismáticas convergem: " + getTecnicaEspecial() + "!");
            consumirEnergiaTecnicaEspecial();
            System.out.println("Energia restante de " + getNome() + ": " + getEnergia() + "\n");
        } else {
            return;
        }
    }
}
