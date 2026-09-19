# Liskov Substitution Principle (LSP)

Anotações sobre a classe Right explicação.

## O problema do Wrong
- No Wrong eu estendi o retângulo pra criar o quadrado e mudei o funcionamento do pai
- Isso quebrou o princípio: quadrado no lugar de retângulo não se comportava igual

## A diferença do Right
- Criei uma interface chamada `Shape` (a forma)
- A Shape tem o que é comum a todos os itens: nesse caso só o `getArea`
- Retângulo e quadrado não herdam mais um do outro: os dois implementam a Shape

## Como cada um faz a área
- Retângulo: `getArea` = largura x altura
- Quadrado: `getArea` = lado x lado
- Cada um tem seus próprios dados (retângulo: width/height, quadrado: sides)
- E cada um imprime o `getArea` do seu jeito, sem mexer na lógica do outro

## Por que não quebra mais ?
- O "pai" agora é a Shape, que só promete o `getArea`
- Tanto o retângulo quanto o quadrado cumprem essa promessa
- Posso usar o quadrado no lugar do retângulo (os dois são Shape) e o funcionamento continua certo

## Analogia da sala de arrumar
- Eu tinha uma sala que só arrumava computador e queria arrumar celular
- Errado: estender a sala e fazer ela arrumar celular com a mesma lógica do computador
- Certo: criar uma "super sala" com o que é comum (cadeira, mesa, as coisas básicas)
- Pra arrumar celular: uso a super sala e especifico o que o celular precisa
- Pra arrumar computador: uso a mesma super sala e especifico o que o computador precisa
- Nenhum dos dois mexe na lógica da super sala

## Resultado
- Tenho uma interface que é o contrato comum
- Pego a interface pra criar cada item, sem herdar um do outro
- Ninguém altera o funcionamento do outro, então a substituição não quebra nada

## Lembrando
- Esse é o princípio mais complicado dos cinco, pode ser que não fique 100% de cara
- Com o tempo você se acostuma e aplica fácil pelo sistema, sem problema nenhum