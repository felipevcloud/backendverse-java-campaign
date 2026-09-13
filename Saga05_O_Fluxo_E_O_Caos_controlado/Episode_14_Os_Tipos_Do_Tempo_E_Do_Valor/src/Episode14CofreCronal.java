import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Episode14CofreCronal {
    public enum TipoReserva {
        COMUM,
        ESTENDIDA;

        public int limiteMinutos() {
            if (this == COMUM) {
                return 90;
            }
            return 180;
        }
    }

    record ReservaCronal(String codigo, TipoReserva tipo, BigDecimal valorPorMinuto, Instant inicio, Instant fim) {
        public ReservaCronal {
            if (codigo == null || codigo.isBlank()) {
                throw new IllegalArgumentException();
            }

            if (tipo == null) {
                throw new IllegalArgumentException();
            }

            if (valorPorMinuto == null || valorPorMinuto.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException();
            }

            if (inicio == null || fim == null) {
                throw new IllegalArgumentException();
            }

            if (Duration.between(inicio, fim).toMinutes() <= 0) {
                throw new IllegalArgumentException();
            }

            if (Duration.between(inicio, fim).toMinutes() > tipo.limiteMinutos()) {
                throw new IllegalArgumentException();
            }
        }

        public long duracaoMinutos() {
            return Duration.between(inicio, fim).toMinutes();
        }

        public BigDecimal valorTotal() {
            return valorPorMinuto.multiply(BigDecimal.valueOf(duracaoMinutos())).setScale(2, RoundingMode.HALF_UP);
        }

        public LocalDateTime inicioNaZona(String zona) {
            return inicio.atZone(ZoneId.of(zona)).toLocalDateTime();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== reserva comum válida ===");

        ReservaCronal comum = new ReservaCronal(
                "CR-001",
                TipoReserva.COMUM,
                new BigDecimal("0.335"),
                Instant.parse("2026-09-13T13:00:00Z"),
                Instant.parse("2026-09-13T13:03:00Z")
        );

        System.out.println("duração = " + comum.duracaoMinutos());
        System.out.println("total = " + comum.valorTotal());
        System.out.println("início SP = " + comum.inicioNaZona("America/Sao_Paulo"));

        System.out.println("\n=== limite exato ===");

        ReservaCronal limite = new ReservaCronal(
                "CR-002",
                TipoReserva.COMUM,
                new BigDecimal("1.00"),
                Instant.parse("2026-09-13T10:00:00Z"),
                Instant.parse("2026-09-13T11:30:00Z")
        );

        System.out.println("duração = " + limite.duracaoMinutos());

        System.out.println("\n=== inválidas ===");

        testarInvalida(
                "acima do limite",
                () -> new ReservaCronal(
                        "CR-003",
                        TipoReserva.COMUM,
                        new BigDecimal("1.00"),
                        Instant.parse("2026-09-13T10:00:00Z"),
                        Instant.parse("2026-09-13T11:31:00Z")
                )
        );

        testarInvalida(
                "duração zero",
                () -> new ReservaCronal(
                        "CR-004",
                        TipoReserva.ESTENDIDA,
                        new BigDecimal("1.00"),
                        Instant.parse("2026-09-13T10:00:00Z"),
                        Instant.parse("2026-09-13T10:00:00Z")
                )
        );

        testarInvalida(
                "fim anterior ao início",
                () -> new ReservaCronal(
                        "CR-005",
                        TipoReserva.ESTENDIDA,
                        new BigDecimal("1.00"),
                        Instant.parse("2026-09-13T11:00:00Z"),
                        Instant.parse("2026-09-13T10:00:00Z")
                )
        );

        testarInvalida(
                "valor zero",
                () -> new ReservaCronal(
                        "CR-006",
                        TipoReserva.ESTENDIDA,
                        BigDecimal.ZERO,
                        Instant.parse("2026-09-13T10:00:00Z"),
                        Instant.parse("2026-09-13T10:30:00Z")
                )
        );
    }

    private static void testarInvalida(String nome, Runnable tentativa) {
        try {
            tentativa.run();
            System.out.println("FAIL: " + nome);
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: " + nome);
        }
    }
}
