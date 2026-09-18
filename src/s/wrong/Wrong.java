package s.wrong;

/**
 * Define o contrato que qualquer Carro deve seguir:
 * expõe modelo e quilometragem e sabe se mover por uma distância.
 */
interface ICar {
    String getModelo();
    double getKm();
    void move(double kmLength);
    void logMovement(double kmLength);
}

/**
 * Carro com modelo e quilometragem acumulada.
 * Ao mover, atualiza a quilometragem e registra o movimento.
 */
class Car implements ICar {
    private String modelo;
    private double km;

    /**
     * Ao iniciar a classe, recebe e salva o modelo do carro e a quilometragem atual.
     */
    public Car(String modelo, double km) {
        this.modelo = modelo;
        this.km = km;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getKm() {
        return this.km;
    }

    /**
     * Move o carro pela quilometragem informada, somando-a à km total.
     * Ex.: se o carro tinha 20.000 km e rodar 25 km, passa a ter 20.025 km.
     */
    @Override
    public void move(double kmLength) {
        this.km += kmLength;
        this.logMovement(kmLength);
    }

    /**
     * Registra no console o movimento que acabou de acontecer.
     */
    @Override
    public void logMovement(double kmLength) {
        System.out.println("O carro " + this.modelo + " andou " + kmLength);
    }
}

// Classe principal para execução do programa
public class Wrong {
    public static void main(String[] args) {
        Car fiatUno = new Car("Fiat Uno", 20000);
        fiatUno.move(25);
    }
}