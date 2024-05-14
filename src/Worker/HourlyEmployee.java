package Worker;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(double hourlyPayRate, long employeeId, String hireDate, String name, int birthDate, String endDate){
        super(employeeId, hireDate, name, birthDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoubleHourlyPayRate(){
        return this.hourlyPayRate += hourlyPayRate;
    }
}
