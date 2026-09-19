package l.right;

/**
 * Interface Shape (a forma).
 * Define as propriedades que são comuns a todos os itens que eu quero criar.
 * Nesse caso só uma: calcular a área.
 */
interface Shape {
    double getArea();
}

/**
 * Class Rectangle.
 * Implementa Shape.
 * Largura e altura são coisas exclusivas do retângulo.
 */
class Rectangle implements Shape {
    public double width = 1;
    public double height = 1;

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}

/**
 * Class Square.
 * Implementa Shape também.
 * Quadrado tem um único valor: o tamanho do lado.
 */
class Square implements Shape {
    public double sides = 1;

    public void setSides(double newSides) {
        this.sides = newSides;
    }

    @Override
    public double getArea() {
        return this.sides * this.sides;
    }
}

/**
 * Classe principal com a lógica de uso.
 *
 * Agora o "pai" comum é a interface Shape.
 * Como retângulo e quadrado implementam o mesmo contrato (getArea),
 * posso usar qualquer um deles sem quebrar o funcionamento:
 * cada um calcula a área do seu jeito, mas os dois cumprem a promessa da Shape.
 */
public class Right {
    public static void main(String[] args) {
        // Uso do retângulo: seto largura 5 e altura 4, área = 20
        Rectangle rec = new Rectangle();
        rec.setWidth(5);
        rec.setHeight(4);
        System.out.println("area: " + rec.width + "x" + rec.height + " = " + rec.getArea());

        // Uso do quadrado: seto o lado pra 4, área = 16
        Square sqr = new Square();
        sqr.setSides(4);
        System.out.println("area: " + sqr.sides + " lados = " + sqr.getArea());
    }
}