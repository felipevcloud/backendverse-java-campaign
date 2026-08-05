import java.util.*;

public class InventarioDaGuilda {

    private List<ItemDeCaca> catalogo = new ArrayList<>();
    private Set<ItemDeCaca> itensUnicos = new HashSet<>();
    private Map<ItemDeCaca, Integer> quantidades = new HashMap<>();

    public boolean registrarItem(ItemDeCaca item) {
        if (item == null) {
            System.out.println("Não foi possível registrar um item inexistente.");
            return false;
        } else {
            if (itensUnicos.add(item)) {
                catalogo.add(item);
                quantidades.put(item, 1);
                System.out.println("[Novo item] " + item.getNome() + " foi catalogado com quantidade " +  quantidades.get(item));
            } else {
                quantidades.put(item, quantidades.get(item) + 1);
                System.out.println("[Estoque] " + item.getNome() + " já estava catalogado. Quantidade atual: " +  quantidades.get(item));
            }
            return true;
        }
    }

    public int consultarQuantidade (ItemDeCaca item) {
        if (item == null || !itensUnicos.contains(item)) {
            return 0;
        } else {
            return quantidades.get(item);
        }
    }

    public void apresentarCatalogoAlfabetico() {
        List<ItemDeCaca> copia = new ArrayList<>(catalogo);
        Collections.sort(copia);
        for (ItemDeCaca item : copia) {
            item.apresentarDados();
            System.out.println("Quantidade: " + consultarQuantidade(item) + "\n");
        }
    }

    public void apresentarRankingDePoder() {
        List<ItemDeCaca> copia = new ArrayList<>(catalogo);
        Collections.sort(copia, new ComparadorPorPoder());
        for (int i = 0; i < copia.size(); i++) {
            System.out.println(i+1 + "º - " + copia.get(i).getNome() + " | Poder: " + copia.get(i).getPoder());
        }
    }

    public void apresentarQuantidades() {
        List<ItemDeCaca> copia = new ArrayList<>(catalogo);
        Collections.sort(copia);
        for (ItemDeCaca item : copia) {
            System.out.println(item.getNome() + ": " + consultarQuantidade(item));
        }
    }

    public int quantidadeDeTipos() {
        return catalogo.size();
    }

    public int quantidadeTotalDeUnidades() {
        int total = 0;
        for (ItemDeCaca item : quantidades.keySet()) {
            total += quantidades.get(item);
        }
        return total;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemDeCaca item : catalogo) {
            total += quantidades.get(item) * item.getValorEmMoedas();
        }
        return total;
    }

    public void apresentarRelatorioFinal() {
        System.out.println("Tipos no catálogo:  " + catalogo.size());
        System.out.println("Itens únicos no Set: " + itensUnicos.size());
        System.out.println("Total de unidades armazenadas: " + quantidadeTotalDeUnidades());
        System.out.println("Valor total do inventário: " + String.format("%.2f", calcularValorTotal()) + " moedas");
    }
}
