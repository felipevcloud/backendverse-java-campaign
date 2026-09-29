package dev.backendverse.episode18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PergaminhoJsonTest {
    @Test
    void testPergaminho() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Pergaminho pergaminho = new Pergaminho("Tecnica Proibida", 42, true);

        String json = mapper.writeValueAsString(pergaminho);

        assertTrue(json.contains("nome_pergaminho"));

        Pergaminho recon = mapper.readValue(json, Pergaminho.class);

        assertEquals(pergaminho, recon);
    }
}
