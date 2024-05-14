package PloyCar;

public class GasCar extends Car {
    private double distancePerEnergy;
    private int cylinderSize;

    public GasCar(String description) {
        super(description);
        this.cylinderSize = 12;
        this.distancePerEnergy = 500;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("Your "+ super.getClass().getSimpleName() +" car can do " + this.distancePerEnergy + " km ");
    }

    @Override
    protected void runEngine() {
        System.out.println("All your " + this.cylinderSize + " engine cylinders are running");
    }
}
