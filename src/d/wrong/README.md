# Dependency Inversion Principle (DIP)

Anotações sobre a classe Wrong explicação.

## Uso
- Criei um Payment e falei que era um Pagseguro
- Setei o produto nome "Bla bla" valor 990 e mandei executar, que faz o pagamento
- Se mudar pra MercadoPago no lugar de Pagseguro e executar novamente, pagou de novo, funcionou

## A classe Payment
- Criei um Payment, ela recebe o nome do produto, o preço do produto e o tipo de pagamento
- No construtor só manda o tipo, depois eu seto o produto nome e preço e executo
- Inclusive as execuções são feitas de formas diferentes
- Como assim? o Pagseguro eu coloquei uma função pra setar o nome do produto, uma função pra setar o preço do produto, uma função pra executar
- Já no MercadoPago é diferente: eu tenho uma função que seta o produto, que eu mando o nome é o preço, e a função executa

## Como está sendo feito
- No execute do Payment, quanto o type é pagseguro, instancio o Pagseguro, seto nome do produto, preço do produto e executo
- Quanto não for, é MercadoPago: seto nome do produto é preço e executa

## O problema
- Está funcionando, mas o princípio fala: se tem várias opções de funcionamento, em vez de criar todas dentro da classe, crie interfaces ou classes pra cada opção e faça injeção de dependência
- Pra nós não precisar ficar mexendo e alterando o Payment: se for adicionar um Paypal na vida, vou ter que sair criando aqui e alterando pra suportar o Paypal
- Vou ter que mexer no sistema todo aqui, instanciar o Paypal aqui dentro, enfim vai ser uma bagunça
- Aí sim a gente vê a maneira correta