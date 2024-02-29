import java.util.Arrays;
import java.util.Random;

public class Storage {
    public Storage() {
        /*
        * Array - storage based system for indexed values
        *
        * Features
        * Has helper func inherited from Object.java
        * Is initialized by the type of data to be used
        * Should have a defined sized
        * Can be read by iterating through using a loop
        * Also a loop and store values by assigning them
        *
        * Binary search means dividing by 2 until the one is found this Must be always int by sort algo
        * */


    }

    public static void main(String[] args) {

        Random randomNum = new Random();
        int[] genRanInt = new int[100];

        for (int i = 0;i < 100; i++ ){
            genRanInt[i] = randomNum.nextInt(100);
        }

        System.out.println(Arrays.toString(genRanInt));
        Arrays.sort(genRanInt);
        int[] ints = reverseSort(genRanInt);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] reverseSort(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;

            for(int i = 0;i < copyArr.length - 1; i++ ){
                if(copyArr[i] < copyArr[i + 1]){
                    temp = copyArr[i];
                    copyArr[i] = copyArr[i + 1];
                    copyArr[i + 1] = temp;

                    flag = true;
                }
            }
        }

        return copyArr;
    }

    public void start() {
        int[] numGam = {1, 20, 33, 4, 55, 6, 7, 8, 9, 10};

        Arrays.sort(numGam);
        for (int i = 0;i < numGam.length;i++){
            System.out.println(numGam[i]);
        }
    }
}
