package d.wrong;

/**
 * Classe Pagseguro.
 * Aqui o Pagseguro tem uma função pra setar o nome do produto,
 * uma função pra setar o preço do produto e uma função pra executar.
 */
class Pagseguro {
    public void setProductName(String name) {}
    public void setPrice(double price) {}

    public void execute() {
        System.out.println("Pagou pelo Pagseguro");
    }
}

/**
 * Classe MercadoPago.
 * Aqui está diferente: tenho uma função que seta o produto
 * (nome e preço juntos) e a função executar.
 */
class MercadoPago {
    public void setProduct(String name, double price) {}

    public void execute() {
        System.out.println("Pagou pelo MercadoPago");
    }
}

/**
 * Classe Payment (o problema).
 * Recebe o nome do produto, o preço do produto e o tipo de pagamento.
 * No construtor só manda o tipo, depois seta o produto e executa.
 * O problema: no execute, dependendo do type, instancia o Pagseguro
 * ou o MercadoPago aqui dentro, acoplado às classes concretas.
 * Se for adicionar um Paypal, vai ter que mexer no sistema todo aqui.
 */
class Payment {
    public String productName = "";
    public double productPrice = 0;
    public String type;

    public Payment(String type) {
        this.type = type;
    }

    public void setProduct(String name, double price) {
        this.productName = name;
        this.productPrice = price;
    }

    public void execute() {
        if (this.type.equals("pagseguro")) {
            Pagseguro pagseguro = new Pagseguro();
            pagseguro.setProductName(this.productName);
            pagseguro.setPrice(this.productPrice);
            pagseguro.execute();
        } else {
            MercadoPago mp = new MercadoPago();
            mp.setProduct(this.productName, this.productPrice);
            mp.execute();
        }
    }
}

/**
 * Classe principal com a lógica de uso.
 */
public class Wrong {
    public static void main(String[] args) {
        // Uso: criei um Payment e falei que era um Pagseguro,
        // setei o produto nome "Bla bla" valor 990 e mandei executar
        Payment payment = new Payment("pagseguro");
        payment.setProduct("Bla bla", 990);
        payment.execute();
        // se mudar pra MercadoPago no lugar de Pagseguro, também funciona
    }
}