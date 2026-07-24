public abstract class Construcao {

    private String nome;
    private String arquiteto;
    private int integradade;
    private NucleoArquitetonico nucleo;
    private String sistemaPrincipal;
    private int custoAtivacao;

    public Construcao(String nome, String arquiteto, int integradade, NucleoArquitetonico nucleo, String sistemaPrincipal, int custoAtivacao) {
        if (nome.isEmpty() || nome == null) {
            nome = "Construção Sem Nome";
        }
        this.nome = nome;

        if (arquiteto.isEmpty() || arquiteto == null) {
            arquiteto = "Arquiteto Desconhecido";
        }
        this.arquiteto = arquiteto;

        if (integradade <= 0) {
            integradade = 1;
        }
        this.integradade = integradade;

        if (nucleo == null) {
            nucleo = new NucleoArquitetonico("Núcleo Emergencial", 1);
        }
        this.nucleo = nucleo;

        if (sistemaPrincipal.isEmpty() || sistemaPrincipal == null) {
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

    public int getIntegradade() {
        return integradade;
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
        System.out.println("Integridade: " + integradade);
        System.out.println("Sistema Principal: " + sistemaPrincipal);
        System.out.println("Custo de Ativação: " + custoAtivacao);
        System.out.println("Identificação do Núcleo: " + nucleo.getIdentificacao());
        System.out.println("Energia Disponível: " + nucleo.getEnergia() + "\n");

    }

    public abstract boolean ativarSistemaPrincipal();
}
