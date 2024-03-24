package CtrlWhileLoop;

public class Main {

    public static void main(String[] args) {

        int num = 4;
        int finNum = 25;

        int evenCount = 0;
        int oddCount = 0;

        while (num <= finNum) {

            num++;

            //Skip and add odd numbers
            if(!isEvenNumber(num)) {
                oddCount++;
                continue;
            }

            System.out.println("Even number " + num);

            evenCount++;

            if (evenCount >= 10) {
                break;
            }
        }

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber(int num) {

        boolean isDivBy2 = ((num % 2) == 0);

        if (isDivBy2) return true;

        return false;
    }
}
