package dev.backendverse.checkpoint;

import com.fasterxml.jackson.core.JsonProcessingException;

public class App {

    public static void main(String[] args) throws JsonProcessingException {
        Missao missao = new Missao("G-101", 5, 200);

        System.out.println("Nível 4: " + missao.podeAceitar(4));
        System.out.println("Nível 5: " + missao.podeAceitar(5));
        System.out.println("Nível 8: " + missao.podeAceitar(8));

        try {
            missao.podeAceitar(-1);
            System.out.println("ERRO: nível negativo foi aceito!");
        } catch (IllegalArgumentException e) {
            System.out.println("Negativo rejeitado: " + e.getMessage());
        }

        MissaoJson conversor = new MissaoJson();

        String json = conversor.serializar(missao);
        System.out.println("JSON: " + json);

        Missao recuperada = conversor.desserializar(json);
        System.out.println("Round trip preservado: "
                + missao.equals(recuperada));
    }
}