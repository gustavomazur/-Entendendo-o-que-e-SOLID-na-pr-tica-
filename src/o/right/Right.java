package o.right;

// Contrato que qualquer transporte deve seguir
interface ITransport {
    String getType();
    double getVolume();
    double getDistance();
    double getPrice();
    double getTimeEstimate();
}

/**
 * Classe base agnóstica: não se importa com o tipo de transporte usado.
 * Cada subclasse só define seu multiplicador de volume e divisor de distância.
 */
class Transport implements ITransport {
    private String type;
    private double volume;
    private double distance;

    public Transport(String type, double volume, double distance) {
        this.type = type;
        this.volume = volume;
        this.distance = distance;
    }

    public String getType() {
        return this.type;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getDistance() {
        return this.distance;
    }

    // Métodos que serão sobrescritos pelas subclasses
    public double getVolumeMultiplier() {
        return 1;
    }

    public double getDistanceDivisor() {
        return 1;
    }

    // Preço = volume x multiplicador de volume
    @Override
    public double getPrice() {
        return this.volume * this.getVolumeMultiplier();
    }

    // Tempo = distância / divisor de distância
    @Override
    public double getTimeEstimate() {
        return this.distance / this.getDistanceDivisor();
    }
}

// Nova classe: só estendi e coloquei o multiplicador e o divisor da nave espacial
class TransportBySpacechip extends Transport {
    public TransportBySpacechip(double volume, double distance) {
        super("Spaceship", volume, distance);
    }

    @Override
    public double getVolumeMultiplier() {
        return 9000;
    }

    @Override
    public double getDistanceDivisor() {
        return 9000;
    }
}

// Subclasse para Avião
class TransportByPlane extends Transport {
    public TransportByPlane(double volume, double distance) {
        super("Plane", volume, distance);
    }

    @Override
    public double getVolumeMultiplier() {
        return 125;
    }

    @Override
    public double getDistanceDivisor() {
        return 800;
    }
}

// Subclasse para Navio
class TransportByShip extends Transport {
    public TransportByShip(double volume, double distance) {
        super("Ship", volume, distance);
    }

    @Override
    public double getVolumeMultiplier() {
        return 50;
    }

    @Override
    public double getDistanceDivisor() {
        return 30;
    }
}

// Subclasse para Camião
class TransportByTruck extends Transport {
    public TransportByTruck(double volume, double distance) {
        super("Truck", volume, distance);
    }

    @Override
    public double getVolumeMultiplier() {
        return 80;
    }

    @Override
    public double getDistanceDivisor() {
        return 100;
    }
}

// Classe Principal para Teste
public class Right {
    public static void main(String[] args) {
        double pkgVolume = 10;
        double pkgDistance = 140;

        // Uso: só troco o tipo de transporte e funciona do mesmo jeito
        ITransport transportItem = new TransportBySpacechip(pkgVolume, pkgDistance);

        // Me dá um preço
        System.out.println("Preço: R$ " + transportItem.getPrice());
        // E o tempo que vai demorar
        System.out.println("Estimativa: " + transportItem.getTimeEstimate() + " horas.");
    }
}