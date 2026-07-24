public class CidadeNexus extends Construcao implements Expansora{

    public CidadeNexus(String nome, String arquiteto, int integridade, NucleoArquitetonico nucleo, String sistemaPrincipal, int custo) {
        super(nome, arquiteto, integridade, nucleo, sistemaPrincipal, custo);
        System.out.println("[Cidade] Rede arquitetônica materializada.\n");
    }

    @Override
    public boolean ativarSistemaPrincipal() {
        if (getNucleo().consumirEnergia(getCustoAtivacao())) {
            System.out.println(getNome() + " ativa o sistema " + getSistemaPrincipal() + "\n" +
                    "Novos setores são conectados à cidade.\n");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void expandirEstrutura() {
        System.out.println(getNome() + " libera novos distritos modulares!");
    }
}
