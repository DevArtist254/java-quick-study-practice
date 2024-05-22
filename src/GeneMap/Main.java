package GeneMap;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point("Yellowstone", "Nation Park");
        Point p2 = new Point("Grand Canyon", "Nation Park");
        Point p3 = new Point("Yosemite", "Nation Park");

        p1.setLocations(44.54, -110.23);
        p2.setLocations(36.06, -112.07);
        p3.setLocations(37.89, -119.54);

        Layer L = new Layer();

        L.addElements(p1);
        L.addElements(p2);
        L.addElements(p3);

        L.printPoints();
    }
}