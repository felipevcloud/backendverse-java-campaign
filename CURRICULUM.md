# Backendverse Curriculum

**Versão:** 1.4.1  
**Função:** definir a ordem das missões, seus conteúdos obrigatórios, Mapas de Maestria, planos-base de blocos e a capacidade que cada marco precisa comprovar.  
**Método de ensino e avaliação:** `PLAYBOOK.md`.

---

## 1. Contrato curricular

O currículo define o que não pode ser omitido e fornece o plano-base que o Sensei deve usar. O briefing apresenta esse plano em linguagem adequada ao momento; não reinventa a missão a partir de uma lista solta de assuntos.

Cada missão ainda não concluída possui:

- capacidade final;
- Mapa de Maestria;
- plano-base de dois a quatro blocos substanciais;
- entrega e ponto de parada de cada bloco;
- evidência mínima de conclusão.

Os itens do mapa podem aparecer em mais de um bloco. Contato guiado pode produzir `◐`; `✓` operacional continua dependendo da evidência independente exigida pelo Playbook.

### 1.1 Adaptação sem improvisação

O plano-base é obrigatório, mas a profundidade é adaptativa.

- O Sensei pode acrescentar microciclos de explicação e recuperação **dentro do bloco atual** quando o aprendiz ainda não compreendeu ou não conseguiu executar.
- O Sensei pode reduzir exposição já comprovada, mas não eliminar a prática independente nem a evidência mínima.
- Repetição usa exemplos novos e proporcionais; não copia a solução que depois será avaliada.
- Alterar a ordem, fundir blocos, criar bloco adicional ou mudar o artefato exige uma lacuna observável, explicação no corte natural e concordância do aprendiz.
- Extensão pedagógica corrige uma lacuna do conteúdo vigente; não autoriza antecipar assunto de Episode futuro.

Os planos-base detalhados passam a ser obrigatórios a partir do Episode 12. Episodes 01–11 e Boss Battles I–IV permanecem como histórico aprovado; se forem reabertos por auditoria, recebem um plano de recuperação específico baseado em seus mapas, sem reescrever a conquista original.

Para tópicos operacionais, os itens abaixo somente recebem `✓` depois de implementação independente, compilação, execução e revisão, conforme o Playbook.

O **Head First Java / Use a Cabeça Java — 3ª edição** orienta a trilha de Core Java até o Capítulo 13. A trilha profissional posterior é ensinada pelo Sensei desde os fundamentos.

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
**Capacidade final:** escrever pipelines novos, executá-los e explicar o fluxo dos dados sem depender de um molde copiado.

**Mapa base**

- expressão lambda;
- interface funcional;
- criação e consumo de Stream;
- operações intermediárias e lazy evaluation;
- `filter`;
- `map`;
- operações terminais;
- `toList()` e `collect()`;
- `reduce()`;
- `Optional`;
- composição legível;
- escolha entre Stream e abordagem imperativa.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Domar o fluxo | lambda, interface funcional, criação e consumo, `filter`, `map`, operações intermediárias e terminais, lazy evaluation, `toList()` e `collect()` | Pipeline guiado digitado e executado pelo aprendiz em `main` fornecido pelo Sensei. Termina quando o resultado estiver correto e um elemento puder ser rastreado pela pipeline. |
| 2. Sem rodinhas | `reduce()`, composição legível e seleção consciente de operações | Dois métodos com pipelines independentes e de formas diferentes; um deles usa `reduce()`. Termina depois de compilação, execução e revisão sem algoritmo central fornecido. |
| 3. O vazio também é dado | `Optional` e escolha entre Stream e abordagem imperativa | Operação independente com ausência legítima, cenários normal, vazio e de borda, seguida de justificativa Stream versus laço. Termina com revisão da aplicação completa. |

**Evidência mínima obrigatória**

- aplicação Java executável criada para o Episode;
- pelo menos um pipeline construído de forma guiada;
- pelo menos dois pipelines independentes com formas diferentes;
- uso real de ausência com `Optional`;
- execução manual com entradas normais, vazias e de borda, usando ponto de entrada fornecido pelo Sensei quando apropriado;
- explicação do caminho percorrido por um elemento.

Previsões e leitura de pipelines servem para diagnóstico, mas não concluem o Episode.

### Episode 13 — O Guardião das Exceções

**Base:** Chapter 13 — *Exception Handling*  
**Capacidade final:** implementar, lançar, propagar, capturar e recuperar falhas em código executável.

**Mapa base**

- propósito de exception;
- fluxo de `try` e `catch`;
- tratamentos específicos e hierarquia;
- `finally` e liberação de recursos;
- checked versus unchecked;
- `throw`;
- `throws`;
- exception customizada;
- escolha entre tratar e propagar;
- preservação de estado em caso de falha;
- fallback somente quando produz resultado válido.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Quando o fluxo quebra | propósito, `try`, `catch`, hierarquia, `finally`, checked e unchecked | Laboratório guiado executável com caminhos normal e excepcional. Termina quando o aprendiz rastrear ambos e distinguir as duas classificações sem adivinhar sintaxe. |
| 2. Criar e lançar o guardião | `throw`, `throws`, exception customizada e preservação de estado | Exception customizada escrita pelo aprendiz após exemplo genérico, lançada em regra real e propagada ou capturada. Termina quando a falha não modificar o estado e isso for observado. |
| 3. Tratar, propagar ou recuperar | decisão de tratamento, fallback válido e liberação confiável | Fluxos independentes com tratamento local, propagação e fallback apenas onde existe resultado válido. Termina após cenários positivos, negativos e de borda e defesa das decisões. |

**Evidência mínima obrigatória**

- aplicação Java executável criada ou evoluída para o Episode;
- criação independente de uma exception customizada depois de exemplo genérico;
- chamada que exige captura ou propagação de checked exception;
- cenário unchecked justificado;
- `try`/`catch` com comportamento observável;
- verificação manual de que uma falha não corrompe o estado, usando harness fornecido pelo Sensei quando apropriado;
- execução e explicação do fluxo completo.

### Boss Battle V — A Graduação do Core Java

Integra modelagem, Collections, generics, Streams, `Optional` e exceptions em uma aplicação nova ou evolução explicitamente aceita.

**Pré-condições**

- Episodes 12 e 13 aprovados com evidência executável independente;
- nenhuma API essencial à solução ainda desconhecida;
- briefing e escopo aprovados antes de `MISSION START`.

**Mapa de convergência**

- modelar responsabilidades coerentes;
- escolher Collections e generics;
- escrever pipelines adequados;
- representar ausência conscientemente;
- implementar e tratar falhas;
- preservar estado diante de erro;
- testar cenários principais e adversariais;
- explicar e defender o código criado.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Erguer o domínio | responsabilidades, objetos, Collections e generics | Modelo e armazenamento de uma aplicação nova, escritos pelo aprendiz e compilando. Termina quando identidades, responsabilidades e operações obrigatórias estiverem concretas. |
| 2. Fazer os dados fluírem | pipelines, `Optional` e composição legível | Consultas e agregações implementadas sem algoritmo central fornecido. Termina após execução de resultados presentes, ausentes e de borda. |
| 3. Proteger o estado | exceptions, decisões de tratamento e integridade | Regras inválidas falham de modo observável sem corromper estado. Termina após testes manuais positivos e adversariais. |
| 4. Graduação | integração, testes e defesa | Aplicação completa executada pelo `main` ou harness integrado, revisão adversarial e explicação das decisões. Termina apenas quando todos os critérios de convergência possuírem evidência real. |

**Evidência final:** aplicação escrita pelo aprendiz, ponto de entrada integrado pelo Sensei quando não for alvo, execução e revisão adversarial.

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

### Episode 14 — O Ritual Maven

**Capacidade final:** criar, executar e diagnosticar um build Maven reproduzível.

**Mapa base**

- propósito de build tool;
- estrutura padrão `src/main` e `src/test`;
- `pom.xml`;
- coordenadas `groupId`, `artifactId` e `version`;
- fases `clean`, `compile`, `test`, `package` e `verify`;
- diretório `target` e artefato;
- leitura de falhas de build.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Ler o ritual | build tool, estrutura, POM e coordenadas | Projeto Maven mínimo criado com orientação e compilado pela linha de comando ou IntelliJ. Termina quando cada parte essencial puder ser localizada e explicada. |
| 2. Percorrer o ciclo | fases, `target` e empacotamento | Sequência `clean`, `compile`, `test`, `package` e `verify` executada; artefatos são inspecionados. Termina quando o aprendiz relacionar comando, fase e resultado. |
| 3. Reconstruir sem magia | build reproduzível e diagnóstico | Pequeno projeto Maven montado ou reparado independentemente e executado a partir de estado limpo. Termina após correção de ao menos uma falha real de build. |

**Evidência mínima:** `pom.xml` autoral, estrutura válida, `mvn clean verify` bem-sucedido, artefato observado e diagnóstico explicado.

### Episode 15 — A Forja das Dependências

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

### Episode 16 — O Tribunal dos Testes

**Capacidade final:** escrever testes JUnit úteis, independentes e executáveis pelo Maven.

**Mapa base**

- propósito do teste automatizado;
- `@Test`;
- Arrange, Act, Assert;
- assertions essenciais;
- `assertThrows`;
- casos positivos, negativos e de borda;
- independência e repetibilidade;
- nomes e mensagens diagnósticas;
- execução com Maven.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Abrir o tribunal | `@Test`, AAA e assertions | Teste guiado executado pelo Maven e falha proposital interpretada. Termina quando o aprendiz localizar preparação, ação e verificação. |
| 2. Construir o caso | positivos, negativos, bordas e `assertThrows` | Conjunto independente de testes para comportamento conhecido. Termina quando uma implementação defeituosa for detectada por ao menos um teste autoral. |
| 3. Julgamento reproduzível | independência, nomes e execução | Suíte revisada para eliminar dependência de ordem e estado compartilhado. Termina com `mvn test` repetido com o mesmo resultado. |

**Evidência mínima:** testes autorais que passam, teste que demonstra falha útil, cenário excepcional, borda e execução Maven reproduzível.

### Episode 17 — Os Pergaminhos JSON e o Git da Guilda

**Capacidade final:** transformar objetos em JSON e preservar a evolução do trabalho em um histórico Git compreensível.

**Mapa base**

- objetos, arrays e tipos JSON;
- diferença entre objeto Java e representação JSON;
- serialização e desserialização;
- mapeamento de campos;
- falha de entrada JSON;
- `status`, `diff`, staging e commit;
- commits coerentes;
- branches e histórico;
- `.gitignore` e artefatos gerados.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Ler o pergaminho | estrutura e tipos JSON | Exemplos normais e inválidos rastreados; JSON pequeno escrito pelo aprendiz. Termina quando estrutura, valor e ausência não forem confundidos. |
| 2. Traduzir entre mundos | serialização, desserialização e campos | Round trip guiado seguido de conversão independente usando biblioteca já declarada no Maven. Termina após casos normal e inválido. |
| 3. Registrar a jornada | `status`, `diff`, staging, commits e `.gitignore` | Mudanças reais separadas em commits coerentes pelo aprendiz. Termina quando cada diff e mensagem corresponderem a uma intenção. |
| 4. Preservar sem esconder | branches, histórico e integração | Pequena evolução realizada em branch e integrada sem perder histórico. Termina com aplicação e testes reproduzíveis no estado final. |

**Evidência mínima:** aplicação Maven com JSON lido e produzido, erro inválido observado e sequência Git real revisada pelo Sensei.

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

**Ambiente padrão da Saga:** PostgreSQL local para os Episodes 18–26. Instalação, credenciais de desenvolvimento e comandos de inicialização são infraestrutura fornecida pelo Sensei, não prova do conteúdo. Se o ambiente impedir PostgreSQL, um único substituto relacional é acordado para toda a Saga VII e VIII; não se troca de motor por Episode.

### Episode 18 — As Tabelas da Verdade

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

### Episode 19 — O Oráculo das Consultas

**Capacidade final:** escrever e depurar consultas que retornem exatamente o conjunto solicitado.

**Mapa base**

- `SELECT`, `FROM` e aliases;
- projeção de colunas;
- `WHERE`;
- operadores de comparação e lógicos;
- `LIKE`, `IN` e `BETWEEN`;
- tratamento de `NULL` em filtros;
- `ORDER BY`, desempates e `LIMIT`;
- agregações básicas;
- leitura incremental de consultas.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Perguntar com precisão | seleção, projeção, aliases e filtros | Consultas guiadas seguidas de filtros autorais. Termina quando resultado e linhas excluídas puderem ser explicados. |
| 2. Combinar critérios | operadores, texto, conjuntos, intervalos e `NULL` | Consultas independentes com critérios combinados e precedência explícita. Termina após cenários com resultado, vazio e valores nulos. |
| 3. Ordenar e resumir | ordenação, desempate, limite e agregações | Relatório pequeno com ordem determinística e medidas agregadas. Termina após depuração de uma consulta defeituosa e validação manual do resultado. |

**Evidência mínima:** arquivo de consultas executadas sobre dados conhecidos, incluindo combinação de filtros, `NULL`, ordenação determinística, limite, agregação e caso vazio.

### Episode 20 — As Escrituras Mutáveis

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

### Episode 21 — Os Laços Relacionais

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

### Episode 22 — O Mapa Relacional

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

### Episode 23 — O Portal da Conexão

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

### Episode 24 — As Queries Seladas

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

### Episode 25 — O Espelho do ResultSet

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

### Episode 26 — Os Guardiões DAO

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

### Episode 27 — O Pacto Cliente-Servidor

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

### Episode 28 — Os Verbos do Protocolo

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

### Episode 29 — Rotas, Parâmetros e JSON

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

### Episode 30 — A Lei dos Recursos REST

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

### Episode 31 — O Portal Spring Boot

**Capacidade final:** criar, iniciar e diagnosticar uma aplicação Spring Boot mínima.

**Mapa base**

- propósito do Spring Boot;
- estrutura do projeto;
- parent/BOM e starters;
- classe com `@SpringBootApplication`;
- inicialização pelo Maven e IDE;
- servidor embarcado e porta;
- configuração em `application.properties` ou YAML;
- logs e falhas de startup;
- endpoint de verificação fornecido.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Montar o portal | estrutura, starters e classe inicial | Projeto gerado com escolhas explicadas e iniciado. Termina quando o aprendiz localizar entrada, dependências e pacotes. |
| 2. Ver o servidor respirar | execução, porta, configuração e logs | Aplicação acessada por cliente HTTP e configuração simples alterada. Termina quando mudança de porta e ciclo de startup forem observados. |
| 3. Diagnosticar a abertura | falhas de startup e build | Problemas controlados de configuração, porta e dependência são corrigidos. Termina com `mvn clean verify` e startup reproduzível. |

**Evidência mínima:** aplicação Spring Boot criada pelo aprendiz, build limpo, servidor iniciado, configuração alterada e ao menos duas falhas diagnosticadas.

### Episode 32 — Os Controladores da Fortaleza

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

### Episode 33 — Os Beans do Conselho

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

### Episode 34 — Contratos de Entrada e Saída

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

### Episode 35 — As Camadas do Reino

**Capacidade final:** organizar uma funcionalidade entre camadas com responsabilidades e dependências defensáveis.

**Mapa base**

- domínio;
- controller;
- service;
- repository;
- responsabilidade e fronteira de cada camada;
- direção das dependências;
- regra de negócio versus transporte e persistência;
- injeção por construtor;
- teste isolado de serviço.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Traçar as fronteiras | domínio e responsabilidades | Código misturado é analisado e responsabilidades são distribuídas. Termina quando cada decisão tiver um motivo além do nome da pasta. |
| 2. Fazer a chamada atravessar | controller, service, repository e direção | Fluxo guiado atravessa camadas por injeção. Termina quando dependências apontarem para dentro do comportamento e nenhuma camada pular responsabilidade sem motivo. |
| 3. Implementar uma regra limpa | negócio e testabilidade | Funcionalidade autoral é implementada e o serviço testado sem HTTP ou banco real. Termina após revisão de acoplamento e comportamento. |

**Evidência mínima:** fluxo autoral dividido entre camadas, regra no serviço, dependências injetadas e teste unitário sem contexto Spring completo.

### Episode 36 — O CRUD dos Clãs

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

### Episode 37 — O Pacto das Entidades

**Capacidade final:** persistir uma entidade simples por JPA e explicar o que o ORM faz entre objeto e tabela.

**Mapa base**

- problema resolvido por ORM;
- JPA versus Hibernate;
- `@Entity`;
- identidade com `@Id` e geração;
- tabelas e colunas;
- configuração de datasource e schema;
- estados básicos da entidade;
- persistência e recuperação;
- logs SQL e limites da abstração.

**Plano-base — 3 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Firmar o pacto | ORM, JPA, implementação e entidade | Entidade guiada é mapeada e tabela correspondente inspecionada. Termina quando especificação, implementação, objeto e linha não forem confundidos. |
| 2. Dar identidade persistente | `@Id`, geração, colunas e estados | Entidade autoral é salva e recuperada, com id antes e depois observado. Termina quando ciclo básico estiver explicado. |
| 3. Olhar por baixo da magia | configuração, schema e SQL | Mapeamentos e configuração defeituosos são diagnosticados pelos logs. Termina com teste de integração contra PostgreSQL e schema coerente. |

**Evidência mínima:** entidade autoral persistida e recuperada, tabela inspecionada, id observado, SQL analisado e teste de integração real.

### Episode 38 — Os Repositórios do Subsolo

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

### Episode 39 — Laços Persistentes

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

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Mapear o vínculo | cardinalidade, anotações e lado responsável | Relação um-para-muitos guiada é persistida e tabelas inspecionadas. Termina quando `mappedBy` e foreign key forem relacionados. |
| 2. Manter os dois lados | consistência, cascata e orphan removal | Métodos de domínio autorais mantêm a associação e cenários de remoção são executados. Termina quando efeitos de ciclo de vida forem intencionais. |
| 3. Carregar sem explodir | lazy, eager, consultas e sessão | Acesso a relações é observado com logs e testes. Termina quando consultas extras e limites de contexto forem reconhecidos. |
| 4. Romper o ciclo JSON | serialização e contrato | Endpoint relacional deixa de recursar ou vazar grafo indevido. Termina após respostas JSON e testes de integração coerentes. |

**Evidência mínima:** relações autorais persistidas, owner defendido, cascatas testadas, carregamento observado e JSON sem ciclo.

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

### Episode 40 — O Selo da Validação

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

### Episode 41 — O Guardião dos Erros Globais

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

### Episode 42 — DTOs: Os Contratos da Fortaleza

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

### Episode 43 — O Arquivo Infinito

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

### Episode 44 — O Olho do Testador

**Capacidade final:** construir uma estratégia de testes proporcional e documentação executável para uma API Spring.

**Mapa base**

- pirâmide e escopo de testes;
- teste unitário de serviço;
- teste web de controller;
- teste de integração;
- mocks e seus limites;
- isolamento de dados;
- fixtures legíveis;
- build como gate;
- documentação OpenAPI;
- sincronização entre contrato, teste e documentação.

**Plano-base — 4 blocos**

| Bloco | Mapa principal | Entrega e ponto de parada |
|---|---|---|
| 1. Escolher a lente | escopos, serviço e mocks | Comportamentos são distribuídos entre testes unitários e integração. Termina quando cada teste justificar o que isola. |
| 2. Testar a fronteira web | controller, serialização, validação e erros | Testes web autorais verificam status e body sem depender de banco real. Termina após caminhos principal e adversariais. |
| 3. Testar o sistema unido | integração, banco e isolamento | Fluxos reais usam banco de teste com dados independentes. Termina quando repetição e ordem não alterarem o resultado. |
| 4. Tornar o contrato visível | build, OpenAPI e coerência | Documentação é gerada e confrontada com requisições e testes. Termina com `clean verify` como gate reproduzível. |

**Evidência mínima:** suíte autoral em mais de um nível, isolamento demonstrado, build limpo e documentação OpenAPI conferida contra a aplicação.

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
- testes em níveis proporcionais;
- documentação OpenAPI;
- build, Git e reprodução.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Arquitetar a academia | requisitos, domínio, dados e contrato | Projeto autoral é especificado e modelado antes do código. Termina quando escopo, entidades, relações e endpoints estiverem aprovados. |
| 2. Construir o núcleo | camadas, persistência, CRUD e regras | Fluxos principais são implementados e testados. Termina quando banco e regras funcionarem sem atalhos entre camadas. |
| 3. Fortalecer os contratos | DTOs, validação, erros e consultas | Fronteiras profissionais são adicionadas e exercitadas. Termina após cenários normais, inválidos, ausentes, conflitantes e paginados. |
| 4. Preparar para inspeção | testes, documentação, build e Git | Revisão adversarial, reprodução limpa e defesa técnica. Termina somente com todo o mapa comprovado e nenhuma falha bloqueante. |

**Evidência final:** API Spring Boot autoral persistente, documentada, testada, reproduzível e defendida pelo aprendiz.

---

## 15. Saga XIII — O Exame Jonin

### Boss Battle VIII — O Exame Jonin

Projeto autoral de portfólio. O aprendiz escolhe domínio, levanta requisitos, modela, implementa, testa, documenta, mantém histórico Git e defende decisões.

**Capacidade final:** construir e explicar uma API Java Backend Junior completa com Spring Boot, banco relacional, CRUD, validação, erros, DTOs, consultas, testes e build reproduzível.

**Mapa de convergência**

- descoberta e corte de requisitos;
- modelagem de domínio e dados;
- contrato REST;
- arquitetura e direção de dependências;
- implementação incremental;
- persistência e transações;
- validação, DTOs e erros;
- consultas, paginação e ordenação;
- estratégia de testes;
- documentação técnica e OpenAPI;
- histórico Git profissional;
- deploy ou execução reproduzível;
- defesa de decisões e trade-offs.

**Plano-base — 4 blocos**

| Bloco | Convergência principal | Entrega e ponto de parada |
|---|---|---|
| 1. Escolher a missão | problema, usuário, requisitos e escopo | Proposta autoral é recortada em versão realizável, com fora de escopo explícito. Termina após aprovação do problema e da condição de vitória. |
| 2. Projetar antes de erguer | domínio, dados, arquitetura, API e testes | Modelo, esquema, contratos, decisões e plano de fatias verticais são defendidos. Termina antes da implementação principal. |
| 3. Construir por fatias | código, persistência, contratos e testes | Funcionalidades são entregues verticalmente em commits coerentes, cada uma executável. Termina quando o escopo aprovado estiver completo. |
| 4. Exame final | adversários, documentação, reprodução e defesa | Build limpo, banco reconstruído, testes, OpenAPI, revisão técnica e apresentação final. Termina apenas quando outra pessoa puder executar e avaliar o projeto. |

**Evidência final:** projeto original de portfólio no GitHub, com requisitos, aplicação, banco, testes, documentação, histórico, reprodução e defesa técnica pelo aprendiz.

---

## 16. Arcos avançados de Java

Os Chapters 16–18 permanecem importantes e retornam quando houver contexto real para arquivos, rede, concorrência e temas avançados. Eles não bloqueiam a entrada no backend.

---

## Fim do Backendverse Curriculum v1.4.1
