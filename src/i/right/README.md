# Interface Segregation Principle (ISP)

Anotações sobre a classe Right explicação.

## A diferença do Right
- O que eu fiz: dividi a interface, agora eu tenho 3 interfaces
- A implementação continua igual, o carro igual ao outro
- O helicóptero está igual ao outro, só que mais lógico: só com os itens que ele precisa que tem pra funcionar certinho
- Fiz uma divisão, como o próprio nome do princípio já fala, segregação de interfaces: peguei uma interface abrangente e dividi ela em interfaces específicas, herdando o que tem de comum entre essas interfaces

## Como ficou dividido
- Todo veículo vai ter a função pra calcular o combustível
- Um veículo automotivo ele tem rodas e tipo de direção
- Já um veículo aéreo ele vai ter quantidade de pilotos
- Os dois entendem vehicle, os dois são veículos, mas cada um tem suas propriedades, e tem a função de veículo

## A diferença pro errado
- No errado estava muito abrangente: se eu precisasse de um veículo muito específico e ele não atendesse todas as demandas de um veículo abrangente, eu ia ter que fazer gambiarra pra fazer funcionar
- No certo não preciso fazer gambiarra pra fazer funcionar
- Eu dividi, consigo criar um veículo automotivo, um aéreo, um navio por exemplo

## No uso
- Olha como o uso fica bem mais tranquilo: o carro vê rodas, tipo de direção e olha o combustível
- Criei um helicóptero, tem o quê? 2 pilotos e vê o combustível