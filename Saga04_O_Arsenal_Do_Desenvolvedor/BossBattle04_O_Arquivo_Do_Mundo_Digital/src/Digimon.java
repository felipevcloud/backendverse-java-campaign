import java.util.Objects;

public class Digimon implements Comparable<Digimon> {

    private String codigo;
    private String nome;
    private String especie;
    private int nivelDeAmeaca;
    private int quantidadeDeDados;
    private static int totalDeDigimonsCriados = 0;

    public Digimon(String codigo, String nome, String especie, int nivelDeAmeaca, int quantidadeDeDados) {
        if (codigo == null || codigo.isEmpty()) {
            codigo = "DG-000";
        }
        if (nome == null || nome.isEmpty()) {
            nome = "Digimon Desconhecido";
        }
        if (especie == null || especie.isEmpty()) {
            especie = "Espécie Desconhecida";
        }
        if (nivelDeAmeaca <= 0) {
            nivelDeAmeaca = 1;
        }
        if (quantidadeDeDados <= 0) {
            quantidadeDeDados = 1;
        }

        this.codigo = codigo;
        this.nome = nome;
        this.especie = especie;
        this.nivelDeAmeaca = nivelDeAmeaca;
        this.quantidadeDeDados = quantidadeDeDados;
        totalDeDigimonsCriados++;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    public int getQuantidadeDeDados() {
        return quantidadeDeDados;
    }

    public static int getTotalDeDigimonsCriados() {
        return totalDeDigimonsCriados;
    }

    public void apresentar() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Nível de Ameaça: " + nivelDeAmeaca);
        System.out.println("Quantidade de Dados: " + quantidadeDeDados + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Digimon digimon = (Digimon) o;
        return Objects.equals(codigo, digimon.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public int compareTo(Digimon o) {
        if (this.nome.equalsIgnoreCase(o.nome)) {
            return this.codigo.compareToIgnoreCase(o.codigo);
        }
        return this.nome.compareToIgnoreCase(o.nome);
    }
}
