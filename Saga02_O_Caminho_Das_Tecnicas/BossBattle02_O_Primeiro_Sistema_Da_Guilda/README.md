# Boss Battle II — O Primeiro Sistema da Guilda

## Objetivo
Integrar os conceitos estudados nos Episódios 04, 05 e 06 em um sistema completo de aventureiros e missões.

## Planejamento

1. Qual classe representa um aventureiro?
   `AventureiroGuilda`.

2. Qual classe representa uma missão?
   `MissaoGuilda`.

3. Qual classe administra o quadro?
   `QuadroGuilda`.

4. Quem verifica a execução da missão?
   O quadro coordena a operação, enquanto o aventureiro e a missão controlam seus próprios estados.

5. O que acontece quando falta energia?
   A missão é recusada e continua disponível.

6. Como uma missão deixa de estar disponível?
   O método `concluir()` altera seu estado após uma execução bem-sucedida.

7. Como null será impedido?
   O quadro verifica a referência antes de adicionar ou executar.

8. O que será testado?
   Adição, bloqueio de null, busca, energia insuficiente, conclusão e remoção.

## Conceitos praticados
- atributos privados
- métodos com parâmetros e retorno
- alteração de estado
- validações
- ArrayList
- add, get, size, remove e isEmpty
- busca manual
- loops
- testes com PASS e FAIL

## Estrutura
- `AventureiroGuilda`: representa um membro da guilda.
- `MissaoGuilda`: representa uma missão.
- `QuadroGuilda`: administra as missões.
- `TesteSistemaGuilda`: valida os comportamentos.
- `SistemaGuilda`: executa o fluxo principal.

## Como executar

### Testes
Execute `TesteSistemaGuilda`.

### Sistema principal
Execute `SistemaGuilda`.

## Resultado esperado
O sistema deve registrar, listar, buscar, concluir e remover missões, validando energia e atualizando o estado dos aventureiros.