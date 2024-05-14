package Polymorph.Comp;

public class Product {
    private String model;
    private int price;

    public Product(String model, int price){
        this.model = model;
        this.price = price;
    }

    public String toString(){
        return "-" +model+ ", " +price+  ";";
    }

    public int getPrice() {
        return price;
    }
}
