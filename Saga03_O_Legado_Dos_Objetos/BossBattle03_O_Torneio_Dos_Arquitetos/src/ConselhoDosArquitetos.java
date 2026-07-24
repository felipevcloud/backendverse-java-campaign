import java.util.ArrayList;

public class ConselhoDosArquitetos {

    private ArrayList<Construcao> construcoes = new ArrayList<>();
    private ArrayList<Defensora> defensoras = new ArrayList<>();
    private ArrayList<Expansora> expansoras = new ArrayList<>();

    public boolean registrarConstrucao(Construcao construcao) {
        if (construcao != null) {
            construcoes.add(construcao);
            System.out.println(construcao.getNome() + " foi registrada no Torneio dos Arquitetos.");
            return true;
        } else {
            System.out.println("Não foi possível registrar uma construção inexistente.");
            return false;
        }
    }

    public boolean registrarDefensora(Defensora defensora) {
        if (defensora != null) {
            defensoras.add(defensora);
            return true;
        } else {
            return false;
        }
    }

    public boolean registrarExpansora(Expansora expansora) {
        if (expansora != null) {
            expansoras.add(expansora);
            return true;
        } else {
            return false;
        }
    }

    public int quantidadeDeConstrucoes() {
        return construcoes.size();
    }

    public int quantidadeDeDefensoras() {
        return defensoras.size();
    }

    public int quantidadeDeExpansoras() {
        return expansoras.size();
    }

    public void apresentarProjetos() {
        for (Construcao construcao : construcoes) {
            construcao.apresentarProjeto();
        }
    }

    public void ordenarAtivacoes() {
        for (Construcao construcao : construcoes) {
            construcao.ativarSistemaPrincipal();
        }
    }

    public void coordenarDefesas() {
        for (Defensora defensora : defensoras) {
            defensora.ativarDefesa();
        }
    }

    public void coordenarExpansoes() {
        for (Expansora expansora: expansoras) {
            expansora.expandirEstrutura();
        }
    }

    public boolean removerConstrucao(Construcao construcao) {
        if (construcoes.remove(construcao)) {
            defensoras.remove(construcao);
            expansoras.remove(construcao);
            System.out.println(construcao.getNome() + " foi retirada do Torneio dos Arquitetos.");
            return true;
        } else {
            System.out.println("A construção informada não participava do torneio.");
            return false;
        }
    }

    public void apresentarRelatorioFinal() {
        for (Construcao construcao : construcoes) {
            System.out.println(construcao.getNome() + " | Integridade: " + construcao.getIntegridade() + " | Energia: " + construcao.getNucleo().getEnergia());
        }
    }
}
