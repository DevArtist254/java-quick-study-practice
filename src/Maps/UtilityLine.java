package Maps;

enum UtilType {
    ELECTRICAL,
    FIBER_OPTIC
}

public record UtilityLine(String name, UtilType type) implements Mappable {

    @Override
    public String toJSON() {
        return "";
    }

    @Override
    public String getLabel() {
        return "";
    }

    @Override
    public String getMarker() {
        return "";
    }

    @Override
    public String getShape() {
        return "";
    }
}
