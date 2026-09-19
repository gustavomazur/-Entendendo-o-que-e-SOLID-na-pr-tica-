package i.right;

/**
 * Interface Vehicle (a base).
 * O que é comum a todo veículo: a função de calcular o combustível.
 */
interface Vehicle {
    boolean isFuelEnough(double fuel);
}

/**
 * Interface AutomotiveVehicle.
 * Vehicle automotivo: tem rodas e tipo de direção.
 */
interface AutomotiveVehicle extends Vehicle {
    int getWheels();
    String getWheelType();
}

/**
 * Interface AerialVehicle.
 * Vehicle aéreo: tem quantidade de pilotos.
 */
interface AerialVehicle extends Vehicle {
    int getPilotAmount();
}

/**
 * Classe Car.
 * Implementa AutomotiveVehicle, que herda de Vehicle.
 */
class Car implements AutomotiveVehicle {
    public int wheels;
    public String wheelType;

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

    @Override
    public boolean isFuelEnough(double fuel) {
        return fuel > 5;
    }
}

/**
 * Classe Helichopter.
 * Implementa AerialVehicle, que herda de Vehicle.
 */
class Helichopter implements AerialVehicle {
    public int pilotAmount;

    public Helichopter(int pilotAmount) {
        this.pilotAmount = pilotAmount;
    }

    @Override
    public int getPilotAmount() {
        return this.pilotAmount;
    }

    @Override
    public boolean isFuelEnough(double fuel) {
        return fuel > 20;
    }
}

/**
 * Classe principal com a lógica de uso.
 *
 * Agora o helicóptero não é mais obrigado a ter rodas e tipo de direção:
 * cada veículo implementa só a parte que precisa.
 */
public class Right {
    public static void main(String[] args) {
        // Uso
        Car fiatUno = new Car(4, "hydraulic");
        System.out.println(fiatUno.isFuelEnough(100)); // true
        System.out.println(fiatUno.isFuelEnough(3));   // false

        Helichopter heliBolado = new Helichopter(2);
        System.out.println(heliBolado.isFuelEnough(100)); // true
        System.out.println(heliBolado.isFuelEnough(15));  // false
    }
}