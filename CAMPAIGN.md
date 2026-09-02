# Backendverse Campaign

## Playbook vigente

Backendverse Playbook v1.3.2

Progresso anterior preservado.

## Saga Atual

Saga V — O Fluxo e o Caos Controlado

## Missão Atual

Boss Battle V — A Graduação do Core Java

A missão foi oficialmente iniciada depois que o aprendiz enviou `MISSION START`.

## Episódio Atual

Nenhum Episode em andamento.

Episode 13 — O Guardião das Exceções foi oficialmente concluído sob o Backendverse Playbook v1.3.1.

## Status Atual

Boss Battle V — A Graduação do Core Java está oficialmente em andamento sob o Backendverse Playbook v1.3.2.

O Mapa de Maestria inicial possui sete itens em `○`, nenhum em `◐` e nenhum em `✓`. As evidências dos Episodes anteriores permanecem válidas, mas os itens desta Boss Battle exigem convergência em um problema integrado antes de receberem `✓`.

A abertura da missão não produziu nem alterou artefato executável. O primeiro bloco definirá a evolução adequada de um projeto já conhecido a partir de sua estrutura real.

Saga V — O Fluxo e o Caos Controlado permanece em andamento.

Próximo Episode após o marco: Episode 14 — O Ritual Maven.

## Mapa de Maestria Atual — Boss Battle V

- ○ modelar uma evolução coerente preservando responsabilidades e legibilidade
- ○ escolher e utilizar Collections e generics de acordo com as regras do domínio
- ○ aplicar pipelines com Streams sem esconder regras ou efeitos
- ○ representar ausência com `Optional` quando apropriado
- ○ tratar, propagar ou recuperar falhas conscientemente
- ○ testar comportamentos principais, inválidos e adversariais compatíveis
- ○ explicar e defender decisões técnicas da solução

## Mapa de Maestria Final — Episode 13

- ✓ propósito de exceptions
- ✓ fluxo de `try` e `catch`
- ✓ múltiplos tratamentos e especificidade
- ✓ `finally` e liberação de recursos
- ✓ checked versus unchecked
- ✓ criação e lançamento com `throw`
- ✓ declaração e propagação com `throws`
- ✓ escolha entre tratar e propagar
- ✓ preservação de comportamento válido em casos de erro

## Evidência final do Episode 13

O aprendiz distinguiu checked e unchecked pela hierarquia, reconheceu a obrigação de captura ou declaração imposta pelo compilador e demonstrou que um `throws` explícito não altera a classificação de uma exception.

Também criou uma exception customizada com mensagem, separou a criação do objeto com `new` de seu lançamento com `throw`, declarou propagação com `throws` e rastreou corretamente o efeito de exceptions capturadas e não capturadas sobre o fluxo.

Na revisão final, consolidou o critério para tratar ou propagar: um método trata quando consegue cumprir sua promessa por uma alternativa válida autorizada pela regra; quando não consegue produzir um resultado correto, propaga. Fallbacks válidos preservaram o comportamento do sistema sem esconder falhas irrecuperáveis.

## Última Missão

Episode 13 — O Guardião das Exceções

Missão concluída com todos os nove itens essenciais do Mapa de Maestria em `✓`.

Foram demonstrados representação, lançamento, declaração, propagação, captura e recuperação de falhas, incluindo hierarquia, especificidade, `finally`, checked e unchecked e decisões responsáveis entre tratar e propagar.

O Episode não exigiu projeto independente. A evidência aprovada consistiu em previsões, explicações, rastreamentos, pequenos trechos Java e decisões técnicas.

## Próxima Missão

Episode 14 — O Ritual Maven.

A missão permanece bloqueada até a conclusão oficial da Boss Battle V.

## Habilidades Desbloqueadas

* Fazer um programa Java nascer
* Criar classes e objetos
* Separar modelo e execução
* Diferenciar valores primitivos, referências e objetos
* Utilizar arrays de primitivos e objetos
* Tratar null com segurança
* Integrar fundamentos iniciais em um mini-sistema
* Criar métodos com parâmetros e retorno
* Controlar estado interno com atributos private
* Criar objetos com comportamento próprio
* Planejar e construir programas completos
* Criar testes manuais com resultados PASS e FAIL
* Utilizar for e while conforme o fluxo
* Separar índices e contadores por responsabilidade
* Importar e utilizar classes da biblioteca Java
* Utilizar ArrayList para armazenar objetos
* Adicionar, acessar, buscar e remover elementos
* Validar índices e referências antes do acesso
* Consultar e compreender métodos da API Java
* Distribuir responsabilidades entre diferentes objetos
* Coordenar operações sem acessar diretamente o estado interno
* Controlar o ciclo de vida de uma entidade
* Validar regras de negócio com testes manuais
* Construir sistemas orientados a objetos com múltiplas classes colaborando
* Identificar relações IS-A e HAS-A
* Criar hierarquias de classes com extends
* Reaproveitar atributos e comportamentos por herança
* Especializar comportamentos com sobrescrita e @Override
* Utilizar referências da superclasse
* Executar comportamentos diferentes por meio do polimorfismo
* Armazenar subclasses em coleções da superclasse
* Combinar herança e composição de forma coerente
* Modelar classes, relações e responsabilidades antes da implementação
* Criar classes abstratas
* Definir contratos com interfaces
* Programar para abstrações
* Utilizar referências polimórficas
* Diferenciar comportamento comum de comportamento obrigatório
* Criar estados válidos por meio de construtores
* Utilizar sobrecarga de construtores
* Encadear inicialização com this() e super()
* Compreender heap, stack e ciclo de vida dos objetos
* Integrar herança, composição, interfaces, abstração e construtores
* Utilizar membros static conscientemente
* Diferenciar estado de instância de estado compartilhado
* Criar constantes com static final
* Utilizar wrappers
* Compreender autoboxing e unboxing
* Utilizar métodos utilitários de Math
* Converter texto para valores numéricos
* Utilizar List, Set e Map de acordo com suas responsabilidades
* Aplicar generics às Collections
* Definir identidade de objetos com equals() e hashCode()
* Criar ordem natural com Comparable
* Criar ordenações alternativas com Comparator
* Utilizar Collections.sort()
* Realizar buscas exatas por loop
* Realizar buscas parciais case-insensitive
* Controlar duplicidade sem duplicar o catálogo
* Associar objetos a quantidades com Map
* Criar desempates determinísticos
* Não depender da ordem interna de HashSet e HashMap
* Integrar Collections, generics, busca, ordenação e identidade em um único sistema
* Escrever expressões lambda para comportamentos funcionais
* Relacionar interfaces funcionais ao uso de lambdas
* Compor pipelines com `filter`, `map` e operações terminais
* Compreender avaliação lazy e execução elemento a elemento em Streams
* Materializar Streams com `toList` e estratégias de `collect`
* Agregar elementos com `reduce`
* Representar ausência e definir fallbacks com `Optional`
* Representar falhas com exceptions
* Controlar o fluxo com `try`, `catch` e tratamentos específicos
* Utilizar `finally` para garantir ações de encerramento
* Distinguir checked e unchecked pela hierarquia e pela obrigação do compilador
* Criar e lançar exceptions customizadas com `new` e `throw`
* Declarar e propagar falhas com `throws`
* Escolher entre tratar e propagar conforme a responsabilidade do método
* Preservar comportamento válido por recuperação e fallback

## Boss Battles Concluídas

* Boss Battle I — O Registro da Academia
* Boss Battle II — O Primeiro Sistema da Guilda
* Boss Battle III — O Torneio dos Arquitetos
* Boss Battle IV — O Arquivo do Mundo Digital

## Side Quests Concluídas

Nenhuma até o momento.

## Projetos Principais

* Boss Battle I — O Registro da Academia
* Boss Battle II — O Primeiro Sistema da Guilda
* Boss Battle III — O Torneio dos Arquitetos
* Boss Battle IV — O Arquivo do Mundo Digital

## Observações

### Migração metodológica para v1.3

Episodes 01–11 permanecem concluídos exatamente como registrados.

Boss Battles I–IV permanecem concluídas exatamente como registradas.

Saga V — O Fluxo e o Caos Controlado permanece como a Saga atual.

Episode 12 — A Respiração dos Fluxos foi oficialmente iniciado sob a metodologia v1.3.

Episode 12 foi reiniciado pedagogicamente pelo diagnóstico da v1.3, sem presumir conhecimento zero e sem apagar exposição ou conhecimento anterior.

Nenhum trabalho novo foi registrado como concluído durante a migração.

### Piloto v1.3 — evidências registradas

O primeiro bloco confirmou leitura, previsão e composição de pipelines em interações curtas.

O segundo bloco confirmou construção de lambdas, compreensão de interfaces funcionais, relação entre `Predicate` e `filter`, relação entre `Function` e `map`, execução lazy, acionamento por operações terminais e aplicação de `reduce` com identidade e acumulador.

Uma concepção equivocada sobre a execução imediata de operações intermediárias foi diagnosticada, recebeu um Patch curto e foi recuperada em nova previsão antes de aparecer corretamente em aplicação posterior.

O aprendiz relatou que a experiência ficou bem mais leve e que continuaria tranquilamente.

O piloto também revelou um ajuste necessário: o Sensei deverá avaliar o significado e o raciocínio da resposta antes de cobrar formulação específica. Vocabulário próprio semanticamente correto deverá ser aceito; ambiguidades e prováveis lapsos deverão receber esclarecimento; correção formal será exigida quando a diferença alterar o comportamento técnico.

### Piloto v1.3 — REENTRY e conclusão do mapa

O `REENTRY` revelou ferrugem inicial sobre a execução elemento a elemento de operações intermediárias. Depois de um Patch curto, o aprendiz recuperou o modelo em novos rastreamentos e voltou a aplicá-lo corretamente em um pipeline integrado.

Em `collect` e `toList`, o aprendiz distinguiu a materialização do Stream da estratégia fornecida por um `Collector` e transferiu o raciocínio para `Collectors.toSet()`, incluindo o efeito sobre elementos duplicados.

Em `Optional`, uma concepção inicial que associava ausência a `null` recebeu Patch. A recuperação foi demonstrada pela distinção entre `Optional.empty()` e `Optional.of(...)`, pelo uso de `orElse()` nos caminhos com e sem valor e pela composição de `filter`, `findFirst()` e fallback.

O Revisit final integrou `filter`, `map`, operação terminal, `Optional` e `orElse()` em um novo contexto, produzindo corretamente o resultado e a transformação intermediária.

A auditoria confirmou todos os itens essenciais do Episode 12 em `✓`. As evidências consistiram em previsões, explicações e pequenos pipelines Java; nenhum projeto executável foi exigido ou submetido neste bloco.

`MISSION ACCOMPLISHED` foi liberado após a auditoria das evidências e posteriormente enviado pelo aprendiz. O Episode 12 está oficialmente concluído.

### Conclusão oficial do Episode 12

O Mapa de Maestria final foi consolidado com todos os itens essenciais em `✓`:

- expressões lambda;
- interfaces funcionais;
- modelo mental de Stream;
- `filter`;
- `map`;
- operações terminais;
- `collect` e `toList`;
- `reduce`;
- `Optional`;
- composição de pipelines.

O piloto confirmou que blocos menores, uma interação significativa por vez e Patches proporcionais podem preservar rigor técnico enquanto reduzem a resistência para começar e continuar.

O feedback sobre significado antes de formulação foi incorporado ao método. As recuperações posteriores confirmaram que esclarecimento proporcional funciona melhor do que exigir palavras específicas.

Episode 13 — O Guardião das Exceções foi posteriormente aberto.

### Episode 13 — primeiro bloco e ajuste de ritmo

O primeiro bloco trabalhou propósito e fluxo de exceptions, `try`/`catch`, múltiplos tratamentos, hierarquia, `finally`, checked/unchecked, `throw` e `throws`.

O aprendiz previu corretamente a interrupção do fluxo por `ArithmeticException`, o caminho `A → C → D` em tratamento com `try`/`catch` e a falha de parsing representada por `NumberFormatException`.

Também relacionou a ordem de `catch` à hierarquia e ao polimorfismo, explicou por que um tratamento genérico anterior torna um tratamento específico inalcançável e reconheceu a execução de `finally` tanto no caminho normal quanto no caminho excepcional.

Checked e unchecked exceptions exigiram Patch. A recuperação parcial demonstrou que `IOException` precisa ser tratada ou propagada, enquanto `ArithmeticException` e `IllegalArgumentException` são unchecked. Ainda será necessária transferência em outro contexto antes de `✓`.

Na propagação pela pilha, o aprendiz identificou que uma `IOException` deixa de subir quando é capturada e distinguiu corretamente `throws IOException`, que declara possibilidade de escape, de `throw new IOException(...)`, que lança efetivamente a exception. O uso de `throw` permanece em `◐` até aplicação ou transferência suficiente.

O bloco ficou longo demais e não ofereceu o corte visível exigido pela intenção da v1.3. O aprendiz precisou pedir a pausa e o estado do mapa. Esse feedback originou o contrato explícito de bloco do Playbook: alvo limitado, critério de encerramento, mapa visível e proibição de iniciar outro Probe no fechamento.

Depois desse ajuste, o fluxo operacional foi unificado em um único Sensei no Work, responsável por ensinar, revisar evidências e atualizar diretamente os arquivos oficiais. O aprendiz não precisa transportar resumos nem sincronizar o estado manualmente.

Nenhum arquivo executável foi submetido ou inspecionado. Naquele ponto, o Episode permaneceu aberto, sem liberação de `MISSION ACCOMPLISHED`.

### Episode 13 — decisão entre tratar e propagar

Em um cenário de cobrança, o aprendiz identificou `finalizarPedido()` como o ponto adequado para tratar a falha porque esse método conhece a regra de negócio aplicável.

Em um cenário diferente, identificou `buscarProduto()` como o ponto capaz de reagir à indisponibilidade do cache e preservar o comportamento válido por meio de fallback para o banco.

A transferência entre regra de negócio e recuperação técnica confirmou em `✓`:

- escolha entre tratar e propagar;
- preservação de comportamento válido em casos de erro.

O bloco foi encerrado antes de iniciar o próximo alvo. Depois de o aprendiz indicar que desejava continuar, foi aberto o bloco de checked versus unchecked. Seu primeiro Probe não recebeu resposta antes da troca planejada de chat.

O Playbook v1.3.1 foi adotado sem reiniciar a missão nem alterar evidências anteriores. A correção fortalece a voz conversacional do Sensei e diferencia personalidade real de ambientação cosmética.

### Conclusão oficial do Episode 13

O Episode foi retomado por `REENTRY` a partir do snapshot de continuidade, sem novo `MISSION START` e sem perda das evidências anteriores.

Checked e unchecked foram consolidadas pela hierarquia direta e indireta. O aprendiz demonstrou que exceptions descendentes de `RuntimeException` permanecem unchecked mesmo quando declaradas com `throws`, enquanto uma checked precisa ser capturada ou declarada pelo código chamador.

Na aplicação de `throw`, o aprendiz criou `EvolucaoBloqueadaException`, recebeu uma mensagem em seu construtor, encaminhou-a com `super(mensagem)` e lançou a instância quando a regra de nível mínimo foi violada. Também separou corretamente o papel de `new`, que cria o objeto, do papel de `throw`, que o lança.

Antes de encerrar, o aprendiz solicitou uma revisão completa. Foram revisitados fluxo excepcional, retornos combinados com `finally`, ordem de tratamentos, checked e unchecked, `throw`, `throws`, propagação e recuperação.

A revisão revelou imprecisões sobre o fluxo depois de um `catch`, a diferença entre criação e lançamento e a relação entre classificação da exception e interrupção em runtime. Cada ponto recebeu Patch curto e foi recuperado em novo contexto.

Um cenário de revisão utilizou prematuramente vocabulário de camadas ainda não ensinado e tornou a escolha entre tratar e propagar desnecessariamente confusa. O item foi reaberto em `◐` e reconstruído no nível correto por meio das responsabilidades de métodos comuns. A transferência final confirmou que um método trata quando conhece uma alternativa válida compatível com sua promessa; sem essa alternativa, ele propaga.

O Mapa de Maestria final foi consolidado com todos os nove itens essenciais em `✓`. Não houve projeto independente nem artefato executável, e nenhuma compilação ou execução foi necessária para as evidências aprovadas.

`MISSION ACCOMPLISHED` foi enviado pelo aprendiz. O Episode 13 está oficialmente concluído e Boss Battle V — A Graduação do Core Java está disponível para um futuro `MISSION START`.

### Início oficial da Boss Battle V

O aprendiz enviou `MISSION START` e abriu oficialmente a Boss Battle V — A Graduação do Core Java.

O Mapa de Maestria foi instanciado com sete critérios de convergência em `○`. O progresso anterior permanece preservado, sem presumir que evidências isoladas substituem a integração exigida pelo marco.

Nenhuma pasta ou alteração de código foi criada pela abertura da missão. O primeiro bloco partirá da inspeção do projeto conhecido e de uma decisão de modelagem proporcional.

### Correção operacional v1.3.2

O Backendverse Playbook v1.3.2 foi adotado sem reiniciar a Boss Battle V nem alterar seu Mapa de Maestria.

`MISSION START` e os blocos ordinários deixam de provocar atualizações na Library, no GitHub ou no `README.md`. A persistência documental passa a ser consolidada no `MISSION ACCOMPLISHED`.

Qualquer snapshot intermediário de continuidade exigirá autorização explícita do aprendiz. Commits de código ou artefatos continuam sendo realizados quando a própria missão exigir trabalho versionado.

### Saga I — O Despertar do Código

A primeira Saga estabeleceu os fundamentos da linguagem Java.

Os Episodes 01–03 trabalharam estrutura básica de programas, classes, objetos, referências, arrays, valores primitivos e null.

A Boss Battle I integrou esses conceitos no Registro da Academia.

### Saga II — O Caminho das Técnicas

Os Episodes 04–06 aprofundaram comportamento dos objetos, métodos, parâmetros, retorno, encapsulamento, loops, testes manuais e uso da API Java.

ArrayList passou a ser utilizada para armazenar e manipular conjuntos de objetos.

A Boss Battle II integrou comportamento, validações, testes e Collections iniciais no Primeiro Sistema da Guilda.

### Saga III — O Legado dos Objetos

O Episode 07 introduziu herança, composição, relações IS-A e HAS-A, sobrescrita e polimorfismo.

O Episode 08 introduziu classes abstratas, interfaces, contratos e programação para abstrações.

O Episode 09 consolidou construtores, sobrecarga, super, inicialização e ciclo de vida dos objetos.

A Boss Battle III — O Torneio dos Arquitetos integrou herança, composição, abstração, interfaces e construtores.

A revisão final da Boss Battle III terminou com 13 PASS e 0 FAIL.

### Saga IV — O Arsenal do Desenvolvedor

Saga concluída.

O Episode 10 — As Leis do Mundo Estático introduziu `static`, constantes, wrappers, autoboxing, unboxing, parsing, utilitários de `Math` e formatação.

O projeto Arsenal Dimensional utilizou estado compartilhado, constantes e cálculos numéricos para catalogar artefatos.

O Episode 11 — O Inventário dos Caçadores introduziu `List`, `Set`, `Map`, generics, `Comparable`, `Comparator`, `equals()` e `hashCode()`.

O Inventário da Guilda separou catálogo, unicidade e estoque entre diferentes Collections. Durante a revisão foram corrigidos contratos de igualdade, ordenação case-insensitive e desempates. A revisão final terminou com 17 PASS e 0 FAIL.

A Boss Battle IV — O Arquivo do Mundo Digital integrou os recursos dos Episodes 10 e 11.

O sistema utilizou:

- `List<Digimon>` para o catálogo;
- `Set<Digimon>` para identidade e controle de duplicidade;
- `Map<Digimon, Integer>` para avistamentos;
- `equals()` e `hashCode()` baseados no código;
- `Comparable` para ordem natural;
- `Comparator` para ranking por ameaça;
- busca exata por código;
- busca parcial por nome;
- estado `static` para objetos construídos;
- autoboxing e unboxing na contagem de avistamentos.

Durante a implementação foram encontrados e corrigidos casos importantes envolvendo uso do retorno de `compareTo()`, direção de ordenações, normalização de texto e comparação incorreta entre wrappers `Integer`.

A revisão final independente terminou com 36 PASS e 0 FAIL.

A Saga IV está oficialmente concluída.

## Última Revisão Técnica

Boss Battle IV — O Arquivo do Mundo Digital aprovada.

O projeto foi inspecionado, compilado e executado.

Foram validados identidade de objetos, contratos de hash, ordem natural, ordem alternativa, buscas, duplicidade, avistamentos, contador static, autoboxing, unboxing e desempates.

Resultado final da bateria independente:

36 PASS
0 FAIL

O caso adicional de empate com contagens acima do cache comum de Integer também foi validado corretamente.

Não existem erros bloqueantes pendentes.
