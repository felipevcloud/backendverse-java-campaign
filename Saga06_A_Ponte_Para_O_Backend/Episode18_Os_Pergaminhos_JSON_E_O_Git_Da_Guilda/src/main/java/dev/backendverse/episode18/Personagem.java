package dev.backendverse.episode18;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Personagem(@JsonProperty("codinome") String nome, int nivel, boolean ativo) {
}
