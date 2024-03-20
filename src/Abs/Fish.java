package Abs;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed.equals("slow")) {
            System.out.printf("%s lazily swimming", type);
        } else {
            System.out.printf("%s darting frantically", type);
        }
    }

    @Override
    public void makeNoise() {

        if (type == "Goldfish") {
            System.out.println(" swish ");
        } else {
            System.out.println(" splash ");
        }
    }
}
