package Store2;

public class TShirtProducts extends ProductSale{
    public TShirtProducts(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + type + "Description: " + description + "Price: " + price);
    }
}
