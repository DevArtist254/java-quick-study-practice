package Map;

public class Main {
    public static void main(String[] args) {
        var airport = new Buliding("Nairobi Int.", UsageType.AIRPORT);
        var mbs = new UtilityLine("MOMBASA ROAD", UtilityType.ROADS);

        Mappable.mapIt(mbs);
        Mappable.mapIt(airport);
    }
}
