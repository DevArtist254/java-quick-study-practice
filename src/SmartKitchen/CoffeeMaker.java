package SmartKitchen;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        hasWorkToDo = true;
        System.out.println("Brew out coffee");
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        if(hasWorkToDo){
            System.out.println("The brew master is ready for work");
        } else {
            System.out.println("The brew master is not ready for work");
        }

    }
}
