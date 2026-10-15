## Pré-Requisitos
Java 21; Maven
## Filepath
Windows: Saga06_A_Ponte_Para_O_Backend\Checkpoint_O_Ambiente_Profissional
Linux: Saga06_A_Ponte_Para_O_Backend/Checkpoint_O_Ambiente_Profissional
## Regras

Uma missão possui código, nível mínimo e recompensa em XP.

O método podeAceitar() verifica o nível do aventureiro:
- Retorna true quando o nível é igual ou superior ao mínimo.
- Retorna false quando o nível é inferior ao mínimo.
- Lança IllegalArgumentException quando o nível é negativo.

MissaoJson serializa objetos Missao em JSON e
desserializa JSON em objetos Missao.
## Validação

Abra um terminal na pasta do Checkpoint e execute:

```powershell
mvn clean verify
```

Resultado esperado:

- 6 testes executados
- 0 falhas
- 0 erros
- BUILD SUCCESS

Se o Maven apresentar BUILD FAILURE, examine as mensagens
de erro e os resultados dos testes antes de considerar a
entrega aprovada.
