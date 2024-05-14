package Textblock;

public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a bulleted list:\n" +
                "\t\u2022 First point \n" +
                "\t\u2022 Second point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted list
                    \u2022 First Point
                    \u2022 Second Point
                """;

        System.out.println(textBlock);

        int age = 35;
        //%[argument_index$][flags][width][.precision]conversion
        //%d - int or long
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;

        //You can add more than one
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        //specify decimal places
        System.out.printf("Your age is %.3f%n", (float) age);

        for(int i = 1;i <= 1000000;i *= 10){
            System.out.printf("Printing %7d %n", i);
        }
    }
}
