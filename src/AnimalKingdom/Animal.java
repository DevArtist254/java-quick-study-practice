package AnimalKingdom;

public class Animal {
    protected int size;
    protected int weight;
    protected String type;

    public Animal(String type, int size, int weight){
        this.size = size;
        this.weight = weight;
        this.type = type;
    }

    public Animal(){}

    @Override
    public String toString(){
        return "Animal {\n" +
                "type:" + type + ",\n" +
                "weight:" + weight + ",\n" +
                "size:" + size +
                "}";
    }

    public void move(String speed){
        System.out.println(type + "moves at:" + speed);
    }

    public void makesNoise(){
        System.out.println(type + "makes noise");
    }
}
