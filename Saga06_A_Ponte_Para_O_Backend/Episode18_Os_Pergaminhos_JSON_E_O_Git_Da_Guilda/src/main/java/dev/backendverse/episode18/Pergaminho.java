package dev.backendverse.episode18;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Pergaminho(@JsonProperty("nome_pergaminho") String titulo, int paginas, boolean selado) {
}
