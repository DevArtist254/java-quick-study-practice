package AnimalKingdom;

public class Dog extends Animal {
    private String earShaped;
    private String tailType;

    //defaults
    public Dog(){
        super("Matt", 50, 250);
    }


    //Std
    public Dog(String earShaped, String tailType, String type, int size, int weight){
        super(type, size, weight);
        this.earShaped = earShaped;
        this.tailType = tailType;
    }

    @Override
    public String toString(){
        return "Dog{" +
                "earShaped:" + earShaped + "\n," +
                "tailType:" + tailType + "\n," +
                super.toString() +
                "}";

    }

    @Override
    public void move(String speed){
        super.move(speed);
        System.out.println("Dogs run");
    }

    public void makesNoise(){

    }
}
