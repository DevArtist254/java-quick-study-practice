package intJDK2;

public class Test {
    public static void main(String[] args) {
        //inFlight(new Jet());
        orbit(new Satellite());
    }

    public static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();

        if (flier instanceof Trackable tracked) {
            tracked.track();
        }

        flier.land();
    }

    public static void orbit(OrbitEarth flier) {

        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
