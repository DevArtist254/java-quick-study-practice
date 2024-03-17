public class strMeth {
    public static void main(String[] args) {
        printInfo("Hello world");
        printInfo("\t   \n");

        var helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));

        System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n",helloWorld.indexOf('l', 3));

        var helloWorldLower = helloWorld.toLowerCase();

        if(helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if(helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")) {
            System.out.println("String starts with World");
        }

        if(helloWorld.contains("World")) {
            System.out.println("String starts with World");
        }

        if(helloWorld.contentEquals("Hello World")) {
            System.out.println("String starts with World");
        }
    }

    public static void printInfo(String str) {

        int length = str.length();
        System.out.printf("Length = %d %n", length);

        if (str.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (str.isEmpty()) {
            System.out.println("String is blank");
            return;
        }

        System.out.printf("First char = %c %n", str.charAt(0));

        System.out.printf("Last char = %c %n", str.charAt(length - 1));
    }
}
