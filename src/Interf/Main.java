package Interf;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;

        FlightEnabled flier = bird;
        Trackable trackedBird = bird;

        inFlight(new Jet());
    }

    public static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable truck){
            truck.track();
        }
        flier.land();
    }
}
