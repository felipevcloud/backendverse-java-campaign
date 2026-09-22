package dev.backendverse.tribunal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testDobrar() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.dobrar(7);

        assertEquals(14, resultado);
    }

    @Test
    void testParPositivo() {
        Calculadora calculadora = new Calculadora();

        boolean resultado = calculadora.ehPar(2);

        assertTrue(resultado);
    }

    @Test
    void testParNegativo() {
        Calculadora calculadora = new Calculadora();

        boolean resultado = calculadora.ehPar(3);

        assertFalse(resultado);
    }

    @Test
    void divisaoPorZero() {
        Calculadora calculadora = new Calculadora();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));

        assertEquals("Divisor não pode ser zero", exception.getMessage());
    }
}