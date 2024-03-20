package Abs;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")) {
            System.out.printf("%s walking", type);
        } else {
            System.out.printf("%s running", type);
        }
    }

    @Override
    public void makeNoise() {

        if(type == " Wolf") {
            System.out.println(" howling! ");
        } else {
            System.out.println(" woof! ");
        }
    }
}
