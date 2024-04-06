package GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> groceryList = new ArrayList<>();
    public static void main(String[] args) {

        boolean init = true;
        Scanner sc = new Scanner(System.in);

        while (init) {

            printMenu();

            switch (Integer.parseInt(sc.nextLine())){
                case 0:
                    init = false;
                    break;
                case 1:
                    var item = sc.nextLine();
                    groceryList.add(item);
                    break;
                case 2:
                    var itemR = sc.nextLine();
                    groceryList.remove(itemR);
                    break;
                case 3:
                    System.out.println(groceryList);
                    break;
                default:
                    System.out.println("");
                    break;
            }

        }

    }

    private static void printMenu() {
        String menu = """
                Available actions
                0: shutdown,
                1: to add items
                2: to remove item
                3: print list of items
                Enter a number for for the action
                """;

        System.out.println(menu);
    }
}
