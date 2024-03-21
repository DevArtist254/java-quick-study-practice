package Store2;

public abstract class ProductSale {
    protected String type;
    protected int price;
    protected String description;

    public ProductSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    protected void printItemPrice(int qty){
        System.out.printf("The price for item %s: %d$ at quantity %d %n", this.type, getSalesPrice(qty), qty);
    }

    protected int getSalesPrice(int qty) {
        return qty * price;
    }

    public abstract void showDetails();
}
