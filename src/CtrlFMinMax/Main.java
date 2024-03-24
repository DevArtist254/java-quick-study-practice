package CtrlFMinMax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;

        //Qty of data read be4 termination
        int loopCount = 0;

        while (true) {

            System.out.println("Enter a number, or any char to exit:");

            try {
                double num = Double.parseDouble(scanner.nextLine());

                if(loopCount == 0 || num < min) min = num;

                if(loopCount == 0 || num > max) max = num;

                System.out.println("min = " + min + ", max = " + max);
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if(!(loopCount > 0)) {
            System.out.println("No valid data entered");
        }
    }
}
