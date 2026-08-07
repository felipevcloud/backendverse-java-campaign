# Boss Battle IV — O Arquivo do Mundo Digital

## Objetivo

Integrar os conhecimentos da Saga IV utilizando Collections, generics, identidade de objetos, busca, ordenação, estado compartilhado e controle de avistamentos em um sistema completo.

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
- static
- wrappers
- autoboxing
- unboxing
- busca por loop
- busca parcial
- ordenação natural
- ordenação alternativa
- controle de duplicidade

## Descrição da Boss Battle

O programa representa o Arquivo Digital, responsável por catalogar Digimon encontrados durante expedições pelo Mundo Digital.

Cada Digimon possui código, nome, espécie, nível de ameaça e quantidade de dados.

Objetos diferentes podem representar o mesmo Digimon quando possuem o mesmo código. Nessas situações, o catálogo mantém apenas uma entrada, enquanto a quantidade de avistamentos é atualizada.

O sistema também realiza buscas, apresenta diferentes ordenações e gera relatórios sobre os registros armazenados.

## Estrutura

- `Digimon`: representa uma entidade digital, define sua identidade, sua ordem natural e controla a quantidade total de objetos criados.
- `ComparadorPorAmeaca`: define uma ordenação alternativa baseada no nível de ameaça.
- `ArquivoDigital`: coordena catálogo, unicidade, avistamentos, buscas, ordenações e relatórios.
- `ArquivoDoMundoDigital`: executa o fluxo principal da Boss Battle.

## Responsabilidade das coleções

### List<Digimon>

Mantém o catálogo de tipos únicos e permite criar cópias para buscas e ordenações.

### Set<Digimon>

Controla a unicidade dos Digimon utilizando os contratos de `equals()` e `hashCode()`.

### Map<Digimon, Integer>

Associa cada Digimon à quantidade de vezes em que foi avistado.

Quando um Digimon equivalente é registrado novamente, sua quantidade aumenta sem criar uma nova entrada no catálogo.

## Identidade dos Digimon

O código representa a identidade de um Digimon.

Por isso, `equals()` e `hashCode()` utilizam exclusivamente esse atributo.

Objetos diferentes com o mesmo código são considerados equivalentes pelo `HashSet` e pelo `HashMap`.

## Ordem natural

`Digimon` implementa `Comparable<Digimon>`.

Sua ordem natural utiliza o nome em ordem alfabética, ignorando diferenças entre maiúsculas e minúsculas.

Quando dois nomes são equivalentes, o código é utilizado como desempate.

## Ordenação por ameaça

`ComparadorPorAmeaca` implementa `Comparator<Digimon>`.

A ordenação utiliza:

1. nível de ameaça do maior para o menor;
2. quantidade de dados do maior para o menor;
3. ordem natural como desempate final.

## Sistema de avistamentos

O primeiro registro de um Digimon adiciona a entidade ao catálogo, ao conjunto de registros únicos e ao mapa com quantidade inicial igual a 1.

Quando outro objeto com o mesmo código é registrado, o catálogo e o Set permanecem iguais, enquanto a quantidade correspondente no Map aumenta em uma unidade.

## Busca por código

O Arquivo Digital permite localizar um Digimon pelo código.

A busca percorre o catálogo e retorna a entidade encontrada ou `null` quando o código não está registrado.

## Busca por nome

O sistema também permite pesquisar parte do nome de um Digimon.

A busca ignora diferenças entre maiúsculas e minúsculas e retorna uma `List<Digimon>` contendo todas as correspondências.

Por exemplo, a busca por `greymon` encontra:

- Greymon
- MetalGreymon
- WarGreymon

## Estado compartilhado

A classe `Digimon` mantém um contador `static` com a quantidade total de objetos construídos.

A Boss Battle cria sete objetos, embora apenas cinco tipos únicos sejam mantidos no Arquivo Digital.

Isso demonstra a diferença entre quantidade de objetos criados e quantidade de entidades únicas catalogadas.

## Autoboxing e unboxing

As quantidades de avistamentos são armazenadas como `Integer` no `Map`.

Durante uma atualização, o valor armazenado passa por unboxing para o cálculo e por autoboxing ao ser armazenado novamente.

## Dados esperados

Ao final da execução:

- 7 objetos Digimon devem ter sido criados;
- 5 tipos únicos devem estar catalogados;
- 7 avistamentos devem estar registrados;
- MetalGreymon deve possuir 2 avistamentos;
- WarGreymon deve possuir 2 avistamentos.

MetalGreymon deve vencer o empate de mais avistado devido à ordem natural.

## Como executar

1. Abrir o projeto no IntelliJ.
2. Executar `ArquivoDoMundoDigital`.
3. Observar os registros, buscas, ordenações e relatório final.

## Resultado esperado

O Arquivo Digital deve possuir 5 tipos únicos, 7 avistamentos e 7 objetos Digimon criados.

MetalGreymon e WarGreymon devem possuir 2 avistamentos cada, com MetalGreymon vencendo o desempate pela ordem natural.