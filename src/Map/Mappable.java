package Map;

enum Color{BLACK, BLUE, GREEN, RED};
enum PointMarkers{CIRCLE, DIAMOND, BED, PLANE, SPEAKER};
enum LineMarker{DASHED, DOTTED, SOLID}

enum Geometry{LINE, POINT, POLYGON}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    String getLabel();
    String getMarker();
    String getShape();

    default String toJSON(){
        return """
               "type": "%s", "label": "%s", "marker": "%s"
               \s""".formatted(getShape(), getLabel(), getMarker());
    }

    public static void mapIt(Mappable maps){
        System.out.println(JSON_PROPERTY.formatted(maps.toJSON()));
    }
}
