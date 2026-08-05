public class ItemDeCaca implements Comparable<ItemDeCaca>{

    private final String codigo;
    private String nome;
    private String categoria;
    private int poder;
    private double valorEmMoedas;

    public ItemDeCaca(String codigo, String nome, String categoria, int poder, double valorEmMoedas) {
        if (codigo  == null || codigo.isEmpty()) {
            codigo = "ITEM-000";
        }
        if (nome == null || nome.isEmpty()) {
            nome = "Item sem nome";
        }
        if (categoria == null || categoria.isEmpty()) {
            categoria = "Sem categoria";
        }
        if (poder <= 0) {
            poder = 1;
        }
        if (valorEmMoedas <= 0) {
            valorEmMoedas = 1.0;
        }
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.poder = poder;
        this.valorEmMoedas = valorEmMoedas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPoder() {
        return poder;
    }

    public double getValorEmMoedas() {
        return valorEmMoedas;
    }

    public void apresentarDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Item: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Poder: " + poder);
        System.out.println("Valor: " + String.format("%.2f", valorEmMoedas) + " moedas");
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        } else if (objeto != null && this.getClass() == objeto.getClass()) {
            ItemDeCaca item = (ItemDeCaca) objeto;
            return this.codigo.equals(item.codigo);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public int compareTo(ItemDeCaca o) {
        if (this.nome.equalsIgnoreCase(o.nome)) {
            return this.codigo.compareTo(o.codigo);
        }
        return nome.compareToIgnoreCase(o.nome);
    }
}
