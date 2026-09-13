import java.time.LocalDate;

public record Aventureiro(String codigo, String nome, Categoria categoria, LocalDate entrada) {
    public Aventureiro(String codigo, String nome, Categoria categoria, LocalDate entrada) {
        if (codigo == null || nome == null || categoria == null || entrada == null) {
            throw new IllegalArgumentException("Null Argument");
        }

        if (codigo.isBlank() || nome.isBlank()) {
            throw new IllegalArgumentException("Blank Argument");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.entrada = entrada;
    }
}
