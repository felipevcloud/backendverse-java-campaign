# Episode 11 — O Inventário dos Caçadores

## Objetivo

Aprender a escolher coleções conforme sua responsabilidade, controlar a igualdade entre objetos e criar diferentes formas de ordenação.

## Conceitos praticados

- List
- ArrayList
- Set
- HashSet
- Map
- HashMap
- generics
- Comparable
- Comparator
- Collections.sort()
- equals()
- hashCode()
- autoboxing
- unboxing

## Descrição da missão

O programa representa o inventário da Guilda do Horizonte.

Cada ItemDeCaca possui código, nome, categoria, poder e valor. O código define sua identidade dentro do sistema.

Itens com o mesmo código aumentam a quantidade armazenada, mas não criam uma nova entrada no catálogo.

## Estrutura

- `ItemDeCaca`: representa um tipo de item e define sua identidade e ordem natural.
- `ComparadorPorPoder`: organiza os itens por poder decrescente.
- `InventarioDaGuilda`: coordena o catálogo, os itens únicos e as quantidades.
- `InventarioDosCacadores`: cria os objetos e executa o fluxo principal.

## Responsabilidade das coleções

- `List<ItemDeCaca>` mantém o catálogo ordenável.
- `Set<ItemDeCaca>` controla itens únicos.
- `Map<ItemDeCaca, Integer>` associa cada item à sua quantidade.

## Igualdade

Dois objetos são considerados iguais quando possuem o mesmo código.

Por isso, `equals()` e `hashCode()` utilizam o código como critério.

## Ordenações

A ordem natural utiliza o nome em ordem alfabética.

O `ComparadorPorPoder` cria uma ordem alternativa do maior para o menor poder.

## Autoboxing e unboxing

As quantidades são armazenadas como `Integer` no Map.

Ao somar uma unidade, o valor passa por unboxing para o cálculo e por autoboxing ao ser armazenado novamente.

## Como executar

1. Abrir o projeto no IntelliJ.
2. Executar a classe `InventarioDosCacadores`.
3. Observar o registro dos itens, o tratamento das duplicatas, as ordenações e o relatório.

## Resultado esperado

O catálogo deve possuir quatro tipos únicos e seis unidades totais.

Grimório do Abismo e Lâmina do Eclipse devem possuir duas unidades cada.

O valor total do inventário deve ser 6420.00 moedas.