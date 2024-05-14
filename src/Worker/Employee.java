package Worker;

public class Employee extends Worker {
    protected long employeeId;
    protected String hireDate;

    public Employee() {}

    public Employee(long employeeId, String hireDate, String name, int birthDate, String endDate){
        super(name, endDate, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public double collectPay() {
        return super.collectPay();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void terminate(String endDate) {
        super.terminate(endDate);
    }
}
