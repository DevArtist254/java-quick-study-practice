import java.util.Scanner;

public class rebirth {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        // Statement
        // var = expression

        // byte -128 127 8bits, short -32768 32767 16bits, int -214 - 214 32bit, long 9b 64bits - default int
        // Overflow causes a casing error and one has to update to that specific data type

        // float 32 bit and double 64 bits - default double
        // Boolean
        // char 16bits with unicode support
        // String is a immutable obj with 64 bits
        // String builder mutable 16bits update
    }
}


//computer {
//    ram;
//    os;
//    hardWhere;
//    size;
//
//    booting() {
//
//    }
//
//    shuttingdown() {
//
//    }
//}

/*
*
 dell {
 * 16ram
 * windows11
 * 5 MHZ
 *
 * The is booted up
 * }
*
* Use ref by the allowed access modifier
* Null mean on obj ref, primitive default to 0 and false except for String which is still null
*
* You can get and set data on the state
*
* constructor - init of obj instance with this as the ref, implicitly created with an access modifier
*
* */

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User (int age) {
        this("John doe", age);
    }


    public User(){
        this("John doe", 21);
    }

}

/*
* if User had a name and an age
*
* if User had no name but an age
* */