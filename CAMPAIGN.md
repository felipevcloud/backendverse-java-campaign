# Backendverse Campaign

## Saga Atual

Saga III — O Legado dos Objetos

## Episódio Atual

Episode 08 — O Torneio das Mil Formas

## Última Missão

Construção da Arena Prismática utilizando classes abstratas, interfaces, múltiplos contratos, referências polimórficas e coleções organizadas por capacidade.

## Próxima Missão

Episode 09 — O Ciclo das Almas no Heap

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

## Última Revisão Técnica

Episode 08 aprovado. O projeto compila e executa corretamente, utiliza uma classe abstrata para representar o estado compartilhado dos participantes e métodos abstratos para obrigar cada classe concreta a implementar sua própria técnica especial.

As interfaces Transformavel e Invocador representam capacidades independentes da hierarquia principal. GuerreiroQuimera implementa apenas Transformavel, OraculoAstral implementa apenas Invocador e SoberanoEclipse implementa os dois contratos.

O ConselhoPrismatico coordena participantes por meio de ArrayList de Participante, Transformavel e Invocador, executando comportamentos polimorficamente sem utilizar instanceof, getClass ou comparações de classes concretas.

A validação de energia permanece centralizada em Participante. A técnica especial recusada não consome energia, e as técnicas válidas atualizam corretamente o estado dos participantes.