package Maps;

enum Type{
    BUSINESS,
    ENTERTAINMENT
}

public record Building(String name, Type buildingType) implements Mappable{
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
