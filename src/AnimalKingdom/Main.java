package AnimalKingdom;

public class Main {
    public static void main(String[] args) {

        var animal = new Animal("Generic Animal", 30, 400);
        doAnimalStuff(animal, "500 km/h");

        Dog dog = new Dog();
        doAnimalStuff(dog, "10 km/h");

        Fish goldie = new Fish(15, 10, "goldie", 10, 5);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
