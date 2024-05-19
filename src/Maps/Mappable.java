package Maps;

enum Geometry {
    LINE,POINT,POLYGON;
}

public interface Mappable {

   String JSON_PROPERTY = "property: ";

    static void mapit(Mappable mappable) {

    }

    String toJSON();

    String getLabel();

    String getMarker();

    String getShape();

}
