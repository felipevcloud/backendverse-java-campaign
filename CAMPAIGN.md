# Backendverse Campaign

## Saga Atual

Saga III — O Legado dos Objetos

## Episódio Atual

Boss Battle III — O Torneio dos Arquitetos

## Última Missão

Construção do Torneio dos Arquitetos, integrando herança, composição, classes abstratas, interfaces, múltiplos contratos, construtores, polimorfismo, controle de energia e testes manuais.

## Próxima Missão

Episode 10 — As Leis do Mundo Estático

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
* Construir um sistema orientado a objetos com múltiplas classes colaborando
* Identificar relações IS-A e HAS-A
* Criar hierarquias de classes com extends
* Reaproveitar atributos e comportamentos por herança
* Especializar comportamentos com sobrescrita e @Override
* Utilizar referências da superclasse
* Executar comportamentos diferentes por meio do polimorfismo
* Armazenar subclasses em um ArrayList da superclasse
* Combinar herança e composição de forma coerente
* Modelar classes, relações e responsabilidades antes da implementação
* Criar classes abstratas que não podem ser instanciadas
* Declarar métodos abstratos como obrigações das subclasses
* Combinar métodos abstratos e concretos em uma mesma abstração
* Criar interfaces para representar contratos de capacidade
* Implementar múltiplas interfaces em uma mesma classe
* Utilizar interfaces como tipos de referências polimórficas
* Armazenar objetos em ArrayLists tipados por abstrações
* Coordenar comportamentos sem instanceof ou identificação de classes concretas
* Programar para abstrações
* Criar objetos em estado válido por meio de construtores
* Declarar construtores com parâmetros
* Utilizar sobrecarga de construtores
* Reutilizar inicialização com this(...)
* Encadear construtores da herança com super(...)
* Compreender a ordem de inicialização entre superclasses e subclasses
* Validar dados obrigatórios durante a construção
* Diferenciar objetos de suas referências
* Compreender stack e heap em nível conceitual
* Identificar referências mantidas por variáveis e coleções
* Identificar quando um objeto se torna elegível para garbage collection
* Controlar a criação e a consistência inicial dos objetos
* Integrar herança, composição, abstrações, interfaces e construtores em um sistema completo
* Distribuir responsabilidades entre abstração, subclasses, contratos, objetos compostos e coordenadores
* Centralizar regras de estado no objeto responsável
* Remover a mesma referência de múltiplas coleções sem identificar sua classe concreta
* Validar sistemas orientados a objetos por meio de testes manuais de estado e retorno
* Avaliar e remover abstrações desnecessárias durante a modelagem

## Boss Battles Concluídas

* Boss Battle I — O Registro da Academia
* Boss Battle II — O Primeiro Sistema da Guilda
* Boss Battle III — O Torneio dos Arquitetos

## Observações

A Saga III foi iniciada com um sistema inspirado em Kamen Rider e Super Sentai. O projeto reuniu Riders e Rangers em uma mesma formação, utilizando duas hierarquias de herança e relações de composição entre combatentes e equipamentos.

A Agência Vértice armazenou diferentes subclasses em um ArrayList de Combatente e coordenou transformações, ataques e golpes finais sem identificar manualmente o tipo de cada objeto.

O Episode 07 também marcou o início do Desafio de Modelagem obrigatório. A estrutura de classes, atributos, métodos, relações e responsabilidades foi planejada antes da implementação.

No Episode 08, a Arena Prismática reuniu participantes com capacidades diferentes por meio de uma classe abstrata e dos contratos Transformavel e Invocador.

O Conselho Prismático utilizou coleções separadas de Participante, Transformavel e Invocador para coordenar técnicas especiais, transformações e invocações sem depender das classes concretas.

No Episode 09, o Santuário das Almas Digitais utilizou construtores para garantir que todas as entidades nascessem em um estado válido.

A classe Kami demonstrou sobrecarga de construtores, reutilização com this(...) e inicialização da superclasse com super(...). A remoção do Yokai da coleção e a anulação de sua referência local demonstraram o ciclo de vida das referências no heap.

Na Boss Battle III, o Torneio dos Arquitetos integrou todas as habilidades da Saga III. Cada Construção possui um NucleoArquitetonico responsável por controlar sua própria energia.

FortalezaAegis, CidadeNexus e BastiaoPrismatico herdaram a abstração Construcao e implementaram os contratos Defensora e Expansora conforme suas capacidades.

O ConselhoDosArquitetos coordenou construções, defensoras e expansoras por meio de três ArrayLists tipados por abstrações, sem utilizar instanceof ou identificar classes concretas.

A remoção de uma construção atualizou as três coleções utilizando a mesma referência. Ativações válidas consumiram energia, enquanto ativações recusadas preservaram corretamente o estado do núcleo.

A modelagem da campanha passará a ser conduzida de forma mais conversacional, progressiva e proporcional à complexidade do projeto, evitando questionários extensos e repetição desnecessária.

## Última Revisão Técnica

Boss Battle III aprovada. O projeto compila e executa corretamente, e os treze testes manuais apresentam PASS.

Construcao é uma classe abstrata e possui uma relação de composição com NucleoArquitetonico. O núcleo valida seus dados durante a construção, controla sua energia e retorna o resultado das solicitações de consumo.

FortalezaAegis utiliza sobrecarga de construtores, this(...) e super(...). CidadeNexus e BastiaoPrismatico também inicializam corretamente o estado compartilhado por meio do construtor da superclasse.

As interfaces Defensora e Expansora representam capacidades independentes. BastiaoPrismatico implementa os dois contratos e é armazenado nas duas coleções correspondentes.

ConselhoDosArquitetos coordena ArrayList de Construcao, Defensora e Expansora sem utilizar instanceof, getClass ou comparações de classes concretas.

O sistema trata corretamente referências null, utiliza comparação por conteúdo para Strings, respeita sistemas principais personalizados, preserva energia após ativações recusadas e remove construções de todas as coleções relevantes.

A Saga III foi concluída com domínio inicial dos pilares da orientação a objetos, modelagem de responsabilidades, abstrações, contratos, construtores e composição.