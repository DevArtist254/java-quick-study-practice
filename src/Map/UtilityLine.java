package Map;

enum UtilityType{ELECTRICAL, FIBER_OPTIC, ROADS, RIVERS}

public record UtilityLine(String name, UtilityType type) implements Mappable {
    @Override
    public String getLabel() {
        return name +"("+ type +")";
    }

    @Override
    public String getMarker() {
        return Geometry.LINE + "";
    }

    @Override
    public String getShape() {
        return switch (type){
            case ROADS -> Color.BLACK + " " + LineMarker.SOLID;
            case ELECTRICAL -> Color.BLUE + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.BLUE + " " + LineMarker.SOLID;
            case RIVERS -> Color.GREEN + " " + LineMarker.SOLID;
            default -> Color.RED + " Undefined";
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON()+ """
                "name": "%s", "usage": "%s"
                \s""".formatted(name, type);
    }
}
