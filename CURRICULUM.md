# Backendverse Curriculum

**Versão:** 1.5
**Status:** currículo final da campanha
**Função:** garantir a formação de Java Backend Junior por uma sequência explícita de ensino, prática, mini-bosses e projetos executáveis.
**Método de ensino e avaliação:** `PLAYBOOK.md`.

---

## 1. Contrato curricular

Este documento define o que não pode ser omitido e fornece o plano-base que o Sensei deve executar. O briefing traduz esse plano para a conversa; não redesenha a missão a partir de uma lista solta de substantivos.

Cada Episode obrigatório possui:

- capacidade final e pré-requisitos;
- Mapa de Maestria;
- escopo explícito de conceitos, APIs e decisões;
- plano-base de dois a quatro blocos substanciais;
- produto e ponto de parada de cada bloco;
- evidência independente mínima;
- mini-boss integrado como ação final do último bloco.

Contato guiado pode produzir `◐`. `✓` operacional depende da evidência real definida no Playbook. O mini-boss não ensina: comprova transferência usando apenas o arsenal já apresentado.

### 1.1 Adaptação sem improvisação

- A profundidade e o número de microciclos são adaptativos; mapa, ordem, produtos e fronteiras são estáveis.
- O Sensei ensina toda construção nova antes de cobrá-la e oferece uso guiado antes da prova independente.
- Exposição já comprovada pode ser abreviada, mas a evidência independente e o mini-boss permanecem.
- Repetição usa contexto novo e proporcional; não troca nomes numa solução copiável.
- Lacuna descoberta recebe Patch dentro do bloco. Mudar blocos ou artefato exige evidência, corte natural e concordância.
- Conteúdo relacionado fora do escopo precisa ter destino explícito; não entra disfarçado como “dica”.

Salvo indicação contrária, cada missão obrigatória depende da missão obrigatória anterior. Em todo Episode ainda não concluído, a última entrega do plano culmina no mini-boss obrigatório do Playbook, mesmo quando a linha da tabela possui outro nome. O desafio integra o mapa daquele Episode, usa contexto novo e não apresenta API inédita.

Os planos detalhados são obrigatórios a partir do Episode 12. Episodes 01–11 e Boss Battles I–IV permanecem como histórico aprovado. Se reabertos por auditoria, recebem Revisit específico sem reescrever a conquista original.

O **Head First Java / Use a Cabeça Java — 3ª edição** orienta o Core Java até Exceptions. O Episode 14 completa tipos modernos essenciais ao backend. A partir daí, a trilha profissional é ensinada desde os fundamentos.

### 1.2 Perfil de saída: Java Backend Junior

O currículo só termina quando houver evidência integrada destas capacidades:

| Eixo | Cobertura obrigatória |
|---|---|
| Java e modelagem | objetos, OOP, Collections, generics, exceptions, lambdas/Streams, `Optional`, `enum`, `record`, imutabilidade, `BigDecimal` e `java.time` |
| Ferramentas | Maven, dependências, Git, JSON, diagnóstico de build e JUnit |
| Dados | SQL, modelagem relacional, índices e planos básicos, PostgreSQL, JDBC e transações |
| Web | HTTP, REST, JSON, contratos, statuses e cliente HTTP |
| Spring | Boot, configuração externa, injeção, controllers, services, repositories e profiles |
| Persistência | JPA/Hibernate, relações, migrations e fronteiras transacionais |
| API profissional | DTOs, validação, erros globais, paginação, segurança e OpenAPI |
| Qualidade e entrega | unitários, mocks, integração, Testcontainers, logs, health/Actuator, Docker, CI e deploy reproduzível |

O perfil é de entrada profissional sólida, não de senioridade. Concorrência avançada, mensageria, cache distribuído, microserviços, Kubernetes e cloud específica ficam nos arcos avançados após o exame final.

### 1.3 Destinos que não podem ser esquecidos

| Conteúdo | Missão de domínio |
|---|---|
| interfaces funcionais padrão, method references, collectors e `Optional` seguro | Episode 12 / Revisit 12 de transição |
| exceptions, recursos e integridade diante de falha | Episode 13 |
| `enum`, `record`, imutabilidade, `BigDecimal` e `java.time` | Episode 14 |
| testes parametrizados | Episode 17 |
| branches e integração Git | Episode 18 |
| índices e `EXPLAIN` | Episode 20 |
| configuração externa, profiles, secrets, logs e Actuator | Episode 32 |
| migrations | Episode 38 |
| `@Transactional` e rollback de serviço | Episode 40 |
| Mockito e Testcontainers | Episode 45 |
| autenticação, autorização e JWT | Episode 46 |
| Docker, CI e deploy/health | Episode 47 |

Nenhum desses itens pode ser presumido antes do destino. Se uma missão anterior precisar dele apenas como infraestrutura, o Sensei fornece o trecho sem tratá-lo como habilidade aprendida.

### 1.4 Eixos transversais

Do começo ao fim, toda aplicação proporcional também exercita:

- leitura de erros, stack traces, logs e documentação oficial;
- depuração por hipótese e observação, não por edição aleatória;
- nomes claros, métodos pequenos, coesão e refatoração preservando comportamento;
- casos normal, inválido, vazio e de limite quando fizerem sentido;
- segredos e artefatos gerados fora do Git;
- commits coerentes e instruções mínimas de reprodução;
- explicação de decisões e limites sem fingir certeza.

Esses eixos não criam cerimônia em cada bloco. Eles reaparecem nos mini-bosses, checkpoints e Boss Battles. A trilha usa um JDK LTS suportado, no mínimo Java 17; a versão exata é fixada quando a campanha entra no Maven.

---

## 2. Saga I — O Despertar do Código

### Episode 01 — O Primeiro Pulso

**Base:** Chapter 1 — *Breaking the Surface*
**Capacidade final:** criar, compilar e executar um programa Java simples.

**Mapa base**

- estrutura de classe;
- `main` como ponto de entrada;
- execução sequencial e saída;
- condicionais e loops iniciais;
- compilação e execução.

### Episode 02 — A Vila dos Moldes

**Base:** Chapter 2 — *A Trip to Objectville*
**Capacidade final:** modelar e utilizar classes e objetos simples.

**Mapa base**

- classe e objeto;
- estado de instância;
- criação e uso de objetos;
- separação entre modelo e execução.

### Episode 03 — O Chakra das Referências

**Base:** Chapter 3 — *Know Your Variables*
**Capacidade final:** prever e manipular valores, referências, arrays e `null`.

**Mapa base**

- valores primitivos;
- referências e compartilhamento;
- arrays de primitivos;
- arrays de objetos;
- `null` e acesso seguro;
- modelo inicial de heap e stack.

### Boss Battle I — O Registro da Academia

Integra Episodes 01–03 em um programa executável.

---

## 3. Saga II — O Caminho das Técnicas

### Episode 04 — O Despertar dos Métodos

**Base:** Chapter 4 — *How Objects Behave*
**Capacidade final:** criar objetos com estado encapsulado e comportamento coerente.

**Mapa base**

- métodos e chamadas;
- parâmetros e argumentos;
- retorno;
- estado interno;
- atributos privados;
- responsabilidades.

### Episode 05 — A Provação dos Cem Alvos

**Base:** Chapter 5 — *Extra-Strength Methods*
**Capacidade final:** planejar, implementar e testar manualmente um programa completo proporcional.

**Mapa base**

- planejamento;
- escolha entre `for` e `while`;
- índices e contadores;
- rastreamento de fluxo;
- casos positivos e negativos;
- testes manuais observáveis.

### Episode 06 — A Biblioteca dos Sábios

**Base:** Chapter 6 — *Using the Java Library*
**Capacidade final:** consultar a API Java e usar `ArrayList` tipado em um sistema pequeno.

**Mapa base**

- imports e biblioteca;
- consulta de métodos da API;
- `ArrayList` com generics;
- adicionar, acessar, buscar e remover;
- índices e referências válidas;
- colaboração entre objetos.

### Boss Battle II — O Primeiro Sistema da Guilda

Integra Episodes 04–06 em um sistema executável com comportamento, validações, testes e `ArrayList`.

---

## 4. Saga III — O Legado dos Objetos

### Episode 07 — A Herança dos Clãs

**Base:** Chapter 7 — *Inheritance and Polymorphism*
**Capacidade final:** escolher e implementar herança ou composição com justificativa.

**Mapa base**

- relações IS-A e HAS-A;
- `extends`;
- sobrescrita;
- referências de superclasse;
- despacho polimórfico;
- herança versus composição.

### Episode 08 — O Torneio das Mil Formas

**Base:** Chapter 8 — *Interfaces and Abstract Classes*
**Capacidade final:** criar e utilizar abstrações com propósito.

**Mapa base**

- classes abstratas;
- membros abstratos e concretos;
- interfaces como contratos;
- referências polimórficas;
- programação para abstrações;
- escolha entre interface e classe abstrata.

### Episode 09 — O Ciclo das Almas no Heap

**Base:** Chapter 9 — *Constructors and Garbage Collection*
**Capacidade final:** garantir nascimento válido e explicar o ciclo básico dos objetos.

**Mapa base**

- construtores;
- invariantes de nascimento;
- sobrecarga;
- `this()` e `super()`;
- heap e stack;
- alcance de referências e coleta.

### Boss Battle III — O Torneio dos Arquitetos

Integra Episodes 07–09 em um projeto executável com hierarquia, composição, abstrações e construtores.

---

## 5. Saga IV — O Arsenal do Desenvolvedor

### Episode 10 — As Leis do Mundo Estático

**Base:** Chapter 10 — *Numbers and Statics*
**Capacidade final:** usar estado compartilhado e ferramentas numéricas conscientemente.

**Mapa base**

- estado de instância versus `static`;
- métodos e membros `static`;
- constantes `static final`;
- wrappers;
- autoboxing e unboxing;
- parsing;
- `Math`;
- formatação básica.

### Episode 11 — O Inventário dos Caçadores

**Base:** Chapter 11 — *Collections and Generics*
**Capacidade final:** modelar, implementar e testar armazenamento, identidade, busca e ordenação.

**Mapa base**

- `List`, `Set` e `Map` por responsabilidade;
- generics;
- `equals()` e `hashCode()`;
- `Comparable`;
- `Comparator`;
- desempates determinísticos;
- busca exata e parcial;
- duplicidade e contagem;
- independência da ordem de estruturas hash.

### Boss Battle IV — O Arquivo do Mundo Digital

Integra Episodes 10–11. Exige projeto executável e revisão adversarial real.

---

## 6. Saga V — O Fluxo e o Caos Controlado

### Episode 12 — A Respiração dos Fluxos

**Base:** Chapter 12 — *Lambdas and Streams*
**Pré-requisitos:** Collections, generics, `equals`/`hashCode` e `Comparator` do Episode 11.
**Capacidade final:** escolher contratos funcionais e construir pipelines legíveis, seguros e autorais sem depender de um molde copiado.

**Mapa base**

- lambda, tipo-alvo e interface funcional;
- `Predicate`, `Function`, `Consumer` e `Supplier`;
- reconhecimento de `UnaryOperator` e `BinaryOperator`;
- method references;
- criação, consumo único e lazy evaluation de `Stream`;
- `filter`, `map`, `flatMap`, `distinct` e `sorted`;
- operações terminais, curto-circuito e efeitos colaterais;
- `toList()`, `collect()` e collectors essenciais;
- `reduce()` com e sem identidade;
- `Optional` para ausência, transformação segura e limites de uso;
- composição legível;
- escolha entre Stream e abordagem imperativa.

**Escopo ensinado:** `Predicate.test`, `Function.apply`, `Consumer.accept`, `Supplier.get`, referências de método equivalentes a lambdas já entendidas, `stream`, `filter`, `map`, `flatMap`, `distinct`, `sorted`, `forEach`, `count`, `anyMatch`, `findFirst`, `min`, `max`, `toList`, `collect`, `Collectors.toList`, `joining`, `groupingBy` e `counting`, as duas formas pedagógicas de `reduce`, `Optional.empty/of/ofNullable`, `map`, `filter`, `orElse`, `orElseGet` e `orElseThrow`. O Episode explicita que `Stream.toList()` devolve lista não modificável e que a mutabilidade de um resultado depende do collector contratado; também ensina por que evitar `Optional.get`, `null` dentro de `Optional` e `Optional` como campo ou parâmetro sem necessidade. Paralelismo, o `reduce` de três argumentos e collectors avançados ficam fora do Episode.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. O arsenal funcional | lambda, tipo-alvo, quatro interfaces padrão, operators e method references | Laboratório guiado compara contratos e depois o aprendiz cria comportamentos novos para cada papel. Termina quando ele escolher a interface pela assinatura e executar as quatro formas sem adivinhação. |
| 2. Domar o fluxo | ciclo do Stream, lazy evaluation, `filter`, `map`, `flatMap`, `distinct`, `sorted`, consumo único e legibilidade | Pipelines guiados tornam a avaliação visível; dois pipelines curtos são modificados pelo aprendiz. Termina quando um elemento puder ser rastreado e uma coleção aninhada achatada conscientemente. |
| 3. Terminar, reduzir e representar o vazio | terminais, curto-circuito, collectors, `reduce` e `Optional` seguro | Exemplos cobrem famílias de operações antes de dois métodos independentes: uma agregação e uma busca ausente. Termina após normal, vazio, borda e explicação da identidade correta. |
| 4. Mini-boss — O Santuário dos Fluxos | composição, escolha Stream × imperativo e mapa completo | Em domínio novo, o aprendiz implementa seleção/transformação, agrupamento ou agregação e busca opcional; o harness fornecido executa tudo. Termina com revisão, comparação justificada com laço e zero API surpresa. |

**Evidência mínima obrigatória**

- aplicação Java executável criada para o Episode;
- uso executável das quatro interfaces funcionais padrão e reconhecimento dos operators;
- ao menos um method reference equivalente a lambda compreendida;
- pipeline guiado com avaliação visível;
- pelo menos três operações independentes de formas diferentes, incluindo `flatMap`, collector ou agrupamento e `reduce`;
- `Optional` real com fallback lazy ou `orElseThrow` conscientemente escolhido;
- mini-boss autoral executado em cenários normal, vazio e de borda;
- explicação do caminho de um elemento, da identidade de um `reduce` e da escolha Stream versus laço.

Previsões e leitura de pipelines servem para diagnóstico, mas não concluem o Episode.

### Revisit 12 — O Arsenal Funcional

**Natureza:** transição obrigatória exclusiva da campanha que concluiu o Episode 12 sob o Curriculum v1.4.1. A aprovação histórica e o artefato permanecem válidos; o Revisit fecha a diferença de cobertura antes do Episode 13.
**Pré-requisitos:** Episode 12 aprovado e código real disponível.
**Capacidade final:** completar e reter o arsenal funcional acrescentado pela v1.5 sem refazer o Episode inteiro.

**Mapa de recuperação**

- `Predicate`, `Function`, `Consumer` e `Supplier` por assinatura e uso;
- `UnaryOperator`, `BinaryOperator` e method references;
- `flatMap`;
- `distinct`, `sorted`, `collect`, `joining`, `groupingBy` e `counting`;
- `reduce` com identidade segura e sem identidade;
- `Optional.map`, `filter`, `orElseGet` e `orElseThrow`;
- transferência integrada.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Dar nome aos contratos | interfaces padrão, operators e method references | Conteúdo curto e exemplos são seguidos por um laboratório autoral de transformação, teste, consumo e fornecimento. Termina quando assinatura e comportamento estiverem ligados em código executado. |
| 2. Abrir as rotas perdidas | `flatMap`, collectors, formas de `reduce` e `Optional` seguro | Cada API recebe modelo genérico antes de uma operação nova do aprendiz. Termina após vazio, borda e uma identidade adversarial que não presuma números positivos. |
| 3. Mini-boss — A Arena das Funções | mapa de recuperação completo | Em domínio diferente do Episode 12, o aprendiz implementa três operações integradas e executa um harness final fornecido. Termina com revisão real e todos os itens comprovados, sem alterar o artefato histórico. |

**Evidência mínima:** arquivo executável novo para o Revisit, pelo menos uma criação autoral por papel funcional, `flatMap`, collector, `reduce` seguro, `Optional` com caminho vazio, mini-boss e harness final. A pasta só é criada quando o arquivo existir.

### Episode 13 — O Guardião das Exceções

**Base:** Chapter 13 — *Exception Handling*
**Pré-requisitos:** Revisit 12 concluído nesta campanha; classes, métodos, estado e `Optional`.
**Capacidade final:** implementar, lançar, propagar, capturar e recuperar falhas em código executável.

**Mapa base**

- propósito de exception;
- fluxo de `try` e `catch`;
- tratamentos específicos, ordem e hierarquia;
- checked versus unchecked;
- `throw`;
- `throws`;
- exception customizada;
- mensagem, dados úteis e encadeamento de causa;
- escolha entre tratar e propagar;
- `finally` e `try-with-resources`;
- preservação de estado em caso de falha;
- fallback somente quando produz resultado válido.

**Escopo ensinado:** fluxo normal e excepcional, `Exception` versus `RuntimeException`, catches do específico para o geral, criação completa de exception checked e unchecked, construtores, `throw`, declaração `throws`, rethrow, cause chaining, `finally`, `AutoCloseable` e `try-with-resources`. A escolha checked/unchecked é ensinada como decisão de contrato e possibilidade razoável de recuperação, não como tabela mecânica nem meio de “garantir retorno”. Logging profissional fica no Episode 32; tradução HTTP de erros, no Episode 42.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Quando o fluxo quebra | propósito, fluxo, hierarquia, checked e unchecked | Laboratório guiado mostra caminho normal, lançamento e ordem de catches; depois o aprendiz corrige classificações em casos concretos. Termina quando cada escolha tiver consequência compilável e observável. |
| 2. Criar e lançar o guardião | `throw`, `throws`, construtores, customização, causa e estado | Após exemplo genérico completo, o aprendiz cria uma checked exception com dados úteis e a lança antes de qualquer mutação. Termina quando chamada propagar ou capturar e falha preservar o estado. |
| 3. Sair da ruína com os recursos | tratamento versus propagação, fallback, `finally`, `AutoCloseable` e try-with-resources | Recurso fornecido torna abertura e fechamento observáveis; o aprendiz implementa fluxos local, propagado e recuperável. Termina quando recurso fechar em sucesso e falha, sem fallback mentiroso. |
| 4. Mini-boss — A Fortaleza Inquebrável | mapa completo | Em domínio novo, o aprendiz protege uma operação composta com validação, exception customizada e decisão de tratamento; harness testa sucesso, inválido, falha intermediária, estado e recurso. Termina após revisão e defesa do fluxo. |

**Evidência mínima obrigatória**

- aplicação Java executável criada ou evoluída para o Episode;
- criação independente de uma exception customizada depois de exemplo genérico;
- chamada que exige captura ou propagação de checked exception;
- cenário unchecked justificado;
- `try`/`catch` com comportamento observável;
- causa preservada quando uma falha é traduzida;
- `try-with-resources` fechando em sucesso e falha;
- verificação de que falha não corrompe estado;
- mini-boss executado e fluxo completo explicado.

### Episode 14 — Os Tipos do Tempo e do Valor

**Base:** complemento de Core Java moderno para backend.
**Pré-requisitos:** Episodes 01–13 e Revisit 12.
**Capacidade final:** modelar valores de domínio imutáveis, precisos e temporalmente corretos usando tipos adequados.

**Mapa base**

- `enum` com comportamento e valores válidos fechados;
- `record` como portador imutável de dados;
- imutabilidade, cópia defensiva e validação de nascimento;
- igualdade de valores;
- `BigDecimal`, escala, arredondamento e comparação;
- `LocalDate`, `LocalDateTime` e `Instant`;
- `Duration` e `Period`;
- parsing e formatação com `DateTimeFormatter`;
- diferença entre horário local, instante e fuso;
- escolha do tipo pelo significado do domínio.

**Escopo ensinado:** declaração e uso de `enum` e `record`, compact constructor, `BigDecimal` criado por `String`/`valueOf`, `add`, `subtract`, `multiply`, `divide` com rounding explícito, `compareTo`, principais tipos imutáveis de `java.time`, parse/format e aritmética. Persistência JPA e serialização desses tipos aparecem em seus Episodes profissionais.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Fechar os estados válidos | `enum`, comportamento e escolha de tipo | Estado textual frágil é substituído por enum guiado; o aprendiz cria outro enum com regra pequena. Termina após valor válido, transição e entrada inválida. |
| 2. Forjar valores imutáveis | `record`, invariantes, igualdade e cópia defensiva | Exemplo mostra semântica de valor; o aprendiz cria record validado e comprova igualdade e imutabilidade. Termina sem expor coleção mutável interna. |
| 3. Medir sem distorcer | `BigDecimal` e `java.time` | Laboratórios mostram erro de `double`, identidade decimal e diferença entre data local e instante; operações autorais cobrem dinheiro, duração e formatação. Termina após bordas de arredondamento e tempo. |
| 4. Mini-boss — O Cofre Cronal | integração dos tipos | Pequeno domínio de reserva ou cobrança é implementado com enum, record, valor monetário e tempo. Harness fornecido executa sucesso, entrada inválida, arredondamento e limite temporal. Termina com defesa dos tipos escolhidos. |

**Evidência mínima:** aplicação autoral executável com `enum`, `record` validado, `BigDecimal` sem construção imprecisa, `java.time`, casos de borda e mini-boss final.

### Boss Battle V — A Graduação do Core Java

Integra modelagem, Collections, generics, arsenal funcional, `Optional`, exceptions e tipos modernos em aplicação nova.

**Pré-condições**

- Revisit 12 e Episodes 13–14 aprovados com evidência executável independente;
- nenhuma API essencial à solução ainda desconhecida;
- briefing e escopo aprovados antes de `MISSION START`.

**Mapa de convergência**

- modelar responsabilidades coerentes;
- escolher Collections e generics;
- escrever pipelines adequados;
- representar ausência conscientemente;
- implementar e tratar falhas;
- preservar estado diante de erro;
- modelar estados, dinheiro e tempo com tipos adequados;
- testar cenários principais e adversariais;
- explicar e defender o código criado.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Erguer o domínio | responsabilidades, objetos, Collections, generics e tipos de valor | Modelo e armazenamento de uma aplicação nova, escritos pelo aprendiz e compilando. Termina quando identidades, invariantes e operações obrigatórias estiverem concretas. |
| 2. Fazer os dados fluírem | pipelines, `Optional` e composição legível | Consultas e agregações implementadas sem algoritmo central fornecido. Termina após execução de resultados presentes, ausentes e de borda. |
| 3. Proteger o estado | exceptions, decisões de tratamento e integridade | Regras inválidas falham de modo observável sem corromper estado. Termina após testes manuais positivos e adversariais. |
| 4. Graduação | integração, testes e defesa | Aplicação completa executada pelo `main` ou harness integrado, revisão adversarial e explicação das decisões. Termina apenas quando todos os critérios de convergência possuírem evidência real. |

**Evidência final:** aplicação nova escrita pelo aprendiz, ponto de entrada integrado pelo Sensei quando não for alvo, execução única reproduzível e revisão adversarial.

---

## 7. Side Quests opcionais

### Side Quest 01 — As Portas da Interface

**Base:** Chapter 14 — GUI, eventos, listeners, desenho e classes internas.
**Capacidade final:** construir e explicar uma interação gráfica simples sem misturar todo o comportamento na janela.

**Mapa base**

- janela e componentes;
- eventos e listeners;
- atualização da interface;
- desenho básico;
- classes internas;
- separação mínima de responsabilidades.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Abrir a janela | janela, componentes e execução | Interface mínima fornecida parcialmente e executada. Termina quando o aprendiz identificar criação, exibição e ciclo básico. |
| 2. Reagir ao mundo | eventos, listeners e classes internas | Interação guiada seguida de um comportamento novo escrito pelo aprendiz. Termina quando um evento alterar o estado visível corretamente. |
| 3. Desenhar com propósito | desenho e responsabilidades | Pequena aplicação gráfica independente. Termina após execução e revisão da separação entre interface e comportamento. |

**Evidência mínima:** aplicação desktop executável com ao menos uma interação autoral e explicação do fluxo do evento.

### Side Quest 02 — O Laboratório Swing

**Base:** Chapter 15 — componentes, layouts e organização de interfaces desktop.
**Capacidade final:** organizar uma interface Swing pequena com layout previsível e código sustentável.

**Mapa base**

- componentes Swing;
- gerenciadores de layout;
- composição de painéis;
- entrada e saída visual;
- estado da interface;
- organização do código.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Organizar o laboratório | componentes, painéis e layouts | Duas disposições comparadas em código executável. Termina quando o aprendiz prever como o layout reage ao redimensionamento. |
| 2. Entrada, estado e resposta | entrada, saída e estado visual | Formulário pequeno com validação proporcional. Termina quando os caminhos válido e inválido forem observados. |
| 3. Montagem independente | composição e organização | Interface independente construída a partir de requisitos visuais simples. Termina após execução e revisão. |

**Evidência mínima:** aplicação Swing executável, com layout, entrada, evento e comportamento escritos pelo aprendiz.

Não bloqueiam a trilha profissional.

---

## 8. Saga VI — A Ponte para o Backend

### Episode 15 — O Ritual Maven

**Capacidade final:** criar, executar e diagnosticar um build Maven reproduzível.

**Mapa base**

- propósito de build tool;
- estrutura padrão `src/main` e `src/test`;
- `pom.xml`;
- coordenadas `groupId`, `artifactId` e `version`;
- versão do Java e configuração do compilador;
- Maven Wrapper;
- fases `clean`, `compile`, `test`, `package` e `verify`;
- diretório `target` e artefato;
- leitura de falhas de build.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Ler o ritual | build tool, estrutura, POM, coordenadas e Java | Projeto Maven mínimo criado com orientação, JDK LTS fixado e compilado pela linha de comando ou IntelliJ. Termina quando cada parte essencial puder ser localizada e explicada. |
| 2. Percorrer o ciclo | fases, `target` e empacotamento | Sequência `clean`, `compile`, `test`, `package` e `verify` executada; artefatos são inspecionados. Termina quando o aprendiz relacionar comando, fase e resultado. |
| 3. Reconstruir sem magia | Wrapper, build reproduzível e diagnóstico | Pequeno projeto Maven é montado ou reparado e executado pelo Wrapper a partir de estado limpo. Termina após correção de ao menos uma falha real de build. |

**Evidência mínima:** `pom.xml` autoral, JDK fixado, estrutura válida, Maven Wrapper, `mvnw clean verify` bem-sucedido, artefato observado e diagnóstico explicado.

### Episode 16 — A Forja das Dependências

**Capacidade final:** adicionar e diagnosticar dependências e plugins sem transformar o `pom.xml` em tentativa e erro.

**Mapa base**

- coordenadas de dependência;
- resolução e repositório local;
- dependências transitivas;
- scopes `compile`, `test`, `runtime` e `provided`;
- diferença entre dependência e plugin;
- goals e vínculo com fases;
- árvore de dependências;
- organização de pacotes.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Alimentar a forja | declaração, resolução e transitividade | Biblioteca pequena adicionada e usada em código executável; árvore de dependências inspecionada. Termina quando origem direta e transitiva forem distinguidas. |
| 2. Dar função a cada ferramenta | scopes, plugins, goals e pacotes | Dependências de produção e teste classificadas, plugin simples executado e pacotes reorganizados. Termina quando cada escolha tiver justificativa. |
| 3. Diagnosticar a liga | versões, scopes e build | Configuração defeituosa reparada e nova dependência incorporada sem molde central. Termina com `clean verify` e explicação da causa da falha. |

**Evidência mínima:** uso real de dependência, scope coerente, plugin reconhecido, árvore inspecionada e build reproduzível.

### Episode 17 — O Tribunal dos Testes

**Capacidade final:** escrever testes JUnit úteis, independentes e executáveis pelo Maven.

**Mapa base**

- propósito do teste automatizado;
- `@Test`;
- Arrange, Act, Assert;
- assertions essenciais;
- `assertThrows`;
- `@ParameterizedTest` e fontes simples de argumentos;
- casos positivos, negativos e de borda;
- independência e repetibilidade;
- nomes e mensagens diagnósticas;
- execução com Maven.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Abrir o tribunal | `@Test`, AAA e assertions | Teste guiado executado pelo Maven e falha proposital interpretada. Termina quando o aprendiz localizar preparação, ação e verificação. |
| 2. Construir o caso | positivos, negativos, bordas, `assertThrows` e parametrização | Conjunto independente de testes para comportamento conhecido, incluindo tabela pequena de casos. Termina quando uma implementação defeituosa for detectada por ao menos um teste autoral. |
| 3. Julgamento reproduzível | independência, nomes e execução | Suíte revisada para eliminar dependência de ordem e estado compartilhado. Termina com `mvn test` repetido com o mesmo resultado. |

**Evidência mínima:** testes autorais que passam, teste que demonstra falha útil, cenário excepcional, teste parametrizado de bordas e execução Maven reproduzível.

### Episode 18 — Os Pergaminhos JSON e o Git da Guilda

**Capacidade final:** transformar objetos em JSON e preservar a evolução do trabalho em um histórico Git compreensível.

**Mapa base**

- objetos, arrays e tipos JSON;
- diferença entre objeto Java e representação JSON;
- serialização e desserialização;
- mapeamento de campos;
- falha de entrada JSON;
- `status`, `diff`, staging e commit;
- commits coerentes;
- remotes, `fetch`, `pull` e `push`;
- branches, merge, conflito e histórico;
- pull request como revisão e integração;
- `.gitignore` e artefatos gerados.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Ler o pergaminho | estrutura e tipos JSON | Exemplos normais e inválidos rastreados; JSON pequeno escrito pelo aprendiz. Termina quando estrutura, valor e ausência não forem confundidos. |
| 2. Traduzir entre mundos | serialização, desserialização e campos | Round trip guiado seguido de conversão independente usando biblioteca já declarada no Maven. Termina após casos normal e inválido. |
| 3. Registrar a jornada | `status`, `diff`, staging, commits e `.gitignore` | Mudanças reais separadas em commits coerentes pelo aprendiz. Termina quando cada diff e mensagem corresponderem a uma intenção. |
| 4. Preservar sem esconder | remotes, branches, conflito, pull request e histórico | Pequena evolução é publicada em branch, revisada e integrada após resolver conflito controlado sem perder trabalho. Termina com aplicação e testes reproduzíveis no estado final. |

**Evidência mínima:** aplicação Maven com JSON lido e produzido, erro inválido observado e fluxo Git real com branch, remote, push, revisão, conflito controlado e integração inspecionada.

### Checkpoint — O Ambiente Profissional

**Capacidade final:** entregar uma aplicação Java pequena que outra pessoa consiga obter, construir, testar e compreender.

**Mapa de convergência**

- estrutura Maven reproduzível;
- dependências e plugins controlados;
- organização de pacotes;
- testes automatizados úteis;
- leitura e escrita de JSON;
- diagnóstico de build;
- histórico Git coerente.

**Plano-base — 3 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Preparar o ambiente | Maven, dependências e pacotes | Projeto novo estruturado sem copiar projeto anterior. Termina quando `clean compile` funcionar em estado limpo. |
| 2. Construir e provar | regra pequena, JSON e JUnit | Funcionalidade implementada, serializada e coberta por testes autorais. Termina com `clean verify`. |
| 3. Entregar a guilda | Git, diagnóstico e reprodução | Histórico revisado, instruções mínimas e reprodução a partir do repositório. Termina após revisão adversarial do build e dos testes. |

**Evidência final:** repositório Maven executável com dependências, JSON, testes e commits reais inspecionados.

---

## 9. Saga VII — O Reino dos Dados

**Ambiente padrão das Sagas VII–VIII:** PostgreSQL local para os Episodes 19–27. Instalação, credenciais de desenvolvimento e comandos de inicialização são infraestrutura fornecida pelo Sensei, não prova do conteúdo. Se o ambiente impedir PostgreSQL, um único substituto relacional é acordado para as duas Sagas; não se troca de motor por Episode.

### Episode 19 — As Tabelas da Verdade

**Capacidade final:** criar e executar um esquema relacional pequeno que proteja dados básicos por restrições.

**Mapa base**

- banco, esquema e tabela;
- linhas e colunas;
- tipos SQL;
- `NULL` e `IS NULL`;
- chave primária;
- `NOT NULL`, `UNIQUE`, `CHECK` e `DEFAULT`;
- criação e inspeção de tabela;
- leitura de erro de restrição.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Dar forma aos dados | tabela, linha, coluna e tipos | Tabela guiada criada e inspecionada no PostgreSQL. Termina quando cada coluna tiver tipo coerente e o aprendiz distinguir estrutura de conteúdo. |
| 2. Escrever as leis | `NULL`, chave e restrições | Restrições adicionadas e violações executadas intencionalmente. Termina quando o banco aceitar dados válidos e rejeitar inválidos pelos motivos esperados. |
| 3. Erguer um esquema independente | DDL e diagnóstico | Script autoral cria do zero um esquema pequeno e repetível. Termina após execução limpa e revisão dos limites protegidos. |

**Evidência mínima:** script SQL executável, esquema recriável, inserções válidas e violações de ao menos três restrições observadas.

### Episode 20 — O Oráculo das Consultas

**Capacidade final:** escrever, depurar e inspecionar consultas que retornem exatamente o conjunto solicitado sem ignorar custo básico.

**Mapa base**

- `SELECT`, `FROM` e aliases;
- projeção de colunas;
- `WHERE`;
- operadores de comparação e lógicos;
- `LIKE`, `IN` e `BETWEEN`;
- tratamento de `NULL` em filtros;
- `ORDER BY`, desempates e `LIMIT`;
- agregações básicas;
- leitura incremental de consultas;
- finalidade e custo de índices;
- `EXPLAIN` e leitura básica de plano.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Perguntar com precisão | seleção, projeção, aliases e filtros | Consultas guiadas seguidas de filtros autorais. Termina quando resultado e linhas excluídas puderem ser explicados. |
| 2. Combinar critérios | operadores, texto, conjuntos, intervalos e `NULL` | Consultas independentes com critérios combinados e precedência explícita. Termina após cenários com resultado, vazio e valores nulos. |
| 3. Ordenar e resumir | ordenação, desempate, limite e agregações | Relatório pequeno com ordem determinística e medidas agregadas. Termina após depuração de uma consulta defeituosa e validação manual do resultado. |
| 4. Enxergar o caminho | índices, seletividade e `EXPLAIN` | Uma consulta sobre massa proporcional é observada antes e depois de índice coerente; índices inúteis também são discutidos. Termina quando plano, resultado e custo não forem confundidos e o mini-boss consultar com precisão. |

**Evidência mínima:** arquivo de consultas executadas sobre dados conhecidos, incluindo filtros, `NULL`, ordenação determinística, agregação, caso vazio, índice justificado, `EXPLAIN` comparado e mini-boss.

### Episode 21 — As Escrituras Mutáveis

**Capacidade final:** inserir, alterar e remover dados sem atingir linhas além das pretendidas.

**Mapa base**

- `INSERT` de uma e várias linhas;
- colunas explícitas e valores padrão;
- `UPDATE` com filtro;
- `DELETE` com filtro;
- contagem e inspeção de linhas afetadas;
- transações básicas;
- `COMMIT` e `ROLLBACK`;
- verificação antes e depois da mudança.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Registrar sem ambiguidade | `INSERT`, defaults e restrições | Dados normais e inválidos inseridos em laboratório. Termina quando colunas omitidas e valores padrão forem compreendidos. |
| 2. Alterar com alvo | `UPDATE`, `DELETE`, filtros e linhas afetadas | Mudanças guiadas e independentes executadas sempre com seleção prévia. Termina quando somente o conjunto pretendido for alterado. |
| 3. Voltar no tempo | transações, `COMMIT`, `ROLLBACK` e auditoria | Sequência autoral demonstra confirmação e reversão. Termina quando o estado anterior puder ser preservado diante de uma operação incorreta. |

**Evidência mínima:** script DML executado com inserção, atualização, remoção, verificação de linhas afetadas e rollback observado.

### Episode 22 — Os Laços Relacionais

**Capacidade final:** relacionar tabelas e consultar dados combinados sem perder o significado das cardinalidades.

**Mapa base**

- chave primária e estrangeira;
- cardinalidades um-para-um, um-para-muitos e muitos-para-muitos;
- tabela associativa;
- integridade referencial;
- ações diante de exclusão;
- `INNER JOIN`;
- `LEFT JOIN`;
- aliases e colunas ambíguas;
- multiplicação de linhas em joins.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Criar os vínculos | chaves, cardinalidade e integridade | Duas relações modeladas e criadas com foreign keys. Termina quando inserções órfãs forem rejeitadas e a cardinalidade estiver defendida. |
| 2. Cruzar os portais | `INNER JOIN`, aliases e ambiguidade | Consultas combinadas escritas e rastreadas linha por linha. Termina quando origem de cada coluna e repetição de linhas forem explicadas. |
| 3. Preservar ausências | `LEFT JOIN`, associação e exclusão | Consulta e relação muitos-para-muitos independentes. Termina após cenários com vínculo, sem vínculo e tentativa de exclusão conflitante. |

**Evidência mínima:** esquema com foreign keys, relação muitos-para-muitos, joins internos e externos e falha de integridade observada.

### Episode 23 — O Mapa Relacional

**Capacidade final:** transformar requisitos de negócio em um modelo relacional coerente e executável.

**Mapa base**

- descoberta de entidades e atributos;
- escolha de identificadores;
- relações e cardinalidades;
- dependências e redundância;
- primeira, segunda e terceira formas normais em nível básico;
- restrições como regras do modelo;
- dados derivados versus armazenados;
- defesa de decisões e trade-offs.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Ler o domínio | entidades, atributos, identificadores e relações | Requisitos pequenos convertidos em modelo conceitual. Termina quando cada elemento tiver origem numa regra do problema. |
| 2. Remover distorções | redundância, dependências e normalização | Modelo propositalmente ruim corrigido até normalização proporcional. Termina quando anomalias de inserção, atualização e exclusão forem explicadas. |
| 3. Materializar o mapa | DDL, restrições e trade-offs | Modelo autoral implementado no PostgreSQL com dados de prova. Termina após consultas essenciais e defesa das escolhas. |

**Evidência mínima:** modelo autoral, script DDL executável, dados de exemplo, relações, restrições e explicação de uma decisão de normalização.

### Checkpoint — O Arquivo Relacional

**Capacidade final:** entregar um banco relacional pequeno, reproduzível e útil para regras reais de consulta e alteração.

**Mapa de convergência**

- modelagem e normalização;
- DDL reproduzível;
- integridade por restrições;
- dados de teste coerentes;
- consultas simples e joins;
- agregação e ordenação;
- DML seguro e transações;
- defesa do modelo.

**Plano-base — 3 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Projetar o arquivo | requisitos, modelo e DDL | Domínio novo modelado e esquema recriável executado. Termina quando regras estruturais estiverem no banco. |
| 2. Fazer o arquivo responder | dados, consultas, joins e agregações | Massa de teste e consultas de negócio autorais. Termina quando resultados esperados puderem ser conferidos manualmente. |
| 3. Alterar sem destruir | DML, transações e revisão adversarial | Operações de escrita seguras, rollback e bateria de integridade. Termina com reconstrução completa do banco a partir dos scripts. |

**Evidência final:** conjunto versionado de scripts que cria, popula, consulta e altera o banco PostgreSQL do zero, seguido de revisão adversarial.

---

## 10. Saga VIII — A Ponte JDBC

### Episode 24 — O Portal da Conexão

**Capacidade final:** abrir, usar e fechar uma conexão JDBC real com diagnóstico seguro de falhas.

**Mapa base**

- papel do driver JDBC;
- URL de conexão;
- `DriverManager` e `Connection`;
- configuração fora do código;
- `SQLException`;
- `try-with-resources`;
- ciclo de vida e fechamento;
- falhas de autenticação, endereço e disponibilidade.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Identificar o portal | driver, URL e configuração | Projeto Maven recebe o driver e monta uma conexão guiada com configuração de desenvolvimento. Termina quando cada parte da URL e da dependência for localizada. |
| 2. Abrir e fechar corretamente | `Connection`, `SQLException` e `try-with-resources` | Conexão real aberta, validada e fechada de modo observável. Termina quando o recurso for liberado nos caminhos normal e excepcional. |
| 3. Diagnosticar portais quebrados | falhas de conexão e segurança de configuração | Cenários inválidos controlados são executados e diagnosticados sem expor credenciais. Termina quando causa, mensagem útil e ponto de tratamento forem explicados. |

**Evidência mínima:** aplicação Maven conecta ao PostgreSQL, fecha recursos, mantém credenciais fora do código versionado e demonstra diagnóstico de falha controlada.

### Episode 25 — As Queries Seladas

**Capacidade final:** executar consultas e alterações parametrizadas sem concatenar entrada em SQL.

**Mapa base**

- `Statement` e seus limites;
- `PreparedStatement`;
- placeholders e vinculação de parâmetros;
- `executeQuery` e `executeUpdate`;
- contagem de linhas afetadas;
- tipos de parâmetros;
- SQL injection e separação entre comando e dado;
- chaves geradas.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Separar comando de dado | `Statement`, `PreparedStatement` e injection | Exemplo vulnerável analisado e substituído por consulta parametrizada guiada. Termina quando entrada deixar de alterar a estrutura SQL. |
| 2. Consultar e modificar | parâmetros, query, update e linhas afetadas | Operações parametrizadas de leitura e escrita executadas. Termina após resultados presente, ausente e alteração com contagem conferida. |
| 3. Selar operações independentes | tipos, chaves geradas e fechamento | Métodos JDBC autorais inserem e consultam dados sem receber o SQL central pronto. Termina com testes automatizados proporcionais e recursos fechados. |

**Evidência mínima:** queries parametrizadas autorais, leitura, alteração, linhas afetadas, chave gerada e demonstração de que entrada maliciosa permanece dado.

### Episode 26 — O Espelho do ResultSet

**Capacidade final:** transformar resultados JDBC em objetos Java sem perder linhas, tipos ou valores nulos.

**Mapa base**

- `ResultSet` e cursor;
- `next()`;
- leitura por rótulo de coluna;
- getters tipados;
- alias SQL e nomes de campos;
- `NULL` e `wasNull()`;
- mapeamento linha-objeto;
- múltiplas linhas e coleção;
- fechamento de recursos.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Mover o espelho | cursor, `next()` e getters | Resultado guiado percorrido com uma e várias linhas. Termina quando o aprendiz explicar posição inicial, avanço e término. |
| 2. Refletir sem distorcer | aliases, tipos, `NULL` e `wasNull()` | Linha com campos opcionais mapeada corretamente e erro comum reproduzido. Termina quando zero, `null` e ausência de linha não forem confundidos. |
| 3. Mapear um conjunto | objetos e coleções | Método autoral converte consulta em objetos tipados. Termina após casos com várias linhas, vazio e recursos fechados. |

**Evidência mínima:** mapeamento autoral de `ResultSet` para objeto e coleção, com alias, campo nulo, resultado vazio e testes executáveis.

### Episode 27 — Os Guardiões DAO

**Capacidade final:** implementar um componente JDBC de persistência com CRUD, transações e responsabilidades claras.

**Mapa base**

- responsabilidade de DAO/Repository;
- separação entre domínio e SQL;
- operações CRUD;
- reutilização de mapeamento;
- ausência em busca por id;
- propagação ou tradução de falhas;
- fronteira de transação;
- commit e rollback JDBC;
- testabilidade e integração real.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Definir o guardião | contrato, domínio e separação de SQL | Interface ou contrato do repositório e primeira operação implementados. Termina quando o domínio não depender de tipos JDBC. |
| 2. Completar o registro | CRUD, mapeamento e ausência | CRUD autoral implementado com `Optional` na busca legítima. Termina após executar criação, leitura, atualização, remoção e inexistência. |
| 3. Proteger operações compostas | transações, commit, rollback e falhas | Regra com duas alterações demonstra atomicidade. Termina quando falha intermediária restaurar o estado anterior. |
| 4. Revisar o guardião | testabilidade, duplicação e integração | DAO reorganizado e submetido a testes de integração reais. Termina quando responsabilidades e SQL puderem ser defendidos. |

**Evidência mínima:** DAO JDBC autoral com CRUD, mapeamento reutilizável, ausência, falha tratada conscientemente, transação e testes contra banco real.

### Checkpoint — O Registro JDBC da Academia

**Capacidade final:** entregar uma aplicação Java que persista e recupere um domínio real por JDBC de forma reproduzível.

**Mapa de convergência**

- configuração e conexão;
- fechamento confiável;
- SQL parametrizado;
- mapeamento objeto-relacional manual;
- CRUD completo;
- ausência e falhas;
- transações e integridade;
- testes de integração;
- build e scripts reproduzíveis.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Preparar o registro | esquema, configuração e conexão | Projeto novo sobe banco a partir dos scripts e conecta sem segredo versionado. Termina com build limpo. |
| 2. Implementar a persistência | DAO, parâmetros e mapeamento | CRUD completo escrito pelo aprendiz. Termina após testes de integração dos caminhos principais. |
| 3. Atacar a integridade | ausência, restrições, falhas e transações | Casos adversariais e rollback executados. Termina quando nenhuma falha parcial corromper o banco. |
| 4. Reproduzir e defender | build, scripts, testes e decisões | Aplicação reconstruída do zero e revisada. Termina com todos os critérios convergentes comprovados. |

**Evidência final:** projeto Maven, scripts SQL, DAO autoral, PostgreSQL real, CRUD, transação, testes e instruções mínimas de reprodução.

---

## 11. Saga IX — Os Protocolos entre Mundos

**Ambiente padrão da Saga:** o Sensei fornece um servidor HTTP local pequeno ou harness equivalente. O aprendiz usa `curl` e arquivos de requisição para observar o protocolo e desenhar contratos; implementar um servidor só passa a ser alvo no Spring Boot.

### Episode 28 — O Pacto Cliente-Servidor

**Capacidade final:** executar uma troca HTTP e explicar o caminho completo entre cliente e servidor.

**Mapa base**

- papéis de cliente e servidor;
- requisição e resposta;
- esquema, host, porta e caminho de uma URL;
- conexão e ciclo de uma chamada;
- protocolo sem estado entre requisições;
- latência e timeout;
- falhas de endereço, conexão e servidor;
- inspeção de uma troca real.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Mapear os dois mundos | cliente, servidor, URL e porta | Requisição guiada enviada ao servidor fornecido e URL desmontada. Termina quando o papel de cada participante e componente puder ser explicado. |
| 2. Acompanhar o mensageiro | requisição, resposta e ausência de estado | Chamadas sucessivas inspecionadas. Termina quando dados enviados e recebidos forem distinguidos e cada requisição puder ser tratada como troca própria. |
| 3. Quando o portal não abre | timeout e falhas de comunicação | Cenários controlados de porta errada, servidor indisponível e demora são observados. Termina quando falha de transporte não for confundida com resposta HTTP. |

**Evidência mínima:** comandos de cliente executados, URL explicada, requisição e resposta inspecionadas e ao menos duas falhas de comunicação diagnosticadas.

### Episode 29 — Os Verbos do Protocolo

**Capacidade final:** escolher método, status, headers e corpo coerentes para uma operação HTTP.

**Mapa base**

- `GET`, `POST`, `PUT`, `PATCH` e `DELETE`;
- métodos seguros e idempotentes;
- famílias de status;
- statuses principais de sucesso e erro;
- headers;
- `Content-Type` e `Accept`;
- corpo da requisição e da resposta;
- HTTP versus HTTPS e exposição de dados sensíveis.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Escolher o verbo | métodos, segurança e idempotência | Operações concretas mapeadas para métodos e executadas no laboratório. Termina quando repetição e intenção de cada método forem defendidas. |
| 2. Ler a resposta | famílias e statuses | Respostas de sucesso, erro do cliente e erro do servidor comparadas. Termina quando status não for tratado como decoração sobre o body. |
| 3. Negociar a mensagem | headers, body, tipos de mídia e HTTPS | Requisições autorais enviam e solicitam JSON corretamente. Termina após diagnosticar incompatibilidade de conteúdo e risco de transporte inseguro. |

**Evidência mínima:** conjunto de requisições executadas com métodos diferentes, statuses interpretados, headers e bodies coerentes e justificativa de idempotência.

### Episode 30 — Rotas, Parâmetros e JSON

**Capacidade final:** desenhar e exercitar endpoints com parâmetros e payloads sem ambiguidade contratual.

**Mapa base**

- endpoint e rota;
- path parameters;
- query parameters;
- headers versus parâmetros;
- payload JSON;
- campos obrigatórios e opcionais;
- tipos e estrutura de resposta;
- representação de erro;
- exemplos de contrato.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Encontrar o endereço | endpoints, paths e path parameters | Rotas guiadas e autorais são chamadas. Termina quando identidade do recurso estiver no lugar correto. |
| 2. Refinar a busca | query parameters, headers e opcionais | Filtros e opções combinados em requisições reais. Termina quando rota, filtro e metadado não forem confundidos. |
| 3. Firmar o contrato JSON | payloads, tipos, obrigatoriedade e erros | Contrato autoral com exemplos válido, inválido, resposta e erro. Termina após execução contra harness e revisão de ambiguidades. |

**Evidência mínima:** coleção versionada de requisições e contrato de endpoints com path, query, JSON, respostas normais e erros.

### Episode 31 — A Lei dos Recursos REST

**Capacidade final:** projetar um contrato REST coerente para um recurso e defendê-lo por comportamento HTTP.

**Mapa base**

- recurso e representação;
- nomes e hierarquia de URLs;
- CRUD mapeado para HTTP;
- coleções e itens;
- criação e localização do novo recurso;
- substituição versus alteração parcial;
- ausência, conflito e entrada inválida;
- consistência de respostas;
- uso sistemático de cliente HTTP.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Modelar recursos | recurso, representação, coleção e item | Domínio concreto convertido em URLs e operações. Termina quando endpoints expressarem recursos em vez de comandos arbitrários. |
| 2. Fechar o CRUD HTTP | métodos, statuses, criação, atualização e ausência | Contrato CRUD completo exercitado no servidor de laboratório. Termina após caminhos normal, inexistente, inválido e conflitante. |
| 3. Caçar inconsistências | payloads, respostas e cliente | Contrato propositalmente inconsistente revisado e contrato autoral testado como coleção de requisições. Termina quando cada decisão puder ser defendida. |

**Evidência mínima:** contrato REST autoral completo, requisições executadas e justificativa de URLs, métodos, statuses, bodies e erros.

### Checkpoint — O Contrato entre Mundos

**Capacidade final:** entregar uma especificação REST executável o bastante para orientar cliente e futuro servidor Spring.

**Mapa de convergência**

- modelo cliente-servidor;
- URLs e recursos;
- métodos e idempotência;
- parâmetros;
- payloads JSON;
- statuses e headers;
- contratos de sucesso e erro;
- coleção de requisições;
- coerência global.

**Plano-base — 3 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Definir o pacto | domínio, recursos e operações | Requisitos novos transformados em tabela de contrato. Termina quando todo caso obrigatório possuir requisição e resposta previstas. |
| 2. Executar o contrato | cliente, parâmetros, JSON e statuses | Coleção autoral de requisições exercita um harness fornecido. Termina quando cenários normais e de erro forem observados. |
| 3. Defender o protocolo | consistência e adversários | Revisão cruza endpoints, nomes, métodos, idempotência e erros. Termina após correções e defesa oral do contrato final. |

**Evidência final:** especificação versionada e coleção executável de requisições cobrindo o contrato completo, sem exigir implementação de servidor pelo aprendiz.

---

## 12. Saga X — A Fortaleza Spring

**Ambiente padrão da Saga:** projeto Maven com uma versão estável do Spring Boot e um JDK LTS compatível, fixados uma vez no briefing da Saga. Até a Boss Battle VI, o estado permanece em memória; banco e JPA não entram pela janela vestidos de NPC.

### Episode 32 — O Portal Spring Boot

**Capacidade final:** criar, configurar, observar e diagnosticar uma aplicação Spring Boot reproduzível em mais de um ambiente.

**Mapa base**

- propósito do Spring Boot;
- estrutura do projeto;
- parent/BOM e starters;
- annotations como metadados e descoberta pelo framework;
- classe com `@SpringBootApplication`;
- inicialização pelo Maven e IDE;
- servidor embarcado e porta;
- configuração em `application.properties` ou YAML;
- configuração externa, variáveis de ambiente e precedência;
- profiles;
- segredos fora do repositório;
- logs e falhas de startup;
- níveis básicos de log;
- Actuator e health check.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Montar o portal | estrutura, starters e classe inicial | Projeto gerado com escolhas explicadas e iniciado. Termina quando o aprendiz localizar entrada, dependências e pacotes. |
| 2. Ver o servidor respirar | execução, porta, configuração e logs | Aplicação acessada por cliente HTTP, configuração simples alterada e log útil emitido. Termina quando mudança de porta e ciclo de startup forem observados. |
| 3. Trocar de dimensão | ambiente, precedência, profiles e segredos | Dois profiles executam configurações diferentes e um valor sensível vem de ambiente sem ser versionado. Termina quando a origem efetiva de cada valor puder ser rastreada. |
| 4. Diagnosticar a abertura | falhas, níveis de log, Actuator, health e build | Problemas controlados de configuração, porta e dependência são corrigidos; health é consultado. Termina com mini-boss, `mvn clean verify` e startup reproduzível. |

**Evidência mínima:** aplicação Spring Boot criada pelo aprendiz, dois profiles, configuração externa sem segredo versionado, logs úteis, health consultado, build limpo e ao menos duas falhas diagnosticadas.

### Episode 33 — Os Controladores da Fortaleza

**Capacidade final:** implementar controllers que cumpram rotas e respostas HTTP já especificadas.

**Mapa base**

- `@RestController`;
- `@RequestMapping`;
- mappings por método HTTP;
- path variables;
- query parameters;
- valores obrigatórios e opcionais;
- retorno serializado;
- status e `ResponseEntity`;
- responsabilidade limitada do controller.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Abrir uma rota | controller, mapping e resposta | Endpoint guiado executado e chamado por cliente. Termina quando anotação, método Java e rota forem relacionados. |
| 2. Receber coordenadas | path e query parameters | Endpoints autorais recebem identidade e filtros. Termina após casos presente, ausente e parâmetro inválido proporcional. |
| 3. Cumprir o contrato | métodos, statuses e responsabilidade | Controller pequeno implementa contrato HTTP fornecido sem lógica de domínio excessiva. Termina com requisições e testes automatizados. |

**Evidência mínima:** endpoints autorais com métodos, path, query, serialização e statuses, exercitados por cliente e testes.

### Episode 34 — Os Beans do Conselho

**Capacidade final:** separar responsabilidades e conectá-las por injeção de dependência do Spring.

**Mapa base**

- inversão de controle;
- container Spring;
- bean e ciclo básico;
- component scanning;
- estereótipos de componente;
- injeção por construtor;
- dependência versus criação com `new`;
- interfaces quando existe variação real;
- responsabilidades entre controller e serviço.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Conhecer o conselho | container, beans e scanning | Componente guiado criado e encontrado pelo Spring. Termina quando criação pelo container não for confundida com objeto Java comum. |
| 2. Delegar sem acoplar | constructor injection e responsabilidades | Controller delega comportamento a serviço escrito pelo aprendiz. Termina quando `new Service()` desaparecer do consumidor e a aplicação iniciar. |
| 3. Trocar uma dependência | contratos e testabilidade | Dependência alternativa usada em teste ou configuração controlada. Termina quando a utilidade e o custo de uma interface forem justificados. |

**Evidência mínima:** componentes autorais ligados por constructor injection, responsabilidades separadas e teste que substitui uma dependência sem iniciar lógica externa desnecessária.

### Episode 35 — Contratos de Entrada e Saída

**Capacidade final:** receber e devolver JSON por Spring com comportamento observável para entradas normais e malformadas.

**Mapa base**

- `@RequestBody`;
- desserialização JSON;
- serialização da resposta;
- construtores e propriedades necessários ao mapper;
- campos ausentes e desconhecidos;
- tipos incompatíveis e JSON malformado;
- `ResponseEntity`;
- statuses de criação e entrada inválida;
- separação inicial entre modelo recebido e regra.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Receber a mensagem | request body e desserialização | JSON guiado vira objeto e seus campos são observados. Termina quando corpo bruto, objeto Java e parâmetro forem distinguidos. |
| 2. Responder com contrato | serialização, status e headers | Endpoint autoral cria representação de resposta coerente. Termina quando cliente observar body e status esperados. |
| 3. Quebrar o contrato com segurança | ausências, tipos e JSON inválido | Entradas normais, incompletas e malformadas são exercitadas por testes e cliente. Termina com comportamento explicado sem antecipar Bean Validation. |

**Evidência mínima:** endpoint autoral com entrada e saída JSON, status de sucesso, testes de JSON malformado e tipos incompatíveis e explicação do mapeamento.

### Boss Battle VI — A Primeira API da Academia

**Capacidade final:** entregar a primeira API Spring executável, testada e coerente, mantendo os dados em memória.

**Mapa de convergência**

- build Spring reproduzível;
- contrato REST coerente;
- controllers e parâmetros;
- JSON de entrada e saída;
- serviços e injeção;
- regras e armazenamento em memória;
- statuses principais;
- testes automatizados;
- cliente HTTP e histórico Git.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Fundar a API | projeto, domínio e contrato | API nova criada a partir de requisitos e contrato aprovados. Termina quando build, pacotes e rotas planejadas estiverem claros. |
| 2. Implementar o núcleo | serviço, memória e injeção | Regras e armazenamento escritos pelo aprendiz, ligados ao controller. Termina quando fluxos principais funcionarem sem persistência externa. |
| 3. Expor o contrato | HTTP, parâmetros, JSON e statuses | Endpoints completos exercitados por coleção de requisições. Termina após caminhos normal, ausente e inválido. |
| 4. Atacar a fortaleza | testes, build, Git e defesa | Testes e revisão adversarial corrigem falhas; projeto é reconstruído e executado. Termina quando todo o mapa de convergência possuir evidência. |

**Evidência final:** repositório Spring Boot autoral, API em memória, cliente HTTP, testes, `mvn clean verify`, histórico coerente e defesa técnica.

---

## 13. Saga XI — As Camadas e o Registro Permanente

### Episode 36 — As Camadas do Reino

**Capacidade final:** organizar uma funcionalidade entre camadas com responsabilidades e dependências defensáveis.

**Mapa base**

- domínio;
- controller;
- service;
- repository;
- responsabilidade e fronteira de cada camada;
- coesão, acoplamento e SOLID como heurísticas, não dogma;
- direção das dependências;
- regra de negócio versus transporte e persistência;
- injeção por construtor;
- teste isolado de serviço.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Traçar as fronteiras | domínio, responsabilidades, coesão, acoplamento e SOLID | Código misturado é analisado e responsabilidades são distribuídas. Termina quando cada decisão tiver um motivo além do nome da pasta ou de citar uma sigla. |
| 2. Fazer a chamada atravessar | controller, service, repository e direção | Fluxo guiado atravessa camadas por injeção. Termina quando dependências apontarem para dentro do comportamento e nenhuma camada pular responsabilidade sem motivo. |
| 3. Implementar uma regra limpa | negócio e testabilidade | Funcionalidade autoral é implementada e o serviço testado sem HTTP ou banco real. Termina após revisão de acoplamento e comportamento. |

**Evidência mínima:** fluxo autoral dividido entre camadas, regra no serviço, dependências injetadas, refatoração justificada por coesão/acoplamento e teste unitário sem contexto Spring completo.

### Episode 37 — O CRUD dos Clãs

**Capacidade final:** implementar o ciclo completo de vida de um recurso e tratar identidade, conflito e ausência.

**Mapa base**

- criação;
- listagem;
- busca por identificador;
- atualização;
- remoção;
- geração e estabilidade de identidade;
- ausência legítima;
- conflito e duplicidade;
- preservação de estado;
- contratos entre camadas.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Nascer e ser encontrado | criação, identidade, listagem e busca | Metade de leitura do CRUD implementada sobre repository em memória. Termina após casos vazio, criação e busca inexistente. |
| 2. Mudar sem trocar de alma | atualização, conflito e estado | Atualização autoral preserva identidade e valida regras antes de mutar. Termina quando falha deixar o estado original intacto. |
| 3. Encerrar o ciclo | remoção e contrato HTTP | CRUD completo atravessa camadas e endpoints. Termina após testes de todos os caminhos e revisão de statuses. |

**Evidência mínima:** CRUD autoral em memória, com testes positivos, inexistência, conflito, atualização segura e contrato HTTP exercitado.

### Episode 38 — O Pacto das Entidades

**Capacidade final:** persistir uma entidade simples por JPA e explicar o que o ORM faz entre objeto e tabela.

**Mapa base**

- problema resolvido por ORM;
- JPA versus Hibernate;
- `@Entity`;
- identidade com `@Id` e geração;
- tabelas e colunas;
- configuração de datasource e schema;
- migrations versionadas com Flyway;
- validação de schema em vez de mutação automática em ambiente compartilhado;
- estados básicos da entidade;
- persistência e recuperação;
- logs SQL e limites da abstração.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Firmar o pacto | ORM, JPA, implementação e entidade | Entidade guiada é mapeada e tabela correspondente inspecionada. Termina quando especificação, implementação, objeto e linha não forem confundidos. |
| 2. Dar identidade persistente | `@Id`, geração, colunas e estados | Entidade autoral é salva e recuperada, com id antes e depois observado. Termina quando ciclo básico estiver explicado. |
| 3. Versionar o chão | Flyway, ordem de migrations e validação de schema | Schema deixa de depender de criação automática e nasce de migrations versionadas. Termina após reconstrução limpa e falha de migration diagnosticada. |
| 4. Olhar por baixo da magia | configuração, estados e SQL | Mapeamentos e configuração defeituosos são diagnosticados pelos logs. Termina com mini-boss, teste de integração contra PostgreSQL e schema coerente. |

**Evidência mínima:** entidade autoral persistida e recuperada, migrations Flyway reproduzíveis, tabela e id inspecionados, SQL analisado, falha diagnosticada e teste de integração real.

### Episode 39 — Os Repositórios do Subsolo

**Capacidade final:** usar Spring Data JPA conscientemente para CRUD e consultas simples sem perder o contrato do domínio.

**Mapa base**

- `JpaRepository`;
- generics de entidade e id;
- operações herdadas;
- `Optional` em busca;
- consultas derivadas;
- convenções de nomes;
- diferença entre repository de domínio e mecanismo;
- leitura de SQL gerado;
- limites e falhas de consultas derivadas.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Herdar operações úteis | `JpaRepository`, generics e CRUD | Repository guiado substitui armazenamento em memória. Termina quando métodos herdados e tipos genéricos forem entendidos. |
| 2. Perguntar pelo nome certo | derived queries, `Optional` e convenções | Consultas autorais são escritas a partir de requisitos e validadas contra dados reais. Termina após presente, ausente e múltiplos resultados. |
| 3. Reconhecer o limite | SQL gerado, erros e abstração | Consulta inadequada é diagnosticada e simplificada ou explicitada. Termina quando o aprendiz justificar quando a convenção ajuda e quando atrapalha. |

**Evidência mínima:** repository autoral, CRUD persistente, consultas derivadas testadas, ausência representada e SQL gerado inspecionado.

### Episode 40 — Laços Persistentes

**Capacidade final:** mapear relações JPA preservando cardinalidade, ciclo de vida e contrato JSON.

**Mapa base**

- `@ManyToOne` e `@OneToMany`;
- relações um-para-um e muitos-para-muitos quando necessárias;
- lado responsável e `mappedBy`;
- foreign keys resultantes;
- carregamento lazy e eager;
- cascata;
- orphan removal;
- consistência dos dois lados em memória;
- ciclos de serialização;
- consultas e desempenho básico.
- `@Transactional` na fronteira de serviço;
- rollback de operação composta.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Mapear o vínculo | cardinalidade, anotações e lado responsável | Relação um-para-muitos guiada é persistida e tabelas inspecionadas. Termina quando `mappedBy` e foreign key forem relacionados. |
| 2. Manter os dois lados | consistência, cascata, orphan removal e transação de serviço | Métodos autorais mantêm a associação dentro de fronteira transacional explícita. Termina quando efeitos de ciclo de vida forem intencionais. |
| 3. Carregar sem explodir | lazy, eager, consultas, sessão e rollback | Acesso a relações é observado com logs e uma falha intermediária comprova rollback. Termina quando consultas extras, contexto e atomicidade forem reconhecidos. |
| 4. Romper o ciclo JSON | serialização e contrato | Endpoint relacional deixa de recursar ou vazar grafo indevido. Termina após respostas JSON e testes de integração coerentes. |

**Evidência mínima:** relações autorais persistidas, owner defendido, cascatas testadas, fronteira `@Transactional`, rollback observado, carregamento analisado e JSON sem ciclo.

### Checkpoint — O Sistema Persistente da Guilda

**Capacidade final:** entregar uma API em camadas com persistência relacional e comportamento reproduzível.

**Mapa de convergência**

- domínio e camadas;
- CRUD completo;
- JPA/Hibernate;
- repositories;
- relações e integridade;
- transações de serviço;
- ausência e conflito;
- testes unitários e de integração;
- contrato HTTP e JSON;
- banco reproduzível.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Modelar o sistema | domínio, banco, relações e contratos | Novo domínio modelado em classes, tabelas e endpoints. Termina com decisões aprovadas antes da implementação. |
| 2. Persistir o núcleo | JPA, repositories, serviços e CRUD | Fluxos principais escritos pelo aprendiz e testados contra PostgreSQL. Termina quando CRUD e relações funcionarem. |
| 3. Atacar fronteiras | transações, ausência, conflito e integridade | Casos adversariais comprovam rollback e respostas coerentes. Termina sem corrupção parcial. |
| 4. Reconstruir e defender | build, banco, API e testes | Aplicação sobe de estado limpo, suíte passa e contrato é exercitado. Termina quando todo o mapa convergir. |

**Evidência final:** API Spring persistente autoral, PostgreSQL, camadas, CRUD, relações, testes e reprodução a partir do repositório.

---

## 14. Saga XII — Os Contratos da API Profissional

### Episode 41 — O Selo da Validação

**Capacidade final:** rejeitar entradas inválidas na fronteira correta e devolver evidência clara do problema.

**Mapa base**

- propósito de Bean Validation;
- `@Valid`;
- restrições padrão;
- mensagens de validação;
- validação de campos versus regra de negócio;
- fronteira de entrada;
- validação aninhada;
- grupos somente quando houver necessidade real;
- testes de entrada válida e inválida.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Selar a entrada | restrições, `@Valid` e mensagens | Request simples recebe validações guiadas e erros são observados. Termina quando anotação e disparo efetivo não forem confundidos. |
| 2. Colocar cada lei no lugar | campo, objeto e negócio | Regras concretas são classificadas e implementadas na fronteira ou serviço apropriado. Termina quando Bean Validation não estiver sendo usado para toda regra existente. |
| 3. Provar o selo | aninhamento e testes | Entrada autoral com estrutura aninhada é validada em testes web. Termina após casos válido, múltiplos erros, limite e regra de negócio separada. |

**Evidência mínima:** contrato de entrada autoral com validações, mensagens úteis, aninhamento proporcional e testes que distinguem formato inválido de conflito de negócio.

### Episode 42 — O Guardião dos Erros Globais

**Capacidade final:** transformar falhas da aplicação em respostas HTTP consistentes sem espalhar `try/catch` pelos controllers.

**Mapa base**

- exception de domínio;
- `@ControllerAdvice`;
- `@ExceptionHandler`;
- escolha de status;
- corpo de erro consistente;
- erros de validação;
- falhas inesperadas sem vazamento interno;
- logs versus resposta ao cliente;
- testes dos contratos de erro.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Centralizar a defesa | advice, handler e status | Falha de domínio guiada é capturada globalmente. Termina quando controller deixar de conhecer a tradução HTTP do erro. |
| 2. Criar uma linguagem de erro | corpo consistente, validação e segurança | Modelo de erro autoral cobre ausência, conflito e entrada inválida sem expor stack trace. Termina quando cada resposta tiver status e dados úteis coerentes. |
| 3. Atacar o guardião | logs, inesperados e testes | Suíte web dispara falhas conhecidas e inesperada controlada. Termina após revisão de contrato, logs e ausência de vazamento. |

**Evidência mínima:** tratamento global autoral para domínio e validação, fallback seguro para inesperados e testes de status e corpo.

### Episode 43 — DTOs: Os Contratos da Fortaleza

**Capacidade final:** definir contratos de entrada e saída independentes das entidades persistentes e mapear entre eles conscientemente.

**Mapa base**

- motivo para DTO;
- DTO de entrada;
- DTO de saída;
- diferença entre DTO, entidade e domínio;
- mapeamento manual;
- campos calculados e ocultos;
- DTOs aninhados;
- validação na entrada;
- custo e limites do mapeamento.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Separar os contratos | entrada, saída e entidade | Endpoint que expõe entidade é analisado e recebe DTOs guiados. Termina quando persistência e contrato externo puderem mudar separadamente. |
| 2. Traduzir sem perder sentido | mapeamento, campos ocultos e calculados | Mapeadores autorais convertem criação e resposta. Termina após testes de campos obrigatórios, ausentes e não expostos. |
| 3. Contratos compostos | DTOs aninhados, validação e limites | Relação é representada sem ciclo nem vazamento de entidade. Termina com endpoints e testes revisados. |

**Evidência mínima:** DTOs autorais de entrada e saída, mapeamento testado, validação na fronteira e entidade não exposta diretamente.

### Episode 44 — O Arquivo Infinito

**Capacidade final:** oferecer coleções grandes com paginação, ordenação e filtros previsíveis.

**Mapa base**

- motivo para paginação;
- `Pageable` e `Page`;
- número e tamanho de página;
- limites e defaults;
- ordenação por campos permitidos;
- desempate estável;
- filtros opcionais;
- busca parcial e normalização;
- composição de consultas;
- metadados no contrato de resposta.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Dividir o arquivo | `Pageable`, `Page`, defaults e limites | Endpoint guiado pagina dados reais e exibe metadados. Termina quando índice, tamanho, total e conteúdo forem distinguidos. |
| 2. Ordenar sem oscilar | campos permitidos e desempate | Ordenação autoral recebe direção e mantém resultado estável. Termina após empates, campo inválido e ordem padrão. |
| 3. Encontrar no infinito | filtros, busca e composição | Filtros opcionais são combinados em consulta sem cascata ilegível de métodos. Termina após filtros isolados, combinados e resultado vazio. |
| 4. Fechar o contrato | resposta, desempenho básico e testes | Contrato final limita tamanho e cobre paginação, ordenação e filtros em testes. Termina após revisão adversarial. |

**Evidência mínima:** endpoint autoral paginado, ordenação estável, filtros combináveis, limites, metadados e testes contra banco real.

### Episode 45 — O Olho do Testador

**Capacidade final:** construir uma estratégia de testes proporcional e documentação executável para uma API Spring.

**Mapa base**

- pirâmide e escopo de testes;
- teste unitário de serviço;
- teste web de controller;
- teste de integração;
- Mockito: mocks, stubs e `verify`;
- limites de mocks;
- Testcontainers com PostgreSQL;
- isolamento de dados;
- fixtures legíveis;
- build como gate;
- documentação OpenAPI;
- sincronização entre contrato, teste e documentação.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Escolher a lente | escopos, serviço e Mockito | Comportamentos são distribuídos entre testes unitários e integração; serviço usa mock, stub e verificação proporcional. Termina quando cada teste justificar o que isola e o que não prova. |
| 2. Testar a fronteira web | controller, serialização, validação e erros | Testes web autorais verificam status e body sem depender de banco real. Termina após caminhos principal e adversariais. |
| 3. Testar o sistema unido | integração, Testcontainers, PostgreSQL e isolamento | Fluxos reais sobem banco descartável e usam dados independentes. Termina quando repetição, máquina e ordem não alterarem o resultado. |
| 4. Tornar o contrato visível | build, OpenAPI e coerência | Documentação é gerada e confrontada com requisições e testes. Termina com `clean verify` como gate reproduzível. |

**Evidência mínima:** suíte autoral em mais de um nível, Mockito usado e limitado conscientemente, integração PostgreSQL via Testcontainers, isolamento demonstrado, build limpo e OpenAPI conferida contra a aplicação.

### Episode 46 — O Portão dos Guardiões

**Capacidade final:** proteger uma API Spring com autenticação e autorização testáveis, sem guardar credenciais ou segredos de forma insegura.

**Mapa base**

- autenticação versus autorização;
- fluxo básico do Spring Security;
- `SecurityFilterChain`;
- identidade, roles e authorities;
- hash de senha com `PasswordEncoder`;
- `401 Unauthorized` versus `403 Forbidden`;
- princípio do menor privilégio;
- JWT: emissão, assinatura, expiração e validação;
- filtro de autenticação stateless;
- configuração de segredo fora do repositório;
- CORS e diferença para CSRF;
- testes de endpoint público, autenticado e proibido.

**Escopo ensinado:** configuração moderna por beans, cadastro/login proporcional, BCrypt, token JWT curto com claims mínimas, autorização por rota ou método e testes. OAuth2 social, refresh token, revogação distribuída e provedor externo ficam nos arcos avançados.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Fechar o portão | fluxo, filter chain, 401/403 e menor privilégio | API inicialmente aberta recebe configuração guiada e testes de acesso. Termina quando ausência de identidade e falta de permissão não forem confundidas. |
| 2. Proteger a identidade | usuário, senha, encoder e autenticação | Cadastro e autenticação armazenam somente hash e rejeitam credenciais inválidas. Termina após inspeção dos dados e testes adversariais básicos. |
| 3. Carregar o selo | JWT, expiração, filtro, segredo e stateless | Token é emitido e validado em requisições; expirado e adulterado falham. Termina quando o aprendiz rastrear o token sem tratá-lo como criptografia do conteúdo. |
| 4. Mini-boss — A Fortaleza Selada | autorização, CORS/CSRF e testes | Em recurso novo, o aprendiz define acessos por papel e completa endpoints protegidos. Harness testa público, autenticado, proibido, token inválido e menor privilégio. |

**Evidência mínima:** API autoral com senha hasheada, login, JWT assinado e expirável, segredo externo, autorização por papel e testes reproduzíveis de `200`, `401` e `403`.

### Episode 47 — A Nave de Entrega

**Capacidade final:** empacotar, verificar e disponibilizar uma API com banco de forma reproduzível e observável.

**Mapa base**

- imagem versus container;
- `Dockerfile`, contexto e `.dockerignore`;
- build em múltiplos estágios;
- usuário não root e configuração por ambiente;
- rede, volume e Docker Compose;
- aplicação e PostgreSQL reproduzíveis;
- health check, logs e encerramento;
- pipeline de integração contínua;
- build e testes como gate;
- secrets de CI;
- deploy em ambiente escolhido;
- smoke test e rollback operacional básico.

**Escopo ensinado:** Docker/Compose, pipeline de CI no provedor do repositório e deploy simples em uma plataforma escolhida no briefing. Kubernetes, IaC, observabilidade distribuída e alta disponibilidade ficam nos arcos avançados.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Selar a nave | imagem, Dockerfile, camadas, usuário e ambiente | Imagem autoral é construída e executa a API sem segredo embutido. Termina após inspeção do container e reconstrução limpa. |
| 2. Montar a tripulação | Compose, rede, volume, banco e migrations | API e PostgreSQL sobem juntos e o schema nasce pelas migrations. Termina após reinício controlado, health e persistência observados. |
| 3. Automatizar o lançamento | CI, cache proporcional, secrets e gates | Push em branch executa build e testes sem depender da máquina local. Termina quando falha impede o pipeline e correção o libera. |
| 4. Mini-boss — O Primeiro Deploy | deploy, configuração, logs, smoke e recuperação | O aprendiz publica a API, executa smoke test e diagnostica uma configuração inválida controlada. Termina com URL funcional ou ambiente equivalente acordado e roteiro reproduzível. |

**Evidência mínima:** Dockerfile e Compose autorais, aplicação e PostgreSQL reproduzíveis, migrations, health, CI com testes, secrets externos, deploy acessível ou equivalente acordado e smoke test documentado.

### Boss Battle VII — A API da Academia Backend

**Capacidade final:** entregar uma API backend profissional pequena, coerente e pronta para avaliação técnica.

**Mapa de convergência**

- requisitos e domínio;
- arquitetura em camadas;
- persistência e relações;
- CRUD e regras de negócio;
- DTOs e validação;
- erros globais;
- paginação, ordenação e filtros;
- autenticação e autorização;
- testes em níveis proporcionais;
- documentação OpenAPI;
- logs, health e configuração externa;
- Docker, CI, deploy, Git e reprodução.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Arquitetar a academia | requisitos, domínio, dados e contrato | Projeto autoral é especificado e modelado antes do código. Termina quando escopo, entidades, relações e endpoints estiverem aprovados. |
| 2. Construir o núcleo | camadas, persistência, CRUD e regras | Fluxos principais são implementados e testados. Termina quando banco e regras funcionarem sem atalhos entre camadas. |
| 3. Fortalecer os contratos | DTOs, validação, erros, consultas e segurança | Fronteiras profissionais e autorização são adicionadas e exercitadas. Termina após cenários normais, inválidos, ausentes, conflitantes, paginados, não autenticados e proibidos. |
| 4. Preparar para inspeção | testes, documentação, Docker, CI, deploy e Git | Revisão adversarial, reprodução limpa, health, publicação e defesa técnica. Termina somente com todo o mapa comprovado e nenhuma falha bloqueante. |

**Evidência final:** API Spring Boot autoral persistente, segura, documentada, testada, containerizada, publicada, reproduzível e defendida pelo aprendiz.

---

## 15. Saga XIII — O Exame Jonin

### Boss Battle VIII — O Exame Jonin

Projeto autoral de portfólio. O aprendiz escolhe domínio, levanta requisitos, modela, implementa, testa, documenta, mantém histórico Git e defende decisões.

**Capacidade final:** construir, proteger, publicar e explicar uma API Java Backend Junior completa com Spring Boot, PostgreSQL e entrega reproduzível.

**Mapa de convergência**

- descoberta e corte de requisitos;
- modelagem de domínio e dados;
- contrato REST;
- arquitetura e direção de dependências;
- implementação incremental;
- persistência e transações;
- migrations e reconstrução de banco;
- validação, DTOs e erros;
- consultas, paginação e ordenação;
- autenticação e autorização;
- estratégia de testes;
- documentação técnica e OpenAPI;
- histórico Git profissional;
- logs, health, Docker, CI e deploy;
- defesa de decisões e trade-offs.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Escolher a missão | problema, usuário, requisitos e escopo | Proposta autoral é recortada em versão realizável, com fora de escopo explícito. Termina após aprovação do problema e da condição de vitória. |
| 2. Projetar antes de erguer | domínio, dados, arquitetura, API, segurança e testes | Modelo, schema, contratos, ameaças básicas e plano de fatias verticais são defendidos. Termina antes da implementação principal. |
| 3. Construir por fatias | código, persistência, segurança, contratos e testes | Funcionalidades são entregues verticalmente em commits coerentes, cada uma executável. Termina quando o escopo aprovado estiver completo. |
| 4. Exame final | adversários, documentação, CI, deploy, reprodução e defesa | Build limpo, banco reconstruído, testes, OpenAPI, container, health, deploy, revisão técnica e apresentação final. Termina apenas quando outra pessoa puder executar e avaliar o projeto. |

**Evidência final:** projeto original de portfólio no GitHub, com requisitos, aplicação segura, banco versionado, testes, documentação, CI, container, deploy, histórico, reprodução e defesa técnica pelo aprendiz.

---

## 16. Arcos avançados de Java

Os Chapters 16–18 e os temas de concorrência avançada, mensageria, cache, microserviços, Kubernetes, infraestrutura como código e cloud específica permanecem importantes. Eles retornam depois do Exame Jonin, quando houver um sistema que justifique a complexidade, e não bloqueiam a entrada no backend.

---

## Fim do Backendverse Curriculum v1.5
