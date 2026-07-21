public class Combatente {

    private String codinome;
    private int energia;
    private int custoGolpeFinal;
    private boolean transformado = false;
    private Arma armaPrincipal;
    private DispositivoTransformacao dispositivoTransformacao;

    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isTransformado() {
        return transformado;
    }

    public void setTransformado(boolean transformado) {
        this.transformado = transformado;
    }

    public int getCustoGolpeFinal() {
        return custoGolpeFinal;
    }

    public void setCustoGolpeFinal(int custoGolpeFinal) {
        this.custoGolpeFinal = custoGolpeFinal;
    }

    public Arma getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(Arma armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public DispositivoTransformacao getDispositivoTransformacao() {
        return dispositivoTransformacao;
    }

    public void setDispositivoTransformacao(DispositivoTransformacao dispositivoTransformacao) {
        this.dispositivoTransformacao = dispositivoTransformacao;
    }

    public void apresentar() {
        System.out.println("Combatente: " + codinome);
        System.out.println("Energia: " + energia);
        System.out.println("Arma: " + armaPrincipal.getNome());
        System.out.println("Dispositivo: " + dispositivoTransformacao.getNome());
        System.out.println();
    }

    public void atacar() {
        System.out.println(codinome + " inicia o ataque!");
        armaPrincipal.usar();
    }

    public void desfazerTransformacao() {
        transformado = false;
        System.out.println(codinome + " desfez sua transformação.");
        System.out.println();
    }

    public void transformar() {}

    public void executarGolpeFinal() {}

    public boolean podeExecutarGolpeFinal() {
        if(transformado == false) {
            System.out.println(codinome + " não pode executar o golpe final sem estar transformado.");
            return false;
        } else if (energia < custoGolpeFinal) {
            System.out.println(codinome + " não possui energia suficiente para executar o golpe final.");
            return false;
        } else {
            return true;
        }
    }

    public void consumirEnergiaGolpeFinal() {
        energia -= custoGolpeFinal;
    }
}
