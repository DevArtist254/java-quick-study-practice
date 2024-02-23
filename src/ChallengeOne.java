public class ChallengeOne {
    public static void main(String[] args) {
        for (int i = 5;i <= 20; i++){
            if (hasEvenNumber(i)) {
                //Fall through to print
                System.out.println("Is a an even number " + i);
            }
        }
    }

    public static boolean hasEvenNumber (int num) {
        if(num % 2 == 0) return true;

        return false;
    };
}
