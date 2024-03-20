package Store;

import java.util.ArrayList;

record OrderedItem (int qty, ProductForSale product) {}
public class Store {
    private static ArrayList<ProductForSale> listOfProducts = new ArrayList<>();

    public static void main(String[] args) {
        listOfProducts.add(new ArtObject("Oil painting", 1350, "Impression work by ABF painted in 2010"));
        listOfProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        listProducts();

        var order1 = new ArrayList<OrderedItem>();
        addItemToOrder(order1, 1, 2);

        printOrder(order1);
    }
    public static void listProducts() {

        for(var item : listOfProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderedItem> order, int orderIndex, int qty) {
        order.add(new OrderedItem(qty, listOfProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderedItem> order){

        double salesTotal = 0;

        for(var item : order) {
            item.product().printPriceItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }

        System.out.printf("Sales total = $%6.2f %n",salesTotal);
    }
}
