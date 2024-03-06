public class Str {
    public static void main(String[] args) {
        //Escape seq
        System.out.println("Hello wor\nld");
        System.out.println("Hello wor\tld");
        System.out.println("Hello wor\"ld");
        System.out.println("Hello wor\\ld");

        //Format specifiers
        for(int i = 1; i < 10; i++){
            System.out.printf("Printing %6d %n",i);
        }
    }


}

/*
 * A collection of char types in memory
 * Are treated as zero arrays
 * */

/*
* Common escape seq
* Format Specifiers - printing console
* */

/*
* String methods
*
* String inspection methods - size, charAt & emptiness
* String comparison methods - between char and word
* String transform methods - trim, casing, indent, join, repeat & substring
* */