public class Inversion {
    int x = 30;
    int y = 20;
    int z = 20;
    public Inversion (){
        if (y > x || y <= z) {
            System.out.println("One of them is equal");

        } else {
            System.out.println("None are equal");
        }

        if (y > x && y <= z) {
            System.out.println("Both of them is equal");

        } else {
            System.out.println("None are equal");
        }

        boolean a = true;

        if(!a == true) {
            System.out.println("is converted, could be usefull in a do while statement");
        }
    }

}
