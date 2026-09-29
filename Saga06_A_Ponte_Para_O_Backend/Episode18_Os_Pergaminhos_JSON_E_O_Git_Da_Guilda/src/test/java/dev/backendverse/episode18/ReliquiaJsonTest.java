package dev.backendverse.episode18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReliquiaJsonTest {
    @Test
    void roundTripNormal() throws JsonProcessingException {
        Reliquia reliquia = new Reliquia("Varinha das Varinhas", 10, true);

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(reliquia);

        assertTrue(json.contains("nome_reliquia"));

        Reliquia recon = mapper.readValue(json, Reliquia.class);

        assertEquals(recon, reliquia);
    }

    @Test
    void jsonInvalido() {
        ObjectMapper mapper = new ObjectMapper();

        String json = """
                {
                "nome_reliquia": "Varinha das Varinhas",
                "cargas": 10,
                "selada": true,
                }""";

        assertThrows(JsonProcessingException.class, () -> {
            mapper.readValue(json, Reliquia.class);
        });
    }

    @Test
    void borda() throws JsonProcessingException {
        Reliquia reliquia = new Reliquia("Varinha das Varinhas", 0, true);

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(reliquia);

        Reliquia recon = mapper.readValue(json, Reliquia.class);

        assertEquals(0, recon.cargas());
        assertEquals(recon, reliquia);
    }
}
