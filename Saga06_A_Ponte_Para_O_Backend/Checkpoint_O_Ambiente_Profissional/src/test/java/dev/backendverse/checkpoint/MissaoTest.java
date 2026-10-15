package dev.backendverse.checkpoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissaoTest {

    @Test
    void deveAvaliarNivelDoAventureiro() {
        Missao missao = new Missao("G-101", 5, 200);

        assertFalse(missao.podeAceitar(4));
        assertTrue(missao.podeAceitar(5));
        assertTrue(missao.podeAceitar(6));
    }

    @Test
    void deveRejeitarNivelNegativo() {
        Missao missao = new Missao("G-101", 5, 200);

        assertThrows(IllegalArgumentException.class, () -> missao.podeAceitar(-1));
    }
}
