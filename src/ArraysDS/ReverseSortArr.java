package ArraysDS;

import java.util.Arrays;
import java.util.Random;

public class ReverseSortArr {
    public static void main(String[] args) {

        var newArray = generateRandomArr(5);
        Arrays.sort(newArray);
        printArray(newArray);

       var newArr = reverseArr(newArray);

        printArray(newArr);
    }

    private static int[] reverseArr (int[] newArr) {

        var ordArr = newArr;

        boolean init = true;

        while (init) {

            init = false;

            for(int i = 0;i < ordArr.length - 1;i++) {
                int temp = 0;

                if(ordArr[i] < ordArr[i + 1]) {
                    temp = ordArr[i];
                    ordArr[i] = ordArr[i + 1];
                    ordArr[i + 1] = temp;

                    init = true;
                }
            }

        }


        return ordArr;
    }

    private static int[] generateRandomArr(int length){

        Random ran = new Random();
        int[] newArr = new int[length];

        for (int i = 0;i < length;i++ ) {
            newArr[i] = ran.nextInt(100);
        }

        return newArr;
    }

    private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
