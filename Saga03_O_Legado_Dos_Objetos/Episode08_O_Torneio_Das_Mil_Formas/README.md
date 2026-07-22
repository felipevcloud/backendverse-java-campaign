# Episode 08 — O Torneio das Mil Formas

## Objetivo
Aprender a utilizar classes abstratas, interfaces, contratos e referências polimórficas para coordenar objetos com capacidades diferentes.

## Conceitos praticados
- abstract
- classes abstratas
- métodos abstratos
- métodos concretos
- interfaces
- implements
- contratos
- múltiplas interfaces
- referências polimórficas
- ArrayList de abstrações
- sobrescrita
- @Override
- encapsulamento
- validação de energia

## Descrição da missão
O programa representa a Arena Prismática, responsável por organizar participantes de diferentes mundos durante o Torneio das Mil Formas. Todos pertencem à abstração Participante, mas apenas alguns podem se transformar, invocar manifestações ou cumprir os dois contratos.

## Estrutura
- `Participante`: classe abstrata que concentra o estado e os comportamentos compartilhados.
- `Transformavel`: contrato dos objetos capazes de alterar sua forma.
- `Invocador`: contrato dos objetos capazes de realizar invocações.
- `GuerreiroQuimera`: participante transformável.
- `OraculoAstral`: participante invocador.
- `SoberanoEclipse`: participante transformável e invocador.
- `ConselhoPrismatico`: administra as coleções de abstrações e coordena o torneio.
- `ArenaPrismatica`: executa o fluxo principal.

## Abstrações e contratos aplicados
- `GuerreiroQuimera` IS-A `Participante`.
- `OraculoAstral` IS-A `Participante`.
- `SoberanoEclipse` IS-A `Participante`.
- `GuerreiroQuimera` implementa `Transformavel`.
- `OraculoAstral` implementa `Invocador`.
- `SoberanoEclipse` implementa `Transformavel` e `Invocador`.
- `ConselhoPrismatico` administra coleções de `Participante`, `Transformavel` e `Invocador`.

## Como executar
1. Abrir o projeto no IntelliJ.
2. Executar a classe `ArenaPrismatica`.
3. Verificar a formação, as transformações, as invocações, as técnicas especiais e o relatório final no console.

## Resultado esperado
O programa deve coordenar participantes por meio de classes abstratas e interfaces, executar comportamentos polimórficos sem verificar classes concretas, consumir energia após técnicas válidas e preservar a energia quando uma técnica for recusada.