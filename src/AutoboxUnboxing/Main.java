package AutoboxUnboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer bxInt = Integer.valueOf(15); //Automatic unboxing
        int unbxInt = bxInt.intValue(); //Manual unboxing

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;

        System.out.println(autoBoxed.getClass().getName());

        Double resBx = getDoubleObj();
        double resUnbx = getLiteralDoublePrimitive();

        Integer[] wrapperArr = new Integer[5];

        //Insertion at index 0 val 50
        wrapperArr[0] = 50;

        //50 - 5 nulls
        System.out.println(Arrays.toString(wrapperArr));
        //Access the name
        System.out.println(wrapperArr[0].getClass().getName());

        //Anonymous array
        Character[] charArr = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(charArr));

        var ourList = List.of( 1, 2, 3, 4, 5);
        System.out.println(ourList);

    }
    //Only used method static method that gets boxed Integers and return boxed Integer
    private static ArrayList<Integer> getList(Integer... varargs) {

        //Autoboxing
        ArrayList<Integer> aList = new ArrayList<>();

        for(int i : varargs) {
            aList.add(i);
        }

        return aList;
    }

    //Auto unboxing
    private static int resInt(Integer i){

        return i;
    }

    //Auto Boxing
    private static Integer resINT(int i){

        return i;
    }

    private static Double getDoubleObj() {

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.0;
    }
}
