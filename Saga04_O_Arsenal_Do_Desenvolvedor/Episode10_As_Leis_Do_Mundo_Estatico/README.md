# Episode 10 — As Leis do Mundo Estático

## Objetivo
Aprender a diferenciar estado de instância e estado compartilhado utilizando static, constantes, classes utilitárias, wrappers, autoboxing, conversões numéricas e formatação.

## Conceitos praticados
- static
- atributos estáticos
- métodos estáticos
- static final
- constantes
- classes utilitárias
- tipos primitivos
- wrappers
- Integer
- Double
- autoboxing
- unboxing
- Integer.parseInt()
- Double.parseDouble()
- Math.round()
- Math.min()
- Math.max()
- String.format()
- ArrayList<Integer>

## Descrição da missão
O programa representa o Arsenal Dimensional, responsável por registrar artefatos encontrados no Backendverse.

Cada artefato possui nome, poder base e multiplicador próprios. A classe Artefato também controla a quantidade total de objetos criados e define um limite máximo universal de poder.

Uma classe utilitária calcula, arredonda e limita o poder final sem precisar ser instanciada.

## Estrutura
- `Artefato`: representa o estado individual e compartilhado dos artefatos.
- `CalculadoraDoArsenal`: oferece cálculos estáticos para o poder final.
- `RegistroDoArsenal`: armazena artefatos e poderes calculados.
- `ArsenalDimensional`: converte os dados e executa o fluxo principal.

## Métodos da API utilizados
- `Integer.parseInt()`: converte texto para int.
- `Double.parseDouble()`: converte texto para double.
- `Math.round()`: arredonda o poder calculado.
- `Math.min()`: aplica o limite máximo e encontra o menor poder.
- `Math.max()`: encontra o maior poder.
- `String.format()`: formata valores numéricos.
- `ArrayList.add()`: armazena artefatos e wrappers.
- `ArrayList.get()`: acessa elementos pelo índice.
- `ArrayList.size()`: informa a quantidade de elementos.

## Estado de instância e estado compartilhado
Nome, poder base e multiplicador pertencem a cada artefato.

O total de artefatos é compartilhado pela classe, enquanto LIMITE_MAXIMO representa uma constante universal.

## Autoboxing observado
Os poderes são calculados como valores int e adicionados a um ArrayList<Integer>. O Java converte automaticamente cada int em Integer durante a adição.

## Como executar
1. Abrir o projeto no IntelliJ.
2. Executar a classe `ArsenalDimensional`.
3. Observar as conversões, o registro dos artefatos, os poderes finais e o relatório.

## Resultado esperado
O sistema deve converter valores textuais, criar artefatos independentes, controlar informações compartilhadas com static, calcular poderes por uma classe utilitária e respeitar o limite máximo universal.