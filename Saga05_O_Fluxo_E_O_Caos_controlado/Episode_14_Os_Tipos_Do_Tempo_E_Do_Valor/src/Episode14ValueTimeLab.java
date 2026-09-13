import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Episode14ValueTimeLab {

    public static void main(String[] args) {
        testarTotal(
                "19.90",
                3,
                "10"
        );

        testarTotal(
                "0.10",
                3,
                "0"
        );

        testarTotal(
                "10.05",
                2,
                "33.33"
        );

        System.out.println("\n=== limites do desconto ===");

        testarDesconto("0");
        testarDesconto("25.00");
        testarDesconto("100");
        testarDesconto("-0.01");
        testarDesconto("100.01");

        System.out.println("\n=== java.time ===");

        LocalDate emissao = LocalDate.parse("2026-09-13");

        System.out.println(
                "vencimento = "
                        + calcularVencimento(emissao, 10)
        );

        Instant inicio =
                Instant.parse("2026-09-13T10:00:00Z");

        Instant fim =
                Instant.parse("2026-09-13T12:30:00Z");

        System.out.println(
                "minutos = "
                        + calcularMinutosDecorridos(inicio, fim)
        );

        System.out.println(
                "formatada = "
                        + formatarData("2026-09-13")
        );

        System.out.println("\n=== calendário e fuso ===");

        Period periodo = calcularPeriodo(
                LocalDate.of(2026, 1, 10),
                LocalDate.of(2026, 3, 15)
        );

        System.out.printf(
                "período = %d meses e %d dias%n",
                periodo.getMonths(),
                periodo.getDays()
        );

        LocalDateTime local =
                LocalDateTime.of(2026, 9, 13, 10, 0);

        Instant instanteSaoPaulo =
                converterParaInstant(
                        local,
                        "America/Sao_Paulo"
                );

        Instant instanteTokyo =
                converterParaInstant(
                        local,
                        "Asia/Tokyo"
                );

        System.out.println(
                "10:00 São Paulo -> " + instanteSaoPaulo
        );

        System.out.println(
                "10:00 Tóquio -> " + instanteTokyo
        );

        LocalDateTime emTokyo =
                converterParaHorarioLocal(
                        instanteSaoPaulo,
                        "Asia/Tokyo"
                );

        System.out.println(
                "mesmo instante em Tóquio -> " + emTokyo
        );
        System.out.println("\n=== limite temporal ===");

        System.out.println(duracaoPermitida(
                Instant.parse("2026-09-13T10:00:00Z"),
                Instant.parse("2026-09-13T11:30:00Z"),
                90
        ));

        System.out.println(duracaoPermitida(
                Instant.parse("2026-09-13T10:00:00Z"),
                Instant.parse("2026-09-13T11:31:00Z"),
                90
        ));

        System.out.println(duracaoPermitida(
                Instant.parse("2026-09-13T10:00:00Z"),
                Instant.parse("2026-09-13T10:00:00Z"),
                90
        ));
    }

    private static void testarTotal(
            String preco,
            int quantidade,
            String desconto
    ) {
        BigDecimal resultado = calcularTotal(
                new BigDecimal(preco),
                quantidade,
                new BigDecimal(desconto)
        );

        System.out.printf(
                "preço=%s qtd=%d desconto=%s%% -> total=%s%n",
                preco,
                quantidade,
                desconto,
                resultado
        );
    }

    static BigDecimal calcularTotal(BigDecimal precoUnitario, int quantidade, BigDecimal percentualDesconto) {

        BigDecimal subtotal = precoUnitario.multiply(BigDecimal.valueOf(quantidade));

        BigDecimal desconto = subtotal.multiply(percentualDesconto.divide(BigDecimal.valueOf(100)));

        return subtotal.subtract(desconto).setScale(2, RoundingMode.HALF_UP);
    }

    static boolean descontoPermitido(BigDecimal percentual) {
        if (percentual.compareTo(BigDecimal.valueOf(0)) < 0 || percentual.compareTo(BigDecimal.valueOf(100)) > 0) {
            return false;
        }

        return true;
    }

    private static void testarDesconto(String valor) {
        BigDecimal percentual = new BigDecimal(valor);

        System.out.printf(
                "desconto=%s -> permitido=%s%n",
                valor,
                descontoPermitido(percentual)
        );
    }

    static LocalDate calcularVencimento(LocalDate emissao, int dias) {
        return emissao.plusDays(dias);
    }

    static long calcularMinutosDecorridos(Instant inicio, Instant fim) {
        return Duration.between(inicio, fim).toMinutes();
    }

    static String formatarData(String dataIso) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataIso);
        return data.format(formatter);
    }

    static Period calcularPeriodo(LocalDate inicio, LocalDate fim) {
        return Period.between(inicio, fim);
    }

    static Instant converterParaInstant(LocalDateTime horarioLocal, String zona) {
        return horarioLocal.atZone(ZoneId.of(zona)).toInstant();
    }

    static LocalDateTime converterParaHorarioLocal(Instant instante, String zona) {
        return instante.atZone(ZoneId.of(zona)).toLocalDateTime();
    }

    static boolean duracaoPermitida(Instant inicio, Instant fim, long limite) {
        return calcularMinutosDecorridos(inicio, fim) <= limite;
    }
}