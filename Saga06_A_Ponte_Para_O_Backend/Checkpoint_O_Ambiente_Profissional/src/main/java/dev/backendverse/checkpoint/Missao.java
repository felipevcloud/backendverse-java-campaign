package dev.backendverse.checkpoint;

public record Missao(
        String codigo,
        int nivelMinimo,
        int recompensaXp
) {
    public boolean podeAceitar(int nivelAventureiro){
        if (nivelAventureiro < 0) {
            throw new IllegalArgumentException("Nível do aventureiro não pode ser negativo");
        }

        return nivelAventureiro >= nivelMinimo;
    }
}