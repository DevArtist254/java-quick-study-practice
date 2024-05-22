package GeneMap;

public class Point implements Render{
    private String name;
    private String type;
    private double[] locations;

    public Point(String name, String type){
        this.name = name;
        this.type = type;
        this.locations = new double[2];
    }

    public String name(){
        return this.name;
    }

    public String type(){
        return this.type.toUpperCase();
    }

    public double[] setLocations(double lat, double lon){
        this.locations[0] = lat;
        this.locations[1] = lon;

        return this.locations;
    }

    public String locations(){
        return """
                %f %f""".formatted(this.locations[0], this.locations[1]);
    }

    @Override
    public String render() {
        return Render.super.render();
    }
}
