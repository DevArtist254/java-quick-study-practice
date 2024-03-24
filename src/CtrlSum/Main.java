package CtrlSum;

public class Main {

    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int i = 1;i <= 1000;i++) {

            boolean isDivisibleBy3 = (i % 3 == 0);
            boolean isDivisibleBy5 = (i % 5 == 0);

            if(isDivisibleBy3 && isDivisibleBy5){
                countOfMatches++;
                sumOfMatches += i;

                System.out.println("Found a match = " + i);
            }

            //Terminate statement
            if (countOfMatches == 10) {
                break;
            }
        }

        System.out.println("Sum = " + sumOfMatches);
    }
}
