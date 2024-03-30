public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(-777);
    }

    public static boolean isPalindrome(int num){

        num = Math.abs(num);

        int reverse = 0;
        int original = 0;

        original = num;

        while(num > 0) {
            reverse += (num % 10);
            num /= 10;
            reverse *= 10;
        }

        reverse /= 10;

        return reverse == original;
    }
}
