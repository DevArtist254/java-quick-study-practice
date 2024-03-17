public class strbuilder {
    public static void main(String[] args) {

        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");

        var helloWorldBuilder = new StringBuilder("Hello " + "world");
        helloWorldBuilder.append(" and goodbye");

        printInfo(helloWorld);
        printInfo(helloWorldBuilder);

        var emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        var emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInfo(emptyStart);
        printInfo(emptyStart32);

        var builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');

        printInfo(builderPlus);

        builderPlus.replace(16, 17, "G");

        printInfo(builderPlus);
    }

    public static void printInfo(String string) {

        System.out.println("-".repeat(30));

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInfo(StringBuilder string) {

        System.out.println("-".repeat(30));

        System.out.println("StringBuilder = " + string);
        System.out.println("Length = " + string.length());
        System.out.println("Capacity = " + string.capacity());
    }
}
