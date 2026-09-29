package dev.backendverse.episode18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Personagem varyon = new Personagem("Varyon", 100, true);

        String json = mapper.writeValueAsString(varyon);

        System.out.println(json);

        Personagem recon = mapper.readValue(json, Personagem.class);

        System.out.println(recon);

        System.out.println(varyon.equals(recon));

        String pergaminhoJson = """
                {
                "nome_pergaminho": "Tecnica Proibida",
                "paginas": 42,
                "selado": true
                }
                """;

        Pergaminho pergaminho = mapper.readValue(pergaminhoJson, Pergaminho.class);

        System.out.println(pergaminho);

        String rePergaminhoJson = mapper.writeValueAsString(pergaminho);

        System.out.println(rePergaminhoJson);

        Pergaminho igual = new Pergaminho("Tecnica Proibida", 42, true);

        System.out.println(igual.equals(pergaminho));

    }
}
