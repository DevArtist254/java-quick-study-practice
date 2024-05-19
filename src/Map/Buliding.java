package Map;

enum UsageType{BUSINESS, ENTERTAINMENT, HOTEL, RESIDENTIAL, AIRPORT, GOVT}

public record Buliding(String name, UsageType type) implements Mappable {
    @Override
    public String getLabel() {
        return name + "("+ type +")";
    }

    @Override
    public String getMarker() {
        return switch (type){
            case GOVT -> PointMarkers.CIRCLE + " " + Color.RED;
            case HOTEL -> PointMarkers.BED + " " + Color.BLUE;
            case BUSINESS -> PointMarkers.DIAMOND + " " + Color.GREEN;
            case AIRPORT -> PointMarkers.PLANE + " " + Color.GREEN;
            case RESIDENTIAL -> PointMarkers.CIRCLE + " " + Color.BLUE;
            case ENTERTAINMENT -> PointMarkers.SPEAKER + " " + Color.GREEN;
            default -> PointMarkers.CIRCLE + " undefined";
        };
    }

    @Override
    public String getShape() {
        return Geometry.POINT + "";
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                "name" : "%s", "usage" : "%s" 
                """.formatted(name, type);
    }
}
