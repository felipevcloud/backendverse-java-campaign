package dev.backendverse.forja.app;

import org.apache.commons.text.StringSubstitutor;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<String, String> dados = Map.of(
                "personagem", "Agumon",
                "evolucao", "Greymon"
        );


        List<String> nomes = List.of();

        boolean vazio = CollectionUtils.isEmpty(nomes);

        System.out.println(vazio);

        StringSubstitutor substitutor = new StringSubstitutor(dados);

        String mensagem = substitutor.replace(
                "${personagem} evoluiu para ${evolucao}!"
        );

        System.out.println(mensagem);
    }
}