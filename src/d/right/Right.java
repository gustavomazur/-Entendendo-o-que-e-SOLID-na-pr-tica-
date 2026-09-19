package d.right;

/**
 * Interface PaymentHandler (o contrato).
 * Todo sistema de pagamento que for implementar nesse sistema aqui
 * tem que ter esses dois caras: a função setProduct e a função execute.
 */
interface PaymentHandler {
    void setProduct(String name, double price);
    void execute();
}

/**
 * Classe Pagseguro.
 * Implementa a PaymentHandler: tem o setProduct e tem o execute.
 */
class Pagseguro implements PaymentHandler {
    @Override
    public void setProduct(String name, double price) {}

    @Override
    public void execute() {
        System.out.println("Pagou pelo Pagseguro");
    }
}

/**
 * Classe MercadoPago.
 * Mesma coisa do Pagseguro: implementa a PaymentHandler.
 */
class MercadoPago implements PaymentHandler {
    @Override
    public void setProduct(String name, double price) {}

    @Override
    public void execute() {
        System.out.println("Pagou pelo MercadoPago");
    }
}

/**
 * Classe Payment.
 * Aqui fiz a injeção de dependência: em vez de instanciar o Pagseguro
 * ou o MercadoPago aqui dentro, recebo um handler (o carinha que vai
 * fazer o processo de pagamento) pelo construtor.
 * O Payment está agnóstico: não importa se é MercadoPago, Pagseguro,
 * Paypal ou Nubank, se seguir o contrato da PaymentHandler funciona.
 */
class Payment {
    private PaymentHandler handler;

    public Payment(PaymentHandler handler) {
        this.handler = handler;
    }

    public void setProduct(String name, double price) {
        this.handler.setProduct(name, price);
    }

    public void execute() {
        this.handler.execute();
    }
}

/**
 * Classe principal com a lógica de uso.
 */
public class Right {
    public static void main(String[] args) {
        // Uso: criei o payment, fiz uma injeção de dependência,
        // instanciei o MercadoPago e setei o produto "Bla bla" por 990
        Payment payment = new Payment(new MercadoPago());
        payment.setProduct("Bla bla", 990);
        payment.execute();
        // se eu trocar pelo Pagseguro executar, funciona normal também
    }
}