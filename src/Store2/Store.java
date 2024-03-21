package Store2;

import java.util.ArrayList;

record OrderItem(int qty, ProductSale products) {}
public class Store {

    public static ArrayList<ProductSale> productList = new ArrayList<>();
    public static void main(String[] args) {
        productList.add(new TShirtProducts("shirt", 400, "Yellow shirt"));
        productList.add(new TShirtProducts("shirt", 400, "Red shirt"));
        productList.add(new TShirtProducts("shirt", 400, "Blue shirt"));

        listProducts();

        System.out.println("\n Order 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 0, 5);
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 2, 8);
        printOrder(order1);
    }

    public static void listProducts() {

        for(var item : productList) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, productList.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for(var item : order) {
            item.products().printItemPrice(item.qty());
            salesTotal += item.products().getSalesPrice(item.qty());
        }

        System.out.printf("Sales total = $%6.2f, %n", salesTotal);
    }
}
