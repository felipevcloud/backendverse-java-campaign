public class CristaisInsuficientesException extends Exception{

    private int disponiveis;
    private int solicitados;

    CristaisInsuficientesException(String mensagem, int disponiveis, int solicitados) {
        super(mensagem);
        this.disponiveis = disponiveis;
        this.solicitados = solicitados;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public int getSolicitados() {
        return solicitados;
    }
}
