package l.wrong;

/**
 * Classe base: Retângulo.
 * Guarda a largura e a altura e sabe calcular a própria área.
 */
class Rectangle {
    public double width = 1;
    public double height = 1;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
}

/**
 * Quadrado estendendo Retângulo (VIOLAÇÃO do LSP).
 *
 * Quadrado tem os lados iguais, então sobrescrevi o setWidth e o
 * setHeight pra forçar largura = altura.
 * Primeira vista funciona, mas aqui quebra o princípio da Liskov:
 * eu mudei o funcionamento da classe pai. No retângulo o setWidth
 * só mexe na largura; no quadrado ele mexe nos dois valores.
 */
class Square extends Rectangle {
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(double height) {
        this.width = height;
        this.height = height;
    }
}

// Classe principal para teste
public class Wrong {

    /**
     * Seta uma largura e uma altura no retângulo recebido e mostra a área.
     * Ex. retângulo: seta largura 5, altura 4 e mostra "area: 5x4 = 20".
     */
    public static void setAndShow(Rectangle rec) {
        rec.setWidth(5); // uma largura
        rec.setHeight(4); // e uma altura
        System.out.println("area: " + rec.width + "x" + rec.height + " = " + rec.getArea());
    }

    public static void main(String[] args) {
        // Passando um retângulo normal: funciona certo, 5x4 = 20
        Rectangle rec1 = new Rectangle();
        setAndShow(rec1);

        // Passando um quadrado no lugar de um retângulo:
        // a função espera um Rectangle, e Square herda de Rectangle,
        // então compila sem reclamar.
        // Mas o quadrado mudou o funcionamento: setar largura 5 e altura 4
        // forçou os dois pra 4, então aparece "area: 4x4 = 16" em vez de 20.
        Rectangle rec2 = new Square();
        setAndShow(rec2);
    }
}