# Liskov Substitution Principle (LSP)

Anotações sobre a classe Wrong explicação.

## Uso
- Crio um retângulo e jogo na função `setAndShow`
- Essa função seta uma largura (5) e uma altura (4) e mostra a área

## O que diz o princípio ?
- Se você estende uma classe, quem usa o pai tem que poder usar o filho no lugar dele sem causar prejuízo no funcionamento
- No livro: usar o filho da classe no lugar do pai não pode quebrar o sistema

## A classe
- `Rectangle` tem largura, altura e calcula a área (largura x altura)
- `Square` estende o retângulo, mas sobrescreve o `setWidth` e o `setHeight`
  pra forçar largura = altura, porque quadrado tem os lados iguais

## O problema
- Eu não mantive o princípio de funcionamento original
- A função original trocava largura e altura separadas; a do quadrado troca as duas juntas
- No `main`, passo um quadrado onde a função espera um retângulo:
  - Não dá erro, porque o quadrado herda do retângulo
  - Mas o `setWidth(5)` seguido do `setHeight(4)` não resulta em 5x4 = 20
  - O quadrado força os dois lados pra 4 e o resultado sai 4x4 = 16

## Por que isso é errado ?
- O código que funcionava com o retângulo se comporta diferente com o quadrado
- Pra fazer o filho "se dar bem", eu baguncei o funcionamento do pai
- Parece funcionar, mas é coisa preguiçosa: quebra o princípio ao usar o filho no lugar do pai