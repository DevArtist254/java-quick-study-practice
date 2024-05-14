package SmartKitchen;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        hasWorkToDo = true;
        System.out.println("Dishes have been done");
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        if(hasWorkToDo){
            System.out.println("The clean master is ready for work");
        } else {
            System.out.println("The clean master is not ready for work");
        }

    }
}
