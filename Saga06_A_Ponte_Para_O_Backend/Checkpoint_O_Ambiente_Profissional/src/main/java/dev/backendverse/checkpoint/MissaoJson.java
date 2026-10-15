package dev.backendverse.checkpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MissaoJson {

    private final ObjectMapper mapper = new ObjectMapper();

    public String serializar(Missao missao)
            throws JsonProcessingException {

        return mapper.writeValueAsString(missao);
    }

    public Missao desserializar(String json)
            throws JsonProcessingException {

        return mapper.readValue(json, Missao.class);
    }
}