package dev.backendverse.episode18;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Pergaminho(@JsonProperty("nome_pergaminho") String titulo, @JsonProperty("total_paginas") int paginas, boolean selado) {
}
