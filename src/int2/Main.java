package int2;

public class Main {
    public static void main(String[] args) {
        var bird = new Bird();
        FlightEnabled flier = bird;


        bird.move();
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();

        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;

        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);
    }

    public static void inFlight(FlightEnabled bird) {

        bird.takeOff();
        bird.fly();

        if(bird instanceof Trackable trackable){
            trackable.track();
        }

        bird.land();
    }
}
