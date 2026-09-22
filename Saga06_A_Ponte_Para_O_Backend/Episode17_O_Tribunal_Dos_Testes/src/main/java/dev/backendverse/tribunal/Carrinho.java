package dev.backendverse.tribunal;

public class Carrinho {

    private int quantidade;

    public void adicionarItem() {
        quantidade++;
    }

    public int quantidade() {
        return quantidade;
    }
}