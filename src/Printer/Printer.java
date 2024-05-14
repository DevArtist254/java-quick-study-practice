package Printer;

public class Printer {
    private int tonerLevel;
    private int sheets;
    private boolean duplex;

    public Printer(int tonerLevel, int sheets){
        this(tonerLevel, sheets, false);
    }

    public Printer(int tonerLevel, int sheets, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.sheets = sheets;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        if(tonerAmount > 100 || tonerAmount < 0){
            System.out.println("Error");
            return -1;
        } else {
            this.tonerLevel = tonerAmount;

            return tonerLevel;
        }
    }

    public int printPages(int pages){

        if(pages > sheets) {
            System.out.println("Please add more sheets");
            return -1;
        }

        if (duplex) {
            var printedPg = pages / 2;

            sheets -= printedPg;

            System.out.println("it's a duplex printer. Number of sheets rem: " + sheets);
            return printedPg;
        }

        sheets -= pages;

        System.out.println("Number of sheets rem: " + sheets);
        return 0;
    }
}

/**
 * tonerAmount is added to the tonerLevel field.
 * The tonerLevel should never exceed 100 percent, or ever get below 0 percent.
 * If the amount being added makes the level fall outside that range, return a -1 from the method, otherwise return the actual toner level.
 *
 * It should determine how many sheets of paper, will be printed based on the duplex value, and return this sheet number from the method.
 * The sheet number should also be added to the pagesPrinted variable.
 * If it's a duplex printer, print a message that it's a duplex printer.
 *
 * */