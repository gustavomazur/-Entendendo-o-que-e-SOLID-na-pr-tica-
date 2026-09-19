# Open/Closed Principle (OCP)

Anotações sobre a classe Wrong explicação .

## Uso
- `pkg` -> pacote
- `volume` -> do pacote
- `distance` -> do pacote, 140km
- De avião um preço, de caminhão outro preço e tempos diferentes

## A classe Transport
- Ela tem: tipo de transporte, volume e distância
- No construtor passo essas informações
- A função `getPrice` tem caminhão, avião e navio
- Avião é o padrão: se não mandar nenhum tipo, avião vai ser o padrão
- A função `getTimeEstimate` pega a distância e divide: caminhão divide por 100, avião por 800

## Exemplo: quero adicionar um novo item
Quero adicionar uma nave espacial. O que eu faria?

Ir no `getPrice` e adicionar um novo `case`:
```java
case "Spaceship":
    return this.volume * 9000;
```

Ir no `getTimeEstimate` e adicionar outro `case`:
```java
case "Spaceship":
    return this.distance / 9000;
```

Agora consigo entregar com caminhão e com nave espacial também kkkk

## Qual foi o problema de eu adicionar a nave espacial ?
- Código existente não deve ser modificado pra adicionar novas funcionalidades, mas sim estendido