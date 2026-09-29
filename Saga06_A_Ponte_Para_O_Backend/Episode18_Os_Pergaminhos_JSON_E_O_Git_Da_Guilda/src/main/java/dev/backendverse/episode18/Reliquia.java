package dev.backendverse.episode18;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Reliquia(@JsonProperty("nome_reliquia") String nome, int cargas, boolean selada) {
}
