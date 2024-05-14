package Absstract;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getType() + " shed their hair");
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(getType() + " walks");
        } else {
            System.out.println(getType() + " runs");
        }

    }

    @Override
    public void makeNoise() {
        if(type.equals("Wolf")){
            System.out.println(" howling");
        } else {
            System.out.println(" woof woof");
        }
    }
}
