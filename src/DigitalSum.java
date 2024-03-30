public class DigitalSum {
    public static void main(String[] args) {

        System.out.println("The sum of digits is " + sumDigits(1234));

    }

    static int sumDigits (int num){

        if (num < 0) return -1;

        int sum = 0;

        while (num > 10) {
            sum += (num % 10);
            num /= 10;
        }

        sum += num;

        return sum;
    }
}
