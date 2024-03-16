import java.util.LinkedList;
import java.util.Scanner;

record DistanceFromSydney(String town, int distance){
    @Override
    public String toString() {
        return "town" + town + "( distance " + distance + " Kms)";
    }
}

public class DistFromSydney {
    public static void main(String[] args) {
        LinkedList<DistanceFromSydney> list = new LinkedList<>();

        addPlace(list, new DistanceFromSydney("Sydney", 0));
        addPlace(list, new DistanceFromSydney("adelaide", 1374));
        addPlace(list, new DistanceFromSydney("brisbane", 917));
        addPlace(list, new DistanceFromSydney("perth", 3923));
        addPlace(list, new DistanceFromSydney("alice springs", 2771));
        addPlace(list, new DistanceFromSydney("darwin", 3972));
        addPlace(list, new DistanceFromSydney("melbourne", 877));
        addPlace(list, new DistanceFromSydney("adelaide", 1374));

        var iterator = list.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean forward = true;
        boolean quitloop = false;

        while (!quitloop) {
            printMenu();
            if(!iterator.hasNext()){
                forward = false;
                System.out.println("Final" + iterator.next());
            }
            if(!iterator.hasPrevious()){
                forward = true;
                System.out.println("Begin " + iterator.next());
            }
            switch (scanner.nextLine()){
                case "F":
                    System.out.println(iterator.next());
//                    if(iterator.hasNext()){
//                        forward = true;
//                        System.out.println(iterator.next());
//                        }
                    break;
                case "B":
                    System.out.println(iterator.previous());
//                    if (iterator.hasPrevious()){
//                        forward = false;
//                        iterator.previous();
//                    }
                case "M":
                    System.out.println("Menu");
                    break;
                case "Q":
                default:
                    quitloop = true;
            }
        }


    }

    private static void printMenu() {
        String menu = """
                (F)orward
                (B)ackwards
                (M)enu
                (Q)uit
                """;

        System.out.println(menu + " ");
    }

    private static void addPlace(LinkedList<DistanceFromSydney> list, DistanceFromSydney place) {

        int count = 0;

        for (var p : list) {

            if(place.distance() < p.distance()){
                list.add(count , place);
                return;
            }

            count++;
        }

        list.add(place);
    }
}
