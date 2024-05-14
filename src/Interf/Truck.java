package Interf;

public class Truck implements Trackable {

    @Override
    public void track() {
        printInfo("'s are being recorded");
    }

    public void printInfo(String info){
        System.out.println(getClass().getSimpleName() + info );
    }
}
