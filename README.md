# SOLID

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

