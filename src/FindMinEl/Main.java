package FindMinEl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] values = new int[]{1, 2, 3 , 4, 5};

         var minVal = readValues(values);

         System.out.println(minVal);

    }


    private static int readValues(int[] sc){

        var arr = sc;

        int temp = 10;

        for (int i = 0;i <= arr.length - 1;i++) {

            if(temp > arr[i]) temp = arr[i];

        }

        return temp;
    }

}
