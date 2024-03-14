import java.util.LinkedList;

record DistanceFromSydney(String town, int distance){
    @Override
    public String toString() {
        return "town" + town + "( distance " + distance + " Kms)";
    }
}

public class DistFromSydney {
    public static void main(String[] args) {
        LinkedList<DistanceFromSydney> list = new LinkedList<>();

        list.add(new DistanceFromSydney("Sydney", 0));
        list.add(new DistanceFromSydney("Sydney", 0));
        list.add(new DistanceFromSydney("Sydney", 0));
        list.add(new DistanceFromSydney("Sydney", 0));
        list.add(new DistanceFromSydney("Sydney", 0));
        list.add(new DistanceFromSydney("Sydney", 0));

        System.out.println(list);
    }

    private static void printMenu() {
        String menu = """
                (F)orward
                (B)ackwards
                (M)enu
                (Q)uit
                """;
    }

}
