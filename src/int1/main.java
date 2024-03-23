package int1;

public class main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;

        bird.move();
        bird.fly();
        bird.track();
        bird.land();
        bird.takeOff();
    }
}
