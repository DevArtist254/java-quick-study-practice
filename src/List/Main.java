package List;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toLowerCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "produce", 2);
        groceryArray[2] = new GroceryItem("oranges", "produce", 3);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objList = new ArrayList();
        objList.add(new GroceryItem("Butter"));
        objList.add("Yogurt");

        System.out.println(objList);

        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Butter"));
        groceryItems.add(new GroceryItem("milk"));
        groceryItems.add(new GroceryItem("oranges", "produce", 3));
        groceryItems.set(0, new GroceryItem("apples", "produce", 2));

        System.out.println(groceryItems);
    }
}
