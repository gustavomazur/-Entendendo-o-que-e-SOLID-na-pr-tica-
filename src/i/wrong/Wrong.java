package i.wrong;

/**
 * Interface Vehicle (a principal).
 * Uma interface criada pra veículo, pra veículo geral.
 * Todo veículo tem que ter rodas e tipo de direção.
 */
interface Vehicle {
    // rodas
    int getWheels();

    // tipo de direção
    String getWheelType();

    // função que manda a quantidade de combustível
    boolean isFuelEnough(double fuel);
}

/**
 * Classe Car.
 * Criei o carro implementando a interface Vehicle.
 * Pega a quantidade de rodas e o tipo de roda.
 */
class Car implements Vehicle {
    public int wheels; // quantidade de rodas
    public String wheelType; // tipo de roda

    public Car(int wheels, String wheelType) {
        this.wheels = wheels;
        this.wheelType = wheelType;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public String getWheelType() {
        return this.wheelType;
    }

    /**
     * Se o combustível for maior que 5 tá de boa, pode andar.
     * Se for menor que 5 não pode andar, vai ficar a pé.
     */
    @Override
    public boolean isFuelEnough(double fuel) {
        return fuel > 5;
    }
}

/**
 * Classe Helichopter.
 * Criei o veículo helicóptero e resolvi implementar Vehicle,
 * afinal o heli é um veículo. Mas aí tem um problema:
 * Vehicle tem rodas e tem tipo de direção.
 *
 * Como estou implementando a interface Vehicle, vou ser obrigado a
 * colocar número de rodas e tipo de direção, se nem usar rodas
 * vou ter que colocar. Aqui vou ter que colocar números falsos né,
 * fictícios, ou colocar os que não vou usar de opcional.
 */
class Helichopter implements Vehicle {
    public int wheels; // rodas
    public String wheelType; // tipo de direção
    public int pilotNumber; // adiciono a quantidade de piloto, que é a propriedade do helicóptero

    // mais como estou implementando a interface Vehicle vou ser obrigado
    // a colocar número de rodas e tipo de direção, se nem usar vou ter que colocar
    public Helichopter(int wheels, String wheelType, int pilotNumber) {
        this.wheels = wheels;
        this.wheelType = wheelType;
        this.pilotNumber = pilotNumber;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public String getWheelType() {
        return this.wheelType;
    }

    @Override
    public boolean isFuelEnough(double fuel) {
        return fuel > 20;
    }
}

/**
 * Classe principal com a lógica de uso.
 *
 * O problema: o helicóptero é obrigado a ter rodas e tipo de direção
 * por causa da interface Vehicle abrangente, então coloquei valores
 * fictícios (4 rodas e direção vazia) pro código funcionar.
 */
public class Wrong {
    public static void main(String[] args) {
        // Uso: crio um carro novo, o fiatUno, com 4 pneus e direção hydraulic
        // seriam as propriedades do carro
        Car fiatUno = new Car(4, "hydraulic");
        // aqui estou executando a quantidade de combustível, que vai dizer
        // se esse combustível é suficiente ou não
        System.out.println(fiatUno.isFuelEnough(100)); // true
        // se eu colocar 3 é falso, não tem combustível suficiente
        System.out.println(fiatUno.isFuelEnough(3));   // false

        // no helicóptero tive que colocar 4 rodas, e o heli não tem direção nenhuma
        // esse 2 é a quantidade de piloto que tem no heli, coloquei valor fictício
        Helichopter heliBolado = new Helichopter(4, "", 2);
        System.out.println(heliBolado.isFuelEnough(100)); // true
        System.out.println(heliBolado.isFuelEnough(15));  // false
    }
}