# Responsabilidade Única (SRP)

Anotações sobre a classe Right explicação .

## A diferença do Right
- O log não é mais uma função da própria classe do carro
- A classe do carro só tem função que o próprio carro faz

## Onde o log foi parar ?
- No move ainda tem o log, mais agora ele está separado
- Poderia até ser colocado em um arquivo diferente

## O que diz o princípio ?
- O princípio da responsabilidade única fala justamente isso
- Quando você tem algo que não é o objetivo principal daquela classe, você tem que pegar aquilo e jogar em outro local
- Esse outro local vai ser o responsável por fazer apenas aquilo

## Resultado
- Tenho uma classe que faz apenas o     log
- Tenho uma classe que cuida apenas das coisas do carro