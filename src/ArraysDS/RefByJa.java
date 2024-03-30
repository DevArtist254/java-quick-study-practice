package ArraysDS;

import java.util.Arrays;

public class RefByJa {
    public static void main(String[] args) {

        int[] intArr = new int[5];
        int[] anoArr = intArr;

        System.out.println("B a:" + Arrays.toString(intArr));
        System.out.println("B b:" + Arrays.toString(intArr));

        anoArr[0] = 1;
        modifyArr(intArr);

        System.out.println("After a:" + Arrays.toString(intArr));
        System.out.println("After a:" + Arrays.toString(intArr));
    }

    private static void modifyArr(int[] arr){
        arr[1] = 2;
    }
}

