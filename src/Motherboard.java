public class Motherboard {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(int ramSlots, int cardSlots, String bios) {
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    private void loadOs(String programName) {
        System.out.println("The computer was load with " + programName);
    }
}
