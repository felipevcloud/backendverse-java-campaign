# Episode 09 — O Ciclo das Almas no Heap

## Objetivo
Aprender a controlar a criação e a consistência inicial dos objetos utilizando construtores, sobrecarga, this, super e cadeias de inicialização, além de compreender referências, heap e elegibilidade para coleta.

## Conceitos praticados
- construtores
- construtor padrão
- construtores com parâmetros
- sobrecarga
- this(...)
- super(...)
- cadeia de inicialização
- classe abstrata
- métodos abstratos
- sobrescrita
- polimorfismo
- referências
- stack
- heap
- ArrayList
- ciclo de vida dos objetos
- elegibilidade para garbage collection

## Descrição da missão
O programa representa o Santuário das Almas Digitais, onde entidades de diferentes naturezas são materializadas. Os construtores garantem que cada objeto nasça em um estado válido, enquanto o santuário mantém referências polimórficas para coordenar suas manifestações.

Durante a execução, uma entidade é removida da coleção e sua referência local é anulada, demonstrando quando um objeto pode se tornar elegível para coleta.

## Estrutura
- `Entidade`: classe abstrata que valida e inicializa o estado compartilhado.
- `Kami`: entidade benevolente com construtores padrão e personalizado.
- `Yokai`: entidade travessa responsável por manifestações ilusórias.
- `Akuma`: entidade sombria utilizada para testar valores iniciais inválidos.
- `SantuarioDasAlmas`: registra, coordena e desvincula entidades.
- `RitualDasAlmasDigitais`: executa o fluxo principal da missão.

## Cadeia de construtores
O construtor padrão de `Kami` chama o construtor personalizado com `this(...)`. O construtor personalizado encaminha os dados para `Entidade` utilizando `super(...)`.

A ordem observada é:

`Entidade → Kami personalizado → Kami padrão`

## Métodos da API utilizados
- `ArrayList.add()`: adiciona entidades ao santuário.
- `ArrayList.remove()`: remove a referência de uma entidade da coleção.

## Ciclo de vida observado
Ao ser registrada, uma entidade passa a ser alcançada pela variável local e pela coleção do santuário.

Remover a entidade da coleção elimina apenas uma dessas referências. Depois que a referência local também recebe `null`, e não existem outros vínculos, o objeto torna-se elegível para coleta.

A coleta não acontece necessariamente de forma imediata.

## Como executar
1. Abrir o projeto no IntelliJ.
2. Executar a classe `RitualDasAlmasDigitais`.
3. Observar a ordem dos construtores, o registro, as manifestações e a demonstração do ciclo de vida.

## Resultado esperado
O programa deve materializar entidades válidas por meio de construtores, demonstrar sobrecarga e herança na cadeia de inicialização, executar comportamentos polimórficos e explicar corretamente a elegibilidade de um objeto para garbage collection.