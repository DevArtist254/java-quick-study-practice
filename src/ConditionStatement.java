public class ConditionStatement {
    public ConditionStatement() {

        String letter = "x";

        String s = changeUp(letter);

        //Fall through in condition statement
        /*
         * Is a side effect of exiting a iteration after what is found
         * falls through the scope to reach the return, break or continue statement
         *  */

        System.out.println(s);
    }

    public static void changeUp (char letter) {

        switch (letter) {
            case 'x':
                System.out.println("The letter is x");
                break;
            case 'y':
                System.out.println("The letter is y");
                break;
            default:
                System.out.println("None are for direct comparison");
        }
    }

    public static String changeUp (String letter) {

        //Can return and store in a variable
        return switch (letter) {
            case "x" -> "The letter is x";
            case "y" -> "The letter is y";
            default -> "None are for direct comparison";
        };
    }
}
