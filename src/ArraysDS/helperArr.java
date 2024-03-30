package ArraysDS;

import java.util.Arrays;
import java.util.Random;

public class helperArr {
    public static void main(String[] args) {

        printTopic("Sorting");
        var firstArray = getRandomArray(10);

        printArray(firstArray);
        Arrays.sort(firstArray);
        printArray(firstArray);

        printTopic("Fill with initial typed values");

        var secArray = new int[10];
        printArray(secArray);
        Arrays.fill(secArray, 5);
        printArray(secArray);

        printTopic("Copying arrays");

        var thirdArr = getRandomArray(10);
        printArray(thirdArr);
        //Copy of needs the length
        var fourthArr = Arrays.copyOf(thirdArr, thirdArr.length);
        Arrays.sort(fourthArr);
        printArray(fourthArr);

        var largerArr = Arrays.copyOf(thirdArr, 15);
        printArray(largerArr);

        printTopic("Binary Search");

        String[] strArr = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(strArr);
        printArray2(strArr);

        if (Arrays.binarySearch(strArr, "Mark") >= 0){
            System.out.println("Found mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5, 6};
        int[] s2 = {1, 2, 3, 4, 5, 6, 0};

        if (Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int[] getRandomArray(int len){

        Random ran = new Random();
        int[] newInt = new int[len];

        for (int i = 0;i < len;i++){
            newInt[i] = ran.nextInt(100);
        }

        return newInt;
    }

    private static void printTopic(String topic){
        System.out.println("*".repeat(30));
        System.out.println(topic);
        System.out.println("-".repeat(30));
    }

    private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    private static void printArray2(String[] array){
        System.out.println(Arrays.toString(array));
    }
}
