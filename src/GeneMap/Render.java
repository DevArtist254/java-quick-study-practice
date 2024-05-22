package GeneMap;

public interface Render {
    String name();
    String type();
    String locations();

    default String render(){
        return """ 
                %s as %s ([%s])""".formatted(name(), type(), locations());
    };
}
