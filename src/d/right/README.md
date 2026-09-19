# Dependency Inversion Principle (DIP)

Anotações sobre a classe Right explicação.

## Uso
- Criei o payment, fiz uma injeção de dependência, instanciei o MercadoPago e setei o produto "Bla bla" por 990 e executei
- Se eu trocar pelo Pagseguro executar, funciona normal também
- Eu simplesmente fiz injeção de dependência
- Se eu criar um Paypal vai funcionar, se eu criar Nubank vai funcionar
- Ele não quer saber se é MercadoPago, Paypal ou Nubank: manda o tipo de pagamento aí que eu vou pagar

## O que é o Payment
- Eu tenho meu Payment, ele está agnóstico: não tem nada de Pagseguro, MercadoPago, nada
- O que tem? um handler, um carinha que vai fazer o processo de pagamento
- O setProduct dentro do handler e o execute dentro do handler
- Meu Payment está nem aí pro tipo do meu pagamento: ele tem uma função pra setar produto e uma função pra executar, e acabou
- Ele funciona com qualquer um que siga os princípios que a gente vai setar nessa interface PaymentHandler

## A interface PaymentHandler
- PaymentHandler tem o quê? tem a função setProduct e a função execute
- Ou seja, todo sistema de pagamento que for implementar nesse sistema aqui tem que ter esses dois caras
- O Pagseguro tem que estar rodando com essa interface bonitinha PaymentHandler
- O MercadoPago também, se vou adicionar o Nubank ele também tem que estar com a interface bonitinha rodando PaymentHandler
- Vamos ver como a gente fez com o Pagseguro: ele tá implementando PaymentHandler, então ele tem o setProduct e ele tem o execute
- MercadoPago mesma coisa, e se for adicionar outro tipo de pagamento mesma coisa
- Não importa o tipo, é só implementar o PaymentHandler
- E lógico, cada handler desses tem que estar em um arquivo separado

## Na prática
- Se eu fiz o Paypal, a integração de conexão com servidor e com API do Paypal eu faço aqui, ele está nem aí

## Ligação com o SRP
- Esse princípio se comunica diretamente com o primeiro princípio: quando eu aplico o princípio da inversão de dependência da forma correta, eu também estou aplicando o princípio da responsabilidade única
- Quando eu aplico um, às vezes eu estou aplicando outro também
- Perceba que eles vão se comunicando junto, vão criando um ambiente onde você cria um código que segue algumas diretrizes gerais