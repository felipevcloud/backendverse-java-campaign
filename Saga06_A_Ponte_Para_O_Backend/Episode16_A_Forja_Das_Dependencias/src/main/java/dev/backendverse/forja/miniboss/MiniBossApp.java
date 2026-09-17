package dev.backendverse.forja.miniboss;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.text.StringSubstitutor;

import java.util.List;
import java.util.Map;

public class MiniBossApp {
    public static void main(String[] args) {
        List<String> habilidade = List.of();

        System.out.println(CollectionUtils.isEmpty(habilidade));

        String situacao = CollectionUtils.isEmpty(habilidade)
                ? "indisponíveis"
                : "disponíveis";

        Map<String, String> aventureiro = Map.of("nome", "Ranni", "classe", "Maga", "habilidades", situacao);

        StringSubstitutor substitutor = new StringSubstitutor(aventureiro);

        String mensagem = substitutor.replace(
                "Aventureiro: ${nome} | Classe: ${classe} | Habilidades: ${habilidades}"
        );

        System.out.println(mensagem);

        habilidade = List.of("Fireball");

        situacao = CollectionUtils.isEmpty(habilidade)
                ? "indisponíveis"
                : "disponíveis";

        aventureiro = Map.of("nome", "Ranni", "classe", "Maga", "habilidades", situacao);

        substitutor = new StringSubstitutor(aventureiro);

        mensagem = substitutor.replace(
                "Aventureiro: ${nome} | Classe: ${classe} | Habilidades: ${habilidades}"
        );

        System.out.println(mensagem);
    }
}