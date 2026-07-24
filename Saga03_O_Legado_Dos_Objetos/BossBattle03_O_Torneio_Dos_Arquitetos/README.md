# Boss Battle III — O Torneio dos Arquitetos

## Objetivo
Integrar herança, composição, classes abstratas, interfaces, construtores e polimorfismo em um sistema completo com validação de energia e testes manuais.

## Conceitos praticados
- herança
- relações IS-A
- composição
- relações HAS-A
- classes abstratas
- métodos abstratos
- interfaces
- múltiplos contratos
- sobrescrita
- polimorfismo
- referências polimórficas
- construtores
- sobrecarga
- this(...)
- super(...)
- validação de estado inicial
- ArrayList de abstrações
- testes manuais
- métodos da API Java

## Descrição da missão
O programa representa o Torneio dos Arquitetos, no qual diferentes construções são avaliadas pelo Conselho dos Arquitetos.

Cada construção possui um núcleo arquitetônico responsável por controlar a energia necessária para ativar seu sistema principal. Algumas construções possuem capacidades defensivas, outras conseguem expandir sua arquitetura e uma delas cumpre os dois contratos.

## Estrutura
- `NucleoArquitetonico`: valida e controla a energia.
- `Construcao`: classe abstrata com o estado compartilhado dos projetos.
- `Defensora`: contrato para construções defensivas.
- `Expansora`: contrato para construções expansíveis.
- `FortalezaAegis`: construção defensiva com sobrecarga de construtores.
- `CidadeNexus`: construção especializada em expansão.
- `BastiaoPrismatico`: construção defensiva e expansível.
- `ConselhoDosArquitetos`: registra e coordena construções por abstrações.
- `TorneioDosArquitetos`: executa o fluxo principal.
- `TesteTorneioDosArquitetos`: valida regras e estados do sistema.

## Relações aplicadas
- `FortalezaAegis` IS-A `Construcao`.
- `CidadeNexus` IS-A `Construcao`.
- `BastiaoPrismatico` IS-A `Construcao`.
- `Construcao` HAS-A `NucleoArquitetonico`.
- `FortalezaAegis` implementa `Defensora`.
- `CidadeNexus` implementa `Expansora`.
- `BastiaoPrismatico` implementa `Defensora` e `Expansora`.
- `ConselhoDosArquitetos` administra coleções de `Construcao`, `Defensora` e `Expansora`.

## Cadeia de construtores
O construtor padrão de `FortalezaAegis` reutiliza o construtor personalizado com `this(...)`.

O construtor personalizado encaminha os dados compartilhados para `Construcao` utilizando `super(...)`.

## Métodos da API utilizados
- `ArrayList.add()`: registra construções e capacidades.
- `ArrayList.remove()`: remove a mesma referência das coleções.
- `ArrayList.size()`: informa a quantidade de elementos registrados.

## Como executar
1. Abrir o projeto no IntelliJ.
2. Executar `TorneioDosArquitetos`.
3. Observar a materialização, os registros, as ativações e o relatório final.
4. Executar `TesteTorneioDosArquitetos`.
5. Confirmar que todos os testes apresentam `[PASS]`.

## Resultado esperado
O sistema deve coordenar diferentes construções por abstrações, controlar energia por composição, executar comportamentos polimórficos, preservar o estado após ativações recusadas e validar suas regras por testes manuais.