package PloyCar;

public class HybridCar extends Car{
    private double distancePerEnergy;
    private int batterySize;
    private int cylinderSize;

    public HybridCar(String type){
        super(type);
        this.batterySize = 2500;
        this.distancePerEnergy = 600;
        this.cylinderSize = 12;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("Your "+ super.getClass().getSimpleName() +" car can do " + this.distancePerEnergy + " km with a battery size" + this.batterySize + " watts");
    }

    @Override
    protected void runEngine() {
        System.out.println("All your " + this.cylinderSize + " engine cylinders are running");
    }
}
