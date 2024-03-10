import java.util.ArrayList;

record GroceryItem(String item, String type, int count){
    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }
}
public class ArrList {
    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItem("Butter"));

        System.out.println(groceryList);

    }
}


/*
 * Action points
 *
 * 0 - to shutdown
 * 1 - to add items to a list
 * 2 - to remove any items
 *
 * Enter a number
 * */