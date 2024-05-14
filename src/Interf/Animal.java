package Interf;

enum FlightStages implements Trackable {
    GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;

    @Override
    public void track(){

        if(this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStages(){

        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

record DragonFly (String name, String type) implements FlightEnabled {
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
        System.out.println("Orbit is achieved! ");
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

    private static void log(String description){

        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private static void logStage(FlightStages stage, String description) {

        description = stage + " : " + description;
        log(description);
    }

    default FlightStages transition(FlightStages stage) {

        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Begin transition " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled{

    double MILES_TO_KM = 1.604;
    double KM_TO_MILES = 0.621;

    void takeOff();
    void land();
    void fly();

    default FlightStages transition(FlightStages stages){

        FlightStages nextStage = stages.getNextStages();
        System.out.println("Transitioning from " + stages + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable{

    void track();
}

public abstract class Animal {

    public abstract void move();
}


