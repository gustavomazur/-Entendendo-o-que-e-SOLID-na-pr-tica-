# Interface Segregation Principle (ISP)

Anotações sobre a classe Wrong explicação.

## Uso
- Crio um carro novo, o fiatUno, com 4 pneus e direção hydraulic
- Executo a quantidade de combustível, que vai dizer se é suficiente ou não
- O helicóptero é obrigado a receber 4 rodas e direção vazia, mesmo não usando

## O que diz o princípio ?
- A classe não pode ser forçada a implementar funcionalidade que ela não usa
- Interface abrangente demais obriga a classe a fazer gambiarra pra funcionar

## A classe
- A interface Vehicle é muito abrangente: todo veículo tem que ter rodas e tipo de direção
- O carro implementa a interface e usa tudo certinho
- O helicóptero implementa a mesma interface, mas não tem rodas nem tipo de direção

## O problema
- O helicóptero foi obrigado a colocar número de rodas e tipo de direção, mesmo sem usar
- Pra funcionar, coloquei valores falsos/fictícios (4 rodas e direção vazia)
- A quantidade de piloto, que é a propriedade que ele realmente usa, fica escondida

## Por que isso é errado ?
- A interface abrangente força a classe a implementar o que ela não usa
- Pra fazer o código se dar bem, precisei fazer gambiarra
- O funcionamento correto dependeria de coisas falsas, fictícias