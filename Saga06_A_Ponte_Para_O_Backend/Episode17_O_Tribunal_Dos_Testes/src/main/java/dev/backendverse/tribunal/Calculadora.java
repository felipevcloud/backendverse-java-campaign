package dev.backendverse.tribunal;

public class Calculadora {

    public int dobrar(int valor) {
        return valor * 2;
    }

    public boolean ehPar(int valor) {
        return valor % 2 == 0;
    }

    public int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }

        return dividendo / divisor;
    }
}