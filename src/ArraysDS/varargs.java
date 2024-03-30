package ArraysDS;

public class varargs {
    public static void main(String[] args) {

        System.out.println("Hello world again");

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("_".repeat(20));
        printText();

        System.out.println("_".repeat(20));
        String[] sArr = {"first", "second", "third", "fourth", "fifth"};

        System.out.println(String.join(", ", sArr));
    }

    private static void printText(String... textList){

        for(String t : textList) {
            System.out.println(t);
        }
    }
}
