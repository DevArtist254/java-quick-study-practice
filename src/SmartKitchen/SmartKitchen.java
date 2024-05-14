package SmartKitchen;

public class SmartKitchen {
    private final Refrigerator iceBox;
    private final DishWasher dishWasher;
    private final CoffeeMaker brewMaster;

    public SmartKitchen() {
        this.dishWasher = new DishWasher(false);
        this.brewMaster = new CoffeeMaker( false);
        this.iceBox = new Refrigerator( false);
    }

    public void addWater(){
        brewMaster.brewCoffee();
    }

    public void pourMilk(){
        iceBox.orderFood();
    }

    public void loadDishes(){
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean coffee, boolean ice, boolean dish){

        brewMaster.setHasWorkToDo(coffee);
        iceBox.setHasWorkToDo(ice);
        dishWasher.setHasWorkToDo(dish);

    }

    public void doKitchenWork(){

        addWater();
        pourMilk();
        loadDishes();

    }
}
