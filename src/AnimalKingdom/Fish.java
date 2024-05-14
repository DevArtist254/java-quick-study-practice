package AnimalKingdom;

public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(int gills, int fins, String type, int size, int weight){
        super(type, size, weight);
        this.gills = gills;
        this.fins = fins;
    }

    @Override
    public String toString(){
        return "fish {\n"+
                "gills: " + gills + ",\n" +
                "fins: " + fins + ",\n" +
                "}" + super.toString();
    }

    public void moveMuscles(){ System.out.println("Moves muscles"); }

    public void moveFins(){ System.out.println("Moves fins"); }

    @Override
    public void move(String speed){
        super.move(speed);
        moveMuscles();

        if(speed == "fast"){
            moveFins();
        }

        System.out.println();
    }
}
