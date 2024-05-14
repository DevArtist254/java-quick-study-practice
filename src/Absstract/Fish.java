package Absstract;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(getType() + " lazily swims");
        } else {
            System.out.println(getType() + " darts very fast");
        }

    }

    @Override
    public void makeNoise() {
        if(type.equals("goldfish")){
            System.out.println("swish ");
        } else {
            System.out.println("splash ");
        }
    }
}
