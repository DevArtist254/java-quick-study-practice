public class strtxtblock {

    public static void main(String[] args) {

        String bulletIt = """
                Print a bullet list:
                    \u2022 First point
                        \u2022 Sub point
                """;

        System.out.println(bulletIt);

        int age = 23;
        int yearOfBirth = 2024 - age;

        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Age = %.2f, Birth year = %d%n", (float) age, yearOfBirth);

        for(int i = 0; i <= 100; i += 10){
            System.out.printf("Printing %9d %n", i);
        }
    }
}
