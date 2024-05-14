package Textblock;

public class StringMethods {
    public static void main(String[] args) {

        //Date
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");

        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("Date = " + newDate);

        newDate = "25".concat("/").concat("11");

        System.out.println("Date = " + newDate);

        System.out.println("ABC\n".repeat(3).indent(8));

        printInfo("Hello world");
    }

    public static void printInfo(String str){

        int length = str.length();
        System.out.printf("Length = %d %n", length);

        if (str.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (str.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", str.charAt(0));

        System.out.printf("Last char = %c %n", str.charAt(length - 1));
    }
}
