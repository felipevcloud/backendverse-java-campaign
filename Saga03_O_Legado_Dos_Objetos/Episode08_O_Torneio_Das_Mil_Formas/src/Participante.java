public abstract class Participante {

    private String nome;
    private int energia;
    private String tecnicaEspecial;
    private int custoTecnicaEspecial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getTecnicaEspecial() {
        return tecnicaEspecial;
    }

    public void setTecnicaEspecial(String tecnicaEspecial) {
        this.tecnicaEspecial = tecnicaEspecial;
    }

    public int getCustoTecnicaEspecial() {
        return custoTecnicaEspecial;
    }

    public void setCustoTecnicaEspecial(int custoTecnicaEspecial) {
        this.custoTecnicaEspecial = custoTecnicaEspecial;
    }

    public void apresentar() {
        System.out.println("Participante: " + nome);
        System.out.println("Energia: " + energia);
        System.out.println("Técnica Especial: " + tecnicaEspecial);
        System.out.println("Custo da técnica: " + custoTecnicaEspecial + "\n");
    }

    public boolean podeExecutarTecnicaEspecial() {
        if (energia >= custoTecnicaEspecial) {
            return true;
        } else {
            System.out.println(getNome() + " não possui energia suficiente para executar " + getTecnicaEspecial() + ".\n");
            return false;
        }
    }

    public void consumirEnergiaTecnicaEspecial() {
        energia -= custoTecnicaEspecial;
    }

    public abstract void executarTecnicaEspecial();
}
