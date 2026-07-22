public class SoberanoEclipse extends Participante implements Transformavel, Invocador {

    @Override
    public void transformar() {
        System.out.println(getNome() + " é envolvido por luz e sombras!\n" +
                "Forma do Eclipse Total ativada!\n");
    }

    @Override
    public void invocar() {
        System.out.println(getNome() + " rompe a fronteira do vazio!\n" +
                "A Serpente Umbral foi invocada!\n");
    }

    @Override
    public void executarTecnicaEspecial() {
        if (podeExecutarTecnicaEspecial()) {
            System.out.println("Luz e sombra colidem: " + getTecnicaEspecial() + "!");
            consumirEnergiaTecnicaEspecial();
            System.out.println("Energia restante de " + getNome() + ": " + getEnergia() + "\n");
        } else {
            return;
        }
    }
}
