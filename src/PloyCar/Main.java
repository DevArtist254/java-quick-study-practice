package PloyCar;

public class Main {
    public static void main(String[] args) {

        Car gas = new GasCar("gas");

        driveCar(gas);
    }

    public static void driveCar(Car car){
        car.startEngine();
        car.runEngine();
        car.drive();
    }
}
