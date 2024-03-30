package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class More {
    public static void main(String[] args) {

        //Unknown Array
        String[] items = {"apples", "bananas", "milk", "eggs"};

        //Converting from an array to a list
        List<String> list = List.of(items);
        System.out.println(list);

        //list to arrayList
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");

        System.out.println(groceries);

        var newList = List.of("pickles", "mustard", "cheese");

        ArrayList<String> nextList = new ArrayList<>(newList);

        //Insertion
        groceries.addAll(newList);

        System.out.println(groceries);

        //iteration
        System.out.println("Third item = " + groceries.get(2));

        //Search
        if(groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        //Insertion
        groceries.add("yogurt");

        //Search
        System.out.println("First = " + groceries.indexOf("yogurt"));
        System.out.println("Last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);

        //Deletion - bananas
        groceries.remove(1);

        System.out.println(groceries);

        //Deletion - first yogurt found
        groceries.remove("yogurt");

        System.out.println(groceries);

        //Deletion of collection
        groceries.removeAll(List.of("apples", "eggs"));

        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));

        System.out.println(groceries);

        //Complete deletion
        groceries.clear();

        System.out.println(groceries);

        //Check of
        System.out.println("isEmpty = " + groceries.isEmpty());

        //insertion
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);

        //Sorting
        groceries.sort(Comparator.naturalOrder());

        System.out.println(groceries);

        //Reverse sorting
        groceries.sort(Comparator.reverseOrder());

        System.out.println(groceries);

        //Conversion to an array then with the size in mind
        var groceryArr = groceries.toArray(new String[groceries.size()]);

        System.out.println(Arrays.toString(groceryArr));
    }

}
