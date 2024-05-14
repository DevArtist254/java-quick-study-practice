package PloyCar;

public class Car {
    private String type;

    public Car(String type) {
        this.type = type;
    }

    public void startEngine(){
        System.out.println("Your " + type + " car's engine has start");
    }

    public void drive(){}

    protected void runEngine() {
        System.out.println("Your " + type + " engine is running");
    }
}
