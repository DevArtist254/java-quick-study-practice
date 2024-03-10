import java.util.LinkedList;
import java.util.Scanner;

record distFromSydney(String town, int distance){

}
public class lList {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<distFromSydney> listDist = new LinkedList<>();

        listDist.add(new distFromSydney("Sydney", 0));
        listDist.add(new distFromSydney("Adelaide", 1374));
        listDist.add(new distFromSydney("Alice Springs", 2771));
        listDist.add(new distFromSydney("Brisbane", 971));
        listDist.add(new distFromSydney("Darwin", 3972));
        listDist.add(new distFromSydney("Melbourne", 877));
        listDist.add(new distFromSydney("Perth", 3923));

        boolean flag = true;

        while (flag){
            printActions();
            switch (scanner.nextLine()){
                case "F" -> printDistForwards(listDist);
                case "B" -> printDistBackwards(listDist);
                case "L" -> System.out.println(listDist);
                default -> flag = false;
            }
        }
    }

    private static void printActions(){

        String act = """
                Available actions (Select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;

        System.out.println(act + " ");
    }

    private static void printDistForwards(LinkedList<distFromSydney> linkedList){

    }

    private static void printDistBackwards(LinkedList<distFromSydney> linkedList){

    }
}
