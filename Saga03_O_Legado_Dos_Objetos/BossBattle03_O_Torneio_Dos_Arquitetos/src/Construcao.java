public abstract class Construcao {

    private String nome;
    private String arquiteto;
    private int integridade;
    private NucleoArquitetonico nucleo;
    private String sistemaPrincipal;
    private int custoAtivacao;

    public Construcao(String nome, String arquiteto, int integridade, NucleoArquitetonico nucleo, String sistemaPrincipal, int custoAtivacao) {
        if (nome == null || nome.isEmpty()) {
            nome = "Construção Sem Nome";
        }
        this.nome = nome;

        if (arquiteto == null || arquiteto.isEmpty()) {
            arquiteto = "Arquiteto Desconhecido";
        }
        this.arquiteto = arquiteto;

        if (integridade <= 0) {
            integridade = 1;
        }
        this.integridade = integridade;

        if (nucleo == null) {
            nucleo = new NucleoArquitetonico("Núcleo Emergencial", 1);
        }
        this.nucleo = nucleo;

        if (sistemaPrincipal == null || sistemaPrincipal.isEmpty()) {
            sistemaPrincipal = "Sistema Não Identificado";
        }
        this.sistemaPrincipal = sistemaPrincipal;

        if (custoAtivacao <= 0) {
            custoAtivacao = 1;
        }
        this.custoAtivacao = custoAtivacao;

        System.out.println("[Construção] Projeto " + nome + " validado.");
    }

    public String getNome() {
        return nome;
    }

    public String getArquiteto() {
        return arquiteto;
    }

    public int getIntegridade() {
        return integridade;
    }

    public NucleoArquitetonico getNucleo() {
        return nucleo;
    }

    public String getSistemaPrincipal() {
        return sistemaPrincipal;
    }

    public int getCustoAtivacao() {
        return custoAtivacao;
    }

    public void apresentarProjeto() {
        System.out.println("Nome: " + nome);
        System.out.println("Arquiteto: " + arquiteto);
        System.out.println("Integridade: " + integridade);
        System.out.println("Sistema Principal: " + sistemaPrincipal);
        System.out.println("Custo de Ativação: " + custoAtivacao);
        System.out.println("Identificação do Núcleo: " + nucleo.getIdentificacao());
        System.out.println("Energia Disponível: " + nucleo.getEnergia() + "\n");

    }

    public abstract boolean ativarSistemaPrincipal();
}
