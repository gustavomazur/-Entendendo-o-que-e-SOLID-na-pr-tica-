# Open/Closed Principle (OCP)

Anotações sobre a classe Right explicação .

## O código é agnóstico
- Agnóstico em termos de código quer dizer que aquele código não se importa com o item que vai ser utilizado junto dele
- Ou seja: você está mandando um caminhão? sem problema, você não muda nada no código
- Do jeito que está aqui, se você vai usar navio, sem problema; nave espacial, sem problema
- Se vai subir em cima e vai mandar pro ET, sem problema
- Desde que eles tenham as mesmas propriedades, tudo bem
- Sem problema nenhum

## Como calcula o preço
- Pra calcular o preço usei a mesma matemática: volume x multiplicador de volume
- Cada tipo de transporte vai ter um multiplicador diferente

## Como calcula o tempo
- Pra pegar o tempo, vou pegar a distância dividida pelo divisor de distância
- Cada tipo de transporte vai ter um divisor diferente também

## Criando um novo transporte (nave espacial)
- Fiz a classe da nave espacial: só estendi e coloquei o multiplicador e o divisor de cada um
- Pra usar, é só trocar no main para `TransportBySpacechip` que já vai funcionar
- Eu estendi e vai funcionar normal, só precisei adicionar
- Agora posso criar infinitos tipos de transporte: só coloco o multiplicador dele e o divisor da distância

## O que é o super ?
- No construtor da subclasse passo só o volume e a distância
- Ele vai usar um `super`. O que é esse `super`?
- Pra executar o construtor do item que ele está herdando, ou seja, o transporte
- Aí ele passa todos os itens que o transporte exige: o tipo, o volume e a distância

## Por que a subclasse não tem getPrice nem getTimeEstimate ?
- Porque esses caras estão no transporte oficial, ou seja, no que foi feito na classe base
- A classe TransportByTruck só tem multiplicador de volume e divisor de distância
- Criei uma variação de transporte exclusiva para caminhão
- Quando for caminhão, o multiplicador vai ser 80 e o divisor vai ser 100

## No uso
- Agora eu tenho uma classe específica pra cada transporte, que passo o volume e a distância
- Consigo trocar o tipo de transporte e vai funcionar do mesmo jeito
- Ele me dá um preço e o tempo que vai demorar

## Não é que nunca mais vou mecher nesse codigo 
- mais sim quanto eu tenho um código que tem varias formas de ser execultada
- Esse é um dos exemplos -> fazendo um sistema de pagamento pix, pagamento no boleto
- via cartão, mais pra frente surge mais alguma outra coisa né eu quero adicionar 
- Eu preciso alterar meu código principal de pagamento ? não eu crio ela de forma que 
- eu consigo estender e criar qualquer forma de pagamento que eu quiser 