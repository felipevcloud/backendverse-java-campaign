package dev.backendverse.tribunal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoTest {

    @Test
    void adicionarItem() {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem();

        assertEquals(1, carrinho.quantidade());
    }

    @Test
    void carrinhoNovoComecaVazio() {
        Carrinho carrinho = new Carrinho();

        assertEquals(0, carrinho.quantidade(), "Carrinho novo deve começar vazio");
    }
}