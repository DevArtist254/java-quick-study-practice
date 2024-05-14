package Absstract;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight){
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    public final String getType(){
        return getClass().getSimpleName() + " { " + type + " } ";
    }
}


abstract class Mammal extends Animal {

    public Mammal (String type, String size, double weight){super(type, size, weight);}

    @Override
    public void move(String speed){

        System.out.println(getType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}