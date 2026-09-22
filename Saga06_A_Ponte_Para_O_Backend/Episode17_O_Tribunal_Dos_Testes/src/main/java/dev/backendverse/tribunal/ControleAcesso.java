package dev.backendverse.tribunal;

public class ControleAcesso {

    public boolean podeEntrar(int idade) {
        return idade >= 18;
    }
}