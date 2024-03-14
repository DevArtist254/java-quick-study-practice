import java.util.LinkedList;
import java.util.Scanner;

record distFromSydney(String town, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", town, distance);
    }
}
public class lList {

    public static void main(String[] args) {
        LinkedList<distFromSydney> listDist = new LinkedList<>();

        addPlace(listDist, new distFromSydney("Sydney", 0));
        addPlace(listDist,new distFromSydney("Adelaide", 1374));
        addPlace(listDist,new distFromSydney("Alice Springs", 2771));
        addPlace(listDist,new distFromSydney("Brisbane", 971));
        addPlace(listDist,new distFromSydney("Darwin", 3972));
        addPlace(listDist,new distFromSydney("Melbourne", 877));
        addPlace(listDist,new distFromSydney("Perth", 3923));

        var iterator = listDist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean forward = true;
        boolean quitloop = false;

        while (!quitloop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : " + iterator.next());
                forward = false;
            }
            printActions();
            switch (scanner.nextLine()){
                case "F" :
                    System.out.println("User wants to go forward");
                    if (!forward){
                        forward = true;
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    break;
                case "B" :
                    System.out.println("User wants to go backwards");
                    if (forward){
                        forward = false;
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L" :

                    break;
                default :
                        quitloop = true;
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

    private static void addPlace(LinkedList<distFromSydney> listDist, distFromSydney distFromSydney){

        if(listDist.contains(distFromSydney)) {
            System.out.println("Found duplicate: " + distFromSydney);
            return;
        }

        for(distFromSydney d : listDist) {
            if (d.town().equalsIgnoreCase(distFromSydney.town())){
                System.out.println("Found duplicate: " + listDist);
                return;
            }
        }

        int matchedIndex = 0;
        for (var places: listDist){
            if (distFromSydney.distance() < places.distance()) {
                listDist.add(matchedIndex, distFromSydney);
                return;
            }

            matchedIndex++;
        }

        listDist.add(distFromSydney);
    }

}
