# SOLID  OS 5 PRINCIPIOS

### 3 dicas que resumi os 5 principios
que podem ajudar no começo
- Obetivo geral do SOLID são 3 coisas principalmente 
- sempre dividir o segu código cada coisa no seu quadrado 
- quando perceber que tá adpatando muito seu código para adicionar 
algo novo, provalmente dá pra melhorar seu código
- pensa que tecnhologias mudam, quando usar coisas externas, isola essa coisa externa 
---
# [s] single responsibility principle (SRP) 
# Principio da responsabilidade unica
- Estudos sobre os princípios SOLID, usando o exemplo do carro e o log.

#### Estrutura

- `src/s/wrong/` — exemplo que quebra o princípio da responsabilidade única
  - `Wrong.java` — código com o log dentro da classe do carro
  - `README.md` — anotações sobre a classe Wrong
#### anotação
- Caminho do README do exemplo errado: [src/s/wrong/README.md](src/s/wrong/README.md)

---
- `src/s/right/` — exemplo corrigido, seguindo o princípio
  - `Right.java` — código com o log separado na classe Logger
  - `README.md` — anotações sobre a classe Right

#### Anotações
- Caminho do README do exemplo certo: [src/s/right/README.md](src/s/right/README.md)

---
# [o] open/closed principle (OCP)
# Principio aberto pra extensão e fechado pra modificação

#### Estrutura

- `src/o/wrong/` — exemplo que quebra o princípio OCP (usa switch)
  - `Wrong.java` — código com switch cases pra cada tipo de transporte
  - `README.md` — anotações sobre a classe Wrong
#### anotação
- Caminho do README do exemplo errado: [src/o/wrong/README.md](src/o/wrong/README.md)

---
- `src/o/right/` — exemplo corrigido, seguindo o princípio
  - `Right.java` — código com subclasses estendendo a classe base
  - `README.md` — anotações sobre a classe Right

#### Anotações
- Caminho do README do exemplo certo: [src/o/right/README.md](src/o/right/README.md)

---
# [l] liskov substitution principle (LSP)
# Principio da substituição de liskov

#### Estrutura

- `src/l/wrong/` — exemplo que quebra o princípio LSP (quadrado estende retângulo)
  - `Wrong.java` — código com o quadrado mudando o funcionamento do retângulo
  - `README.md` — anotações sobre a classe Wrong
#### anotação
- Caminho do README do exemplo errado: [src/l/wrong/README.md](src/l/wrong/README.md)

---
- `src/l/right/` — exemplo corrigido, seguindo o princípio
  - `Right.java` — código com a interface Shape e cada forma implementando ela
  - `README.md` — anotações sobre a classe Right

#### Anotações
- Caminho do README do exemplo certo: [src/l/right/README.md](src/l/right/README.md)

---
# [i] interface segregation principle (ISP)
# Principio da segregação de interfaces

#### Estrutura

- `src/i/wrong/` — exemplo que quebra o princípio ISP (interface abrangente demais)
  - `Wrong.java` — código com a interface Vehicle forçando o helicóptero a ter rodas e tipo de direção
  - `README.md` — anotações sobre a classe Wrong
#### anotação
- Caminho do README do exemplo errado: [src/i/wrong/README.md](src/i/wrong/README.md)

---
- `src/i/right/` — exemplo corrigido, seguindo o princípio
  - `Right.java` — código com as interfaces divididas (Vehicle, AutomotiveVehicle, AerialVehicle)
  - `README.md` — anotações sobre a classe Right

#### Anotações
- Caminho do README do exemplo certo: [src/i/right/README.md](src/i/right/README.md)

---
# [d] dependency inversion principle (DIP)
# Principio da inversão de dependencia

#### Estrutura

- `src/d/wrong/` — exemplo que quebra o princípio DIP (Payment instancia as classes concretas)
  - `Wrong.java` — código com o Payment decidindo pelo type entre Pagseguro e MercadoPago
  - `README.md` — anotações sobre a classe Wrong
#### anotação
- Caminho do README do exemplo errado: [src/d/wrong/README.md](src/d/wrong/README.md)

---
- `src/d/right/` — exemplo corrigido, seguindo o princípio
  - `Right.java` — código com a interface PaymentHandler e o Payment recebendo o handler por injeção de dependência
  - `README.md` — anotações sobre a classe Right

#### Anotações
- Caminho do README do exemplo certo: [src/d/right/README.md](src/d/right/README.md)

