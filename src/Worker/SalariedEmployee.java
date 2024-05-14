package Worker;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(double annualSalary, boolean isRetired, long employeeId, String hireDate, String name, int birthDate, String endDate){
        super(employeeId, hireDate, name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){

    }
}
