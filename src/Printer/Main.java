package Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(80, 45, true);

        printer.printPages(30);

        printer.addToner(10);
    }
}
