package dev.backendverse.tribunal;

public class ReservaIngressos {

    public int calcularTotal(int quantidade, int precoUnitario) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva");
        }

        return quantidade * precoUnitario;
    }

    public boolean podeReservar(int quantidadeSolicitada, int ingressosDisponiveis) {
        return quantidadeSolicitada > 0
                && quantidadeSolicitada <= ingressosDisponiveis;
    }
}