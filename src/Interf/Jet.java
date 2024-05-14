package Interf;

public class Jet implements FlightEnabled, Trackable{

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

    public FlightStages transition(FlightStages stages){
        printInfo(" transitioning");
        return FlightEnabled.super.transition(stages);
    }

    public void printInfo(String info){
        System.out.println(getClass().getSimpleName() + info );
    }
}
