package Absstract;

public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        super.move(speed);
    }

    @Override
    public void shedHair() {

    }

    @Override
    public void makeNoise() {

    }
}
