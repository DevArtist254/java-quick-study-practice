package SmartKitchen;

public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        hasWorkToDo = true;
        System.out.println("Food has been order");
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        if(hasWorkToDo){
            System.out.println("The ice box is ready for work");
        } else {
            System.out.println("The ice box is ready for work");
        }

    }
}
