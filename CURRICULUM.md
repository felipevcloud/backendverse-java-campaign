# Backendverse Curriculum

**Versão:** 1.4  
**Função:** definir a ordem das missões, seus conteúdos obrigatórios e a capacidade que cada marco precisa comprovar.  
**Método de ensino e avaliação:** `PLAYBOOK.md`.

---

## 1. Regra curricular

O currículo define o que não pode ser omitido. O briefing de cada missão transforma seu mapa em dois a quatro blocos substanciais, com prática compatível.

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

**Evidência final:** aplicação escrita pelo aprendiz, ponto de entrada integrado pelo Sensei quando não for alvo, execução e revisão adversarial.

---

## 7. Side Quests opcionais

### Side Quest 01 — As Portas da Interface

Chapter 14: GUI, eventos, listeners, desenho e classes internas.

### Side Quest 02 — O Laboratório Swing

Chapter 15: componentes, layouts e organização de interfaces desktop.

Não bloqueiam a trilha profissional.

---

## 8. Saga VI — A Ponte para o Backend

### Episode 14 — O Ritual Maven

Build tools, estrutura padrão, `pom.xml`, coordenadas, ciclo de vida, compilação, testes, empacotamento e diagnóstico de build.

### Episode 15 — A Forja das Dependências

Dependências, resolução, scopes, plugins, fases e organização de pacotes.

### Episode 16 — O Tribunal dos Testes

JUnit, AAA, anotações, assertions, casos positivos, negativos e de borda, independência e execução pelo Maven.

### Episode 17 — Os Pergaminhos JSON e o Git da Guilda

JSON, serialização conceitual, commits coerentes, branches, diffs e preservação de histórico.

### Checkpoint — O Ambiente Profissional

Aplicação Maven executável, dependências controladas, testes automatizados, JSON e histórico Git compreensível.

---

## 9. Saga VII — O Reino dos Dados

### Episode 18 — As Tabelas da Verdade

Modelo relacional, tabelas, linhas, colunas, tipos, `NULL` e restrições.

### Episode 19 — O Oráculo das Consultas

`SELECT`, `FROM`, `WHERE`, operadores, ordenação, limites e depuração de consultas.

### Episode 20 — As Escrituras Mutáveis

`INSERT`, `UPDATE`, `DELETE`, filtros seguros e verificação do conjunto afetado.

### Episode 21 — Os Laços Relacionais

Chaves, cardinalidades, integridade referencial e `JOIN`.

### Episode 22 — O Mapa Relacional

Modelagem de entidades, tabelas, chaves, relações, normalização básica e restrições.

### Checkpoint — O Arquivo Relacional

Esquema executável, dados, consultas de negócio, alterações seguras e defesa do modelo.

---

## 10. Saga VIII — A Ponte JDBC

### Episode 23 — O Portal da Conexão

Driver, URL, `Connection`, ciclo de vida, fechamento e falhas de conexão.

### Episode 24 — As Queries Seladas

`Statement`, `PreparedStatement`, parâmetros, consultas, alterações e prevenção de SQL injection.

### Episode 25 — O Espelho do ResultSet

Cursor, leitura de linhas e colunas, valores nulos e mapeamento para objetos.

### Episode 26 — Os Guardiões DAO

CRUD JDBC, DAO/Repository manual, separação de SQL, mapeamento e falhas.

### Checkpoint — O Registro JDBC da Academia

Conexão real, comandos parametrizados, CRUD, mapeamento, responsabilidades e testes.

---

## 11. Saga IX — Os Protocolos entre Mundos

### Episode 27 — O Pacto Cliente-Servidor

Cliente, servidor, requisição, resposta, URL, porta e falhas de comunicação.

### Episode 28 — Os Verbos do Protocolo

Métodos HTTP, status, headers, body, idempotência e segurança inicial.

### Episode 29 — Rotas, Parâmetros e JSON

Endpoints, path parameters, query parameters, payloads e contratos JSON.

### Episode 30 — A Lei dos Recursos REST

Recursos, URLs, CRUD e HTTP, consistência de contratos e uso de cliente de API.

### Checkpoint — O Contrato entre Mundos

Contrato REST defendido com recursos, rotas, métodos, parâmetros, payloads, respostas e erros.

---

## 12. Saga X — A Fortaleza Spring

### Episode 31 — O Portal Spring Boot

Estrutura, starters, configuração, classe inicial, servidor embarcado e diagnóstico de startup.

### Episode 32 — Os Controladores da Fortaleza

Controllers, mappings, rotas, métodos HTTP, parâmetros e respostas.

### Episode 33 — Os Beans do Conselho

IoC, beans, componentes, injeção de dependência e responsabilidades.

### Episode 34 — Contratos de Entrada e Saída

Request body, parâmetros, serialização, desserialização, status e entradas inválidas.

### Boss Battle VI — A Primeira API da Academia

Primeira API Spring executável integrando Maven, testes, Git, JSON, HTTP, controllers, injeção e regras em memória.

---

## 13. Saga XI — As Camadas e o Registro Permanente

### Episode 35 — As Camadas do Reino

Controller, Service, Repository, domínio, regras e direção das dependências.

### Episode 36 — O CRUD dos Clãs

Criação, listagem, busca, atualização, remoção e inexistência.

### Episode 37 — O Pacto das Entidades

ORM, JPA, Hibernate, entidades, identificadores e mapeamento.

### Episode 38 — Os Repositórios do Subsolo

Spring Data JPA, operações padrão, consultas derivadas e limites da abstração.

### Episode 39 — Laços Persistentes

Relações JPA, lado responsável, carregamento, cascata e ciclos de serialização.

### Checkpoint — O Sistema Persistente da Guilda

API em camadas, CRUD, banco relacional, JPA/Hibernate, relações e testes.

---

## 14. Saga XII — Os Contratos da API Profissional

### Episode 40 — O Selo da Validação

Bean Validation, restrições, mensagens, fronteira e testes de entrada.

### Episode 41 — O Guardião dos Erros Globais

Exceções de domínio, `@ControllerAdvice`, handlers, status e corpos de erro.

### Episode 42 — DTOs: Os Contratos da Fortaleza

DTOs de entrada e saída, separação de entidade e mapeamento.

### Episode 43 — O Arquivo Infinito

Paginação, ordenação, filtros, busca, consultas e contratos de resultado.

### Episode 44 — O Olho do Testador

Testes de serviço e web, isolamento, build e documentação da API.

### Boss Battle VII — A API da Academia Backend

API profissional integrando persistência, camadas, CRUD, validação, DTOs, erros, paginação, testes e documentação.

---

## 15. Saga XIII — O Exame Jonin

### Boss Battle VIII — O Exame Jonin

Projeto autoral de portfólio. O aprendiz escolhe domínio, levanta requisitos, modela, implementa, testa, documenta, mantém histórico Git e defende decisões.

**Capacidade final:** construir e explicar uma API Java Backend Junior completa com Spring Boot, banco relacional, CRUD, validação, erros, DTOs, consultas, testes e build reproduzível.

---

## 16. Arcos avançados de Java

Os Chapters 16–18 permanecem importantes e retornam quando houver contexto real para arquivos, rede, concorrência e temas avançados. Eles não bloqueiam a entrada no backend.

---

## Fim do Backendverse Curriculum v1.4
