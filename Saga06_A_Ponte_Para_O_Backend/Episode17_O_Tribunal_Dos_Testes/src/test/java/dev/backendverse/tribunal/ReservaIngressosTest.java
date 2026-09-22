package dev.backendverse.tribunal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReservaIngressosTest {

    @Test
    void calcularTotalNormal() {
        ReservaIngressos reservaIngressos = new ReservaIngressos();

        int resultado = reservaIngressos.calcularTotal(3, 10);

        assertEquals(30, resultado, "Resultado esperado");
    }

    @Test
    void calcularTotalQuantidadeZeroOuNegativa() {
        ReservaIngressos reservaIngressos = new ReservaIngressos();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> reservaIngressos.calcularTotal(-3, 10));

        assertEquals("Quantidade deve ser positiva", exception.getMessage(), "Quantidade deve ser positiva");

        exception = assertThrows(IllegalArgumentException.class, () -> reservaIngressos.calcularTotal(0, 10));

        assertEquals("Quantidade deve ser positiva", exception.getMessage(), "Quantidade deve ser positiva");
    }

    @ParameterizedTest
    @CsvSource({"1, 5, true", "1, 1, true", "0, 5, false", "5, 1, false"})
    void podeReservarTodosOsCasos(int quantidadeSolicitada, int ingressosDisponiveis, boolean esperado) {
        ReservaIngressos reservaIngressos = new ReservaIngressos();

        boolean resultado = reservaIngressos.podeReservar(quantidadeSolicitada, ingressosDisponiveis);

        assertEquals(esperado, resultado);
    }
}
