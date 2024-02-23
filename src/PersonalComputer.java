public class PersonalComputer extends Product {
    Motherboard motherboard;
    ComputerCase computerCase;
    Monitor monitor;

    public PersonalComputer(String model, String manufacture, Motherboard motherboard, ComputerCase computerCase, Monitor monitor) {
        super(model, manufacture);
        this.motherboard = motherboard;
        this.computerCase = computerCase;
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "motherboard=" + motherboard +
                ", computerCase=" + computerCase +
                ", monitor=" + monitor +
                ", model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                "} " + super.toString();
    }
}

