package Cls2;

public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(){};

    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(){
        System.out.println("The animal moves");
    }

    public void makeNoise(){
        System.out.println("The animal makes noise");
    }
}
