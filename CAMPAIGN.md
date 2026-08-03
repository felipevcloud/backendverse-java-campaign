# Backendverse Campaign

## Saga Atual

Saga IV — O Arsenal do Desenvolvedor

## Episódio Atual

Episode 10 — As Leis do Mundo Estático

## Última Missão

Construção do Arsenal Dimensional utilizando estado de instância, membros static, constantes, classes utilitárias, wrappers, autoboxing, conversões numéricas, métodos da classe Math e formatação.

## Próxima Missão

Episode 11 — O Inventário dos Caçadores

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
* Diferenciar estado de instância e estado compartilhado
* Criar atributos e métodos static
* Declarar constantes universais com static final
* Manter contadores compartilhados entre instâncias
* Criar classes utilitárias sem estado próprio
* Utilizar wrappers para conversões numéricas
* Converter String para int e double
* Compreender autoboxing e unboxing
* Armazenar valores numéricos em ArrayList de wrappers
* Arredondar valores com Math.round()
* Limitar resultados com Math.min()
* Comparar valores com Math.max() e Math.min()
* Formatar números com String.format()
* Reconhecer estado compartilhado e utilizar ferramentas numéricas da linguagem

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

Na Boss Battle III, o Torneio dos Arquitetos integrou todas as habilidades da Saga III. Cada Construcao possui um NucleoArquitetonico responsável por controlar sua própria energia.

FortalezaAegis, CidadeNexus e BastiaoPrismatico herdaram a abstração Construcao e implementaram os contratos Defensora e Expansora conforme suas capacidades.

O ConselhoDosArquitetos coordenou construções, defensoras e expansoras por meio de três ArrayLists tipados por abstrações, sem utilizar instanceof ou identificar classes concretas.

A remoção de uma construção atualizou as três coleções utilizando a mesma referência. Ativações válidas consumiram energia, enquanto ativações recusadas preservaram corretamente o estado do núcleo.

A modelagem da campanha passou a ser conduzida de forma mais conversacional, progressiva e proporcional à complexidade do projeto, evitando questionários extensos e repetição desnecessária.

A Saga IV foi iniciada com o Arsenal Dimensional. Cada Artefato possui nome, poder base e multiplicador próprios, enquanto a classe compartilha o contador total de objetos criados e a constante LIMITE_MAXIMO.

A CalculadoraDoArsenal foi implementada como uma classe utilitária sem estado. Os poderes foram calculados, arredondados e limitados por métodos estáticos da classe Math.

Os valores de entrada foram convertidos com Integer.parseInt() e Double.parseDouble(). Os resultados primitivos foram armazenados em um ArrayList de Integer por meio de autoboxing.

## Última Revisão Técnica

Episode 10 aprovado. O projeto compila e executa corretamente, diferencia estado individual, estado compartilhado e constantes universais.

Nome, poder base e multiplicador pertencem a cada instância de Artefato. O contador totalDeArtefatos é estático, incrementado durante a construção e compartilhado por todas as instâncias.

LIMITE_MAXIMO é uma constante public static final com valor 1000. A CalculadoraDoArsenal utiliza um método estático e não precisa ser instanciada.

Os dados numéricos são convertidos com Integer.parseInt() e Double.parseDouble(). Os poderes finais são armazenados em um ArrayList de Integer, demonstrando autoboxing e unboxing.

Math.round() arredonda os resultados, Math.min() aplica o limite universal e Math.max() e Math.min() encontram os extremos do relatório.

Os poderes calculados foram 630, 1000 e 313. O sistema preserva o alinhamento entre artefatos e resultados pelo índice e apresenta os valores de forma legível com String.format().