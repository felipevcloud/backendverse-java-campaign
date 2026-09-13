import java.math.BigDecimal;
import java.math.RoundingMode;

public record Recompensa(BigDecimal valor) {
    public Recompensa {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }

        valor = valor.setScale(2, RoundingMode.HALF_UP);
    }
}