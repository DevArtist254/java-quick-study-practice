public class ChallOneV2 {
    public ChallOneV2 (){
        int i = 5;
        int count = 20;

        while (i <= count){
            i++;
            //Skip if true
            if (hasEvenNumber(i)) continue;
            //Fall through
            System.out.println("Is an even number "+ i);
        }
    }


    public static void  challV3 (String[] args) {

        int i = 5;
        int count = 20;
        int c = 0;

        while (i <= count){
            i++;
            //Skip if true
            if (hasEvenNumber(i)) continue;
            //Fall through
            System.out.println("Is an even number "+ i);

            c++;
            //Stop if true
            if(c == 5) break;
        }
    }

    public static boolean hasEvenNumber (int num) {
        if(num % 2 == 0) return true;

        return false;
    };
}
