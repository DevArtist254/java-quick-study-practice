package PloyCar;

public class ElectricCar extends Car {
    private double distancePerEnergy;
    private int batterySize;

    public ElectricCar(String type){
        super(type);
        this.batterySize = 3000;
        this.distancePerEnergy = 400;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("Your "+ super.getClass().getSimpleName() +" car can do " + this.distancePerEnergy + " km with a battery size" + this.batterySize + " watts");
    }
}
