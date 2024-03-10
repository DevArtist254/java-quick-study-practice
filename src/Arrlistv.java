import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Arrlistv {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printActions();
            //Does not have problem fall through
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }

            //Sort
            groceries.sort(Comparator.naturalOrder());

            System.out.println(groceries);
        }
    }

    private static void addItems (ArrayList<String> groceries) {
        System.out.println("Add items(s) [separate items by comma]");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for(String i : items){
            i = i.trim();
            if (!groceries.contains(i)){
                groceries.add(i);
            }
        }
    }

    private static void removeItems (ArrayList<String> groceries) {
        System.out.println("Add items(s) [separate items by comma]");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for(String i : items){
            i = i.trim();
            if (!groceries.contains(i)){
                groceries.remove(i);
            }
        }
    }
    private static void printActions (){
        String textBlock = """
                 Action points
                 
                 0 - to shutdown
                 1 - to add items to a list
                 2 - to remove any items
                 Enter a number
                """;

        System.out.println(textBlock + " ");
    }
}
