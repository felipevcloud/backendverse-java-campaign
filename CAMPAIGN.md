# Backendverse Campaign

## Saga Atual

Saga III — O Legado dos Objetos

## Episódio Atual

Episode 09 — O Ciclo das Almas no Heap

## Última Missão

Construção do Santuário das Almas Digitais utilizando construtores, sobrecarga, this, super, validação de estado inicial, polimorfismo e ciclo de vida de referências no heap.

## Próxima Missão

Boss Battle III — O Torneio dos Arquitetos

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

## Boss Battles Concluídas

* Boss Battle I — O Registro da Academia
* Boss Battle II — O Primeiro Sistema da Guilda

## Observações

A Saga III foi iniciada com um sistema inspirado em Kamen Rider e Super Sentai. O projeto reuniu Riders e Rangers em uma mesma formação, utilizando duas hierarquias de herança e relações de composição entre combatentes e equipamentos.

A Agência Vértice armazenou diferentes subclasses em um ArrayList de Combatente e coordenou transformações, ataques e golpes finais sem identificar manualmente o tipo de cada objeto.

O Episode 07 também marcou o início do Desafio de Modelagem obrigatório. A estrutura de classes, atributos, métodos, relações e responsabilidades foi planejada antes da implementação.

No Episode 08, a Arena Prismática reuniu participantes com capacidades diferentes por meio de uma classe abstrata e dos contratos Transformavel e Invocador.

O Conselho Prismático utilizou coleções separadas de Participante, Transformavel e Invocador para coordenar técnicas especiais, transformações e invocações sem depender das classes concretas.

A validação de energia foi centralizada na classe abstrata Participante. Técnicas válidas consumiram energia, enquanto a técnica recusada preservou corretamente o estado do participante.

No Episode 09, o Santuário das Almas Digitais utilizou construtores para garantir que todas as entidades nascessem em um estado válido.

A classe Kami demonstrou sobrecarga de construtores, reutilização com this(...) e inicialização da superclasse com super(...). Yokai e Akuma também participaram da cadeia de inicialização por herança.

A remoção do Yokai da coleção e a anulação de sua referência local demonstraram que objetos se tornam elegíveis para coleta apenas quando não existem mais referências alcançáveis apontando para eles.

## Última Revisão Técnica

Episode 09 aprovado. O projeto compila e executa corretamente, utiliza construtores para validar e inicializar o estado obrigatório das entidades e impede que objetos concretos terminem sua criação com nome ou energia inválidos.

Kami possui construtores padrão e personalizado. O construtor padrão utiliza this(...) para reutilizar a inicialização, enquanto os construtores das três entidades utilizam super(...) para encaminhar nome e energia à classe abstrata Entidade.

A ordem da cadeia de construtores é apresentada corretamente no console. As entidades são armazenadas e coordenadas polimorficamente por meio de um ArrayList de Entidade.

O Yokai é removido da coleção antes de sua referência local receber null. O programa explica corretamente que o objeto se torna elegível para garbage collection, sem afirmar que a coleta ou destruição ocorreu imediatamente.

A validação de nomes vazios utiliza comparação por conteúdo e funciona corretamente para literais vazios, novas instâncias de String vazias e referências null.