import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {

        /*
        * Array  - storage, typed based, int, read and transversed with looping algo
        *
        * /Features
        * Sorting
        * Search
        * insert
        * Reading
        *
        * */

        int[] basedArr = new int[10];

        for (int i = 0;i <= basedArr.length - 1;i++) {
            basedArr[i] = i;
        }

        System.out.println(Arrays.toString(basedArr));

        int[] newArray = reverseSort(basedArr);

        System.out.println(Arrays.toString(newArray));
    }


    public static int[] reverseSort(int[] arr){
         int[] newArr = arr;

        boolean init = true;

        while (init){
            init = false;

            for(int i = 0;i < newArr.length - 1; i++ ){

                if (newArr[i] < newArr[i + 1]){
                    int temp = newArr[i];

                    //currentEl -> 1
                    newArr[i] = newArr[i + 1];
                    newArr[i + 1] = temp;

                    init = true;
                }
            }
        }

        return newArr;
    }

}
