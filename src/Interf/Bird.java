package Interf;

public class Bird extends Animal implements FlightEnabled, Trackable {


    @Override
    public void move() {
        printInfo(" flaps its wings");
    }

    @Override
    public void takeOff() {
        printInfo(" is taking off");
    }

    @Override
    public void land() {
        printInfo(" is landing");
    }

    @Override
    public void fly() {
        printInfo(" is flying");
    }

    @Override
    public void track() {
        printInfo("'s are being recorded");
    }

    public void printInfo(String info){
        System.out.println(getClass().getSimpleName() + info );
    }
}
