package intJDK;

enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;



    public FlightStages getNextStage() {

        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }

    @Override
    public void track() {

        if(this != GROUNDED) {
          System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly (String name, String type) implements FlightEnabled{
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeOff();
    void land();
    void fly();

    default FlightStages transition(FlightStages stages) {

        FlightStages nextStage = stages.getNextStage();
        System.out.println("Transitioning from " + stages + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
