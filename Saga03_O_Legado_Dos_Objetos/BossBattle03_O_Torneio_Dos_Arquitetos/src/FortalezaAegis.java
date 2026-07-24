public class FortalezaAegis extends Construcao implements Defensora {

    public FortalezaAegis() {
        this("Fortaleza Aegis Prime", "Mestre Atlas", 100, new NucleoArquitetonico("Coração de Aegis", 60), "Muralha do Titã", 15);
        System.out.println("[Fortaleza] Projeto padrão de Aegis concluído.");
    }

    public FortalezaAegis(String nome, String arquiteto, int integridade, NucleoArquitetonico nucleo, String sistemaPrincipal, int custo) {
        super(nome, arquiteto, integridade, nucleo, sistemaPrincipal, custo);
        System.out.println("[Fortaleza] Estrutura defensiva materializada.\n");
    }

    @Override
    public boolean ativarSistemaPrincipal() {
        if (getNucleo().consumirEnergia(getCustoAtivacao())) {
            System.out.println(getNome() + " desperta o sistema " + getSistemaPrincipal() + "\n" +
                    "A fortaleza assume sua configuração máxima de combate.\n");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void ativarDefesa() {
        System.out.println(getNome() + " ergue o Escudo das Sete Muralhas!");
    }
}
