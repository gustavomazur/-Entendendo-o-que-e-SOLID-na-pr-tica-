package s.right;

// Interface ICar
interface ICar {
    String getModel();
    double getKm();
    void move(double kmLength);
}

// Classe que implementa ICar
class Car implements ICar {
    private String model;
    private double km;

    public Car(String model, double km) {
        this.model = model;
        this.km = km;
    }

    public String getModel() {
        return this.model;
    }

    public double getKm() {
        return this.km;
    }

    @Override
    public void move(double kmLength) {
        this.km += kmLength;
        // Delega a responsabilidade de log para a classe Logger
        Logger.log("o carro " + this.model + " andou " + kmLength + "km...");
    }
}

// Classe utilitária Logger com método estático
class Logger {
    public static void log(String message) {
        System.out.println(message);
    }
}

// Classe Principal para testar o Uso
public class Right {
    public static void main(String[] args) {
        // Uso
        Car fiatUno = new Car("Fiat Uno", 20000);
        fiatUno.move(25);
    }
}