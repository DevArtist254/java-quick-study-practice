package SmartKitchen;

public class Main {
    public static void main(String[] args) {
        SmartKitchen sk = new SmartKitchen();

        sk.setKitchenState(true, true, true);

        sk.doKitchenWork();
    }
}
