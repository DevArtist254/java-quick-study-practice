package Polymorph.Comp;

public class Computer {
    private String name;
    private Monitor monitor;
    private MotherBoard motherBoard;
    private ComputerCase computerCase;

    public Computer(String name, Monitor monitor, MotherBoard motherBoard, ComputerCase computerCase){
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + "\n" +
                "-".repeat(10) + "\n" +
                "monitor=" + monitor +
                "-".repeat(10) + "\n" +
                "motherBoard=" + motherBoard +
                "-".repeat(10) + "\n" +
                "computerCase=" + computerCase +
                "-".repeat(10) + "\n" +
                "Total price=" + totalPrice() +
                '}';
    }


    public int totalPrice(){
        return monitor.getPrice() + motherBoard.getPrice() + computerCase.getPrice();
    }
}


class Monitor extends Product  {
    private int size;
    private String resolution;

    public Monitor (String model, int price, int size, String resolution){
        super(model, price);
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString(){
        return "Monitor - \n" +
                "-".repeat(10) + "\n" +
                "Size :" + this.size + "\n" +
                "Resolution :" + this.resolution + "\n"+
                "Model and price :" + super.toString() + "\n";
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}

class MotherBoard extends Product {
    private int ramSlots;
    private String bios;
    private int cardSlots;

    public MotherBoard (String model, int price, int ramSlots, int cardSlots, String bios){
        super(model, price);
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
    }

    @Override
    public String toString(){
        return "MotherBoard - \n" +
                "-".repeat(10) + "\n" +
                "bios :" + this.bios + "\n" +
                "cardSlots :" + this.cardSlots + "\n"+
                "ramSlots :" + this.ramSlots + "\n"+
                "Model and price :" + super.toString() + "\n";
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}

class ComputerCase extends Product {

    private boolean powerSupply;

    public ComputerCase (String model, int price, boolean powerSupply){
        super(model, price);
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString(){
        return "ComputerCase - \n" +
                "-".repeat(10) + "\n" +
                "powerSupply :" + this.powerSupply + "\n" +
                "Model and price :" + super.toString() + "\n";
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}