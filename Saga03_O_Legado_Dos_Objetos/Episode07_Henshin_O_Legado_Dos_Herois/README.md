# Episode 07 — A Herança dos Clãs: Henshin! O Legado dos Heróis

## Objetivo
Aprender a utilizar herança, composição, sobrescrita e polimorfismo para organizar diferentes tipos de combatentes.

## Conceitos praticados
- extends
- herança
- relação IS-A
- relação HAS-A
- composição
- sobrescrita
- @Override
- polimorfismo
- referência da superclasse
- ArrayList de objetos polimórficos
- encapsulamento
- getters e setters

## Descrição da missão
O programa representa a Agência Vértice, responsável por reunir Riders e Rangers em uma única formação. Todos compartilham características de Combatente, mas possuem suas próprias transformações e golpes finais.

## Estrutura
- `Equipamento`: representa as informações comuns dos equipamentos.
- `Arma`: representa a arma principal de um combatente.
- `DispositivoTransformacao`: representa o equipamento utilizado durante a transformação.
- `Combatente`: concentra os atributos e comportamentos compartilhados pelos heróis.
- `Rider`: representa um cavaleiro mascarado com transformação e golpe final próprios.
- `Ranger`: representa um integrante de esquadrão cromático com transformação e golpe final próprios.
- `AgenciaVertice`: administra o ArrayList de combatentes e coordena as ações da formação.
- `OperacaoHenshin`: executa o fluxo principal.

## Relações aplicadas
- `Arma` IS-A `Equipamento`.
- `DispositivoTransformacao` IS-A `Equipamento`.
- `Rider` IS-A `Combatente`.
- `Ranger` IS-A `Combatente`.
- `Combatente` HAS-A `Arma`.
- `Combatente` HAS-A `DispositivoTransformacao`.
- `AgenciaVertice` HAS-A vários `Combatente`.

## Como executar
1. Abrir o projeto no IntelliJ.
2. Executar a classe `OperacaoHenshin`.
3. Verificar as transformações, ataques e validações exibidas no console.

## Resultado esperado
O programa deve registrar, apresentar e transformar Riders e Rangers, executar ataques e golpes finais polimórficos, consumir energia e impedir golpes quando o combatente não estiver transformado ou não possuir energia suficiente.