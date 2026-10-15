package dev.backendverse.checkpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissaoJsonTest {

    @Test
    void deveSerializarMissao() throws JsonProcessingException {
        Missao missao = new Missao("G-101", 5, 200);
        MissaoJson conversor = new MissaoJson();

        String json = conversor.serializar(missao);
        assertEquals("{\"codigo\":\"G-101\",\"nivelMinimo\":5,\"recompensaXp\":200}", json);
    }

    @Test
    void deveDesserializarMissao() throws JsonProcessingException {
        String json = "{\"codigo\":\"G-101\",\"nivelMinimo\":5,\"recompensaXp\":200}";
        Missao missao = new Missao("G-101", 5, 200);
        MissaoJson conversor = new MissaoJson();

        Missao desserializado = conversor.desserializar(json);
        assertEquals(missao, desserializado);
    }

    @Test
    void roundTripMissao() throws JsonProcessingException {
        Missao missao = new Missao("G-101", 5, 200);
        MissaoJson conversor = new MissaoJson();

        String json = conversor.serializar(missao);
        Missao desserializado = conversor.desserializar(json);
        assertEquals(missao, desserializado);
    }

    @Test
    void jsonInvalido() throws JsonProcessingException {
        String json = "{\"codigo\":\"G-101\",\"nivelMinimo\":5, recompensaXp\":200}";
        MissaoJson conversor = new MissaoJson();

        assertThrows(JsonProcessingException.class, () -> conversor.desserializar(json));
    }
}
