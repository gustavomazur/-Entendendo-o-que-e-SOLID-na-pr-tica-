# Responsabilidade Única (SRP)

Anotações sobre a classe Wrong explicação .

## A função move
- Ela tem que fazer o que ?
- Ela tem que apenas se mover

## O problema
- Ela está apenas movendo o carro ? não
- Ela está movendo o carro, mais ela também está executando um log

## Por que isso é errado ?
- Essa função do log ... ela tem alguma coisa a ver com o carro ? não
- Ela vai fazer é mostrar na tela o que está acontecendo
- Então ela não deveria estar na classe do carro, deveria estar em outro lugar
- Com a própria responsabilidade de fazer o log