# Backendverse Campaign

**Atualizado em:** 15/10/2026

**Fonte oficial:** ramo `main` de `felipevcloud/backendverse-java-campaign`

**Playbook vigente:** Backendverse Playbook v1.5

**Curriculum vigente:** Backendverse Curriculum v1.5

## Estado atual

* **Saga:** Saga VI — A Ponte para o Backend (concluída)
* **Missão aberta:** nenhuma
* **Próxima missão:** Episode 19 — As Tabelas da Verdade (Saga VII — O Reino dos Dados)
* **Última missão executável aprovada:** Checkpoint — O Ambiente Profissional
* **Boss Battles concluídas:** I–V

## Progresso preservado

* Episodes 01–18 concluídos;
* Boss Battles I–V concluídas;
* Core Java concluído com os 9 critérios de convergência da Boss Battle V aprovados;
* Boss Battle V encerrada com aplicação integrada autoral, revisão adversarial e harness final com `14 PASS` e `0 FAIL`;
* modelagem, Collections e generics, Streams, `Optional`, exceptions, integridade de estado, `enum`, `record`,
  `BigDecimal` e `java.time` possuem evidência executável integrada;
* Episode 15 concluiu fundamentos de Maven com estrutura padrão, `pom.xml` autoral, Java 21, lifecycle, empacotamento,
  Maven Wrapper 3.9.16 e diagnóstico real de build;
* Episode 16 concluiu dependências Maven com coordenadas, resolução local, transitividade, scopes `compile`, `test`,
  `runtime` e `provided`, diferença entre dependência e plugin, goals, árvore de dependências e organização de packages;
* Episode 17 concluiu fundamentos de testes automatizados com JUnit 5, `@Test`, Arrange-Act-Assert, assertions,
  `assertThrows`, testes parametrizados com `@CsvSource`, casos positivos, negativos e de borda, independência,
  repetibilidade e execução pelo Maven;
* o mini-boss do Episode 17 produziu uma suíte autoral capaz de detectar regressão real de borda e retornar ao estado
  saudável após a correção;
* a suíte final do Episode 17 foi reproduzida com `15` testes, `0` failures e `0` errors, com `BUILD SUCCESS`;
* Episode 18 concluiu fundamentos de JSON com objetos, arrays, tipos, diferença entre representação JSON e objeto Java,
  serialização, desserialização, mapeamento com `@JsonProperty` e observação de entrada JSON inválida;
* Episode 18 percorreu originalmente o fluxo Git com `status`, `diff`, staging, commits, `.gitignore`, remotes,
  branches, merge, conflito, histórico e Pull Request; a conquista histórica permaneceu aprovada e a lacuna de
  autonomia operacional foi tratada pelo Revisit 18;
* o mini-boss do Episode 18 produziu round trip JSON autoral para `Reliquia`, caso sintaticamente inválido e borda
  `cargas = 0`;
* o PR #1 integrou o Episode 18 à `main` após conflito controlado e revisão do histórico;
* a reprodução final do Episode 18 executou `clean verify` com `4` testes, `0` failures, `0` errors e `BUILD SUCCESS`;
* Revisit 18 — A Oficina do Git concluiu a consolidação operacional de Git com modelo consciente de working tree,
  staging/index, histórico local e remoto, inspeção com `status`, `diff` e `diff --cached`, staging seletivo,
  `.gitignore`, commits, `push`, `fetch`, `pull`, branches, merges, conflito controlado, histórico e Pull Request;
* antes da introdução de branches no Revisit 18, foram concluídos dois ciclos básicos consecutivos de
  mudança → inspeção → staging → commit → publicação conduzidos de forma autônoma;
* o Revisit 18 incluiu branch autoral publicada, merge sem conflito, conflito textual lido e resolvido, inspeção de
  histórico e integração por Pull Request;
* durante o mini-boss final, alterações já presentes no staging acompanharam uma troca de branch e foram
  acidentalmente incluídas em um commit da `main`; o estado foi diagnosticado a partir do modelo do index e corrigido
  por commit adicional seguro, sem `force push` ou reescrita de histórico público;
* o mini-boss BE-318 alterou o contrato JSON de `Pergaminho` de `paginas` para `total_paginas`, preservou o round trip,
  adicionou verificação explícita no teste e terminou com `4` testes, `0` failures, `0` errors e `BUILD SUCCESS`;
* a `main` avançou enquanto a feature BE-318 estava em desenvolvimento; a divergência foi identificada no grafo,
  a `main` foi integrada à feature, os testes foram repetidos após a integração e a entrega foi revisada pelo diff;
* o PR #3 integrou a BE-318 à `main`, contendo somente `Pergaminho.java` e `PergaminhoJsonTest.java`;
* o fechamento do Revisit 18 terminou com `main` local e `origin/main` sincronizados no commit `14b4fed`, working tree
  limpa e histórico remoto coerente;
* Checkpoint — O Ambiente Profissional concluído em três blocos com projeto Maven novo em Java 21, coordenadas,
  dependências e plugins explícitos, pacotes organizados e build reproduzível;
* o Checkpoint implementou `Missao` como `record` com elegibilidade por nível e rejeição de nível negativo,
  `MissaoJson` com Jackson para serialização e desserialização e aplicação de demonstração `App`;
* a suíte JUnit do Checkpoint executou `6` testes (`4` de JSON e `2` de regras), com `0` failures,
  `0` errors e `BUILD SUCCESS` no `mvn clean verify`;
* o Checkpoint teve staging seletivo, commits autorais inspecionados e feature publicada; a `main` remota avançou
  independentemente por edição de `.gitignore` no GitHub (`Thumbs.db`), a divergência foi observada após `fetch`
  e `origin/main` foi integrada diretamente à feature em `1ac165f`, sem alterar a `main` local;
* após a integração, `mvn clean verify` confirmou novamente `6` testes aprovados e `BUILD SUCCESS`;
* o README do Checkpoint documentou pré-requisitos, caminhos relativos, regras e instruções de validação, com revisão
  adversarial de portabilidade para Linux; uma nova cópia publicada em `%TEMP%/backendverse-checkpoint-repro`
  reproduziu o build com `6` testes, `0` failures, `0` errors e `BUILD SUCCESS`;
* o PR #4 integrou à `main` os sete arquivos do Checkpoint, sem alterações históricas não relacionadas, por meio
  do merge commit `a6e15d8`; o Mapa de Maestria encerrou com `7/7` critérios comprovados;
* artefatos históricos aprovados permanecem protegidos.

## Sequência liberada

1. Episode 19 — As Tabelas da Verdade.

## Regra de manutenção

Este arquivo é um snapshot, não um diário. Não muda em `MISSION START`, respostas, blocos, pausas ou retomadas. Quando
houver código, sua atualização acompanha o commit final da missão.

## Fim do estado oficial
