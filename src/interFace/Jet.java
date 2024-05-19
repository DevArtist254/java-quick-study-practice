package interFace;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " ");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " ");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " ");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " ");
    }

}
