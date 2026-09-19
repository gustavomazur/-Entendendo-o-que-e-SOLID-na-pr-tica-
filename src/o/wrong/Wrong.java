package o.wrong;

// Contrato que qualquer transporte deve seguir
interface ITransport {
    String getType();
    double getVolume();
    double getDistance();
    double getPrice();
    double getTimeEstimate();
}

/**
 * Classe de transporte com tipo, volume e distância.
 * Recebe essas informações pelo construtor.
 */
class Transport implements ITransport {
    private String type;
    private double volume;
    private double distance;

    // Construtor passando as informações
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

    // Calcula o preço conforme o tipo (avião é o padrão caso não mande nenhum)
    @Override
    public double getPrice() {
        switch (this.type) {
            case "Truck":
                return this.volume * 80;
            case "Plane":
            default:
                return this.volume * 125;
            case "Ship":
                return this.volume * 50;
            // Nave espacial adicionada depois, modificando o código existente
            case "Spaceship":
                return this.volume * 9000;
        }
    }

    // Calcula a estimativa de tempo: distância dividida pelo divisor de cada tipo
    @Override
    public double getTimeEstimate() {
        switch (this.type) {
            case "Truck":
                return this.distance / 100;
            case "Plane":
                return this.distance / 800;
            case "Ship":
            default:
                return this.distance / 30;
            case "Spaceship":
                return this.distance / 9000;
        }
    }
}

// Classe Principal para Teste
public class Wrong {
    public static void main(String[] args) {
        // Objeto pkg contendo as informações do pacote
        double pkgVolume = 10;
        double pkgDistance = 140;

        // Instanciação do transporte passando o tipo
        Transport transportItem = new Transport("Spaceship", pkgVolume, pkgDistance);

        // Impressão dos resultados
        System.out.println("Preço: R$ " + transportItem.getPrice());
        System.out.println("Estimativa: " + transportItem.getTimeEstimate() + " horas.");
    }
}