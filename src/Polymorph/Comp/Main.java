package Polymorph.Comp;

public class Main {
    public static void main(String[] args) {
        Monitor asusM2 = new Monitor("asusM2", 2000, 14, "2560x1440");
        MotherBoard rog2 = new MotherBoard("rog2", 500, 6, 2, "z23r");
        ComputerCase coolMaster = new ComputerCase("coolMaster", 400, false);

        Computer desktop = new Computer("me", asusM2, rog2, coolMaster);

        System.out.println(desktop);
    }
}
