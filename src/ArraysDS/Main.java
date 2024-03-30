package ArraysDS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArr = new int[10];

        //Storing typed value for specific address
        intArr[0] = 45;
        intArr[1] = 1;
        intArr[2] = 37;

        double[] douArr = new double[10];
        douArr[2] = 3.5;

        System.out.println(douArr[2]);

        //int an known array
        int[] firstTen = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};

        System.out.println("first = " + firstTen[0]);
        System.out.println("length of the array = " + firstTen.length);
        System.out.println("last el: " + firstTen[firstTen.length - 1]);

        int[] newArr;
        newArr = new int[] {5, 4, 3, 2, 1};

        for(int i = 0; i < newArr.length; i++) {
            System.out.println("Number: " + newArr[i]);
        }

        System.out.println("-".repeat(30));

        //Enhanced loop
       for (int el : newArr) {
           System.out.println("Number: " + el);
       }

        System.out.println("-".repeat(30));

       System.out.println(Arrays.toString(newArr));

        System.out.println("-".repeat(30));

        Object objVar = newArr;

        if (objVar instanceof int[]){
            System.out.println("Object var is really an int array");
        }

        Object[] objArr = new Object[3];
        objArr[0] = "Hello";
        objArr[1] = new StringBuilder("World");
        objArr[2] = Arrays.toString(newArr);

        System.out.println(Arrays.toString(objArr));
    }
}
