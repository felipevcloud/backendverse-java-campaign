package dev.backendverse.tribunal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ControleAcessoTest {

    @ParameterizedTest
    @CsvSource({"30, true", "18, true", "17, false"})
    void testarAcessoPorIdade(int idade, boolean esperado) {
        ControleAcesso controleAcesso = new ControleAcesso();

        boolean resultado = controleAcesso.podeEntrar(idade);

        assertEquals(esperado, resultado);
    }
}
