public class OraculoAstral extends Participante implements Invocador {

    @Override
    public void invocar() {
        System.out.println(getNome() + " abre o Portal das Constelações!\n" +
                "O Guardião de Órion foi invocado!\n");
    }

    @Override
    public void executarTecnicaEspecial() {
        if (podeExecutarTecnicaEspecial()) {
            System.out.println("As constelações respondem: " + getTecnicaEspecial() + "!");
            consumirEnergiaTecnicaEspecial();
            System.out.println("Energia restante de " + getNome() + ": " + getEnergia() + "\n");
        } else {
            return;
        }
    }
}
