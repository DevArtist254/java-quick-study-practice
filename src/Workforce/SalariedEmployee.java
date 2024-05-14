package Workforce;

public class SalariedEmployee extends Employee {
    private int startYear;
    private int daysWorked;

    public SalariedEmployee(String name, int birthYear, int basicSalary, int daysWorked, int startYear){
        super(name, birthYear, basicSalary);
        this.startYear = startYear;
        this.daysWorked = daysWorked;
    }

    public int getRetirementAge(){

        int age = super.getAge();
        int retiredAt = 55 - age;

        return retiredAt;
    }

    public double getSalary(){
        double dailySalary = (double) basicSalary / 27;

        return dailySalary * daysWorked;
    }

    @Override
    public String toString(){
        String retirement = getRetirementAge() < 0 ? "The employee is retired \n" : "The employee is remaining " + getRetirementAge() + " yrs to retire\n";

        return super.toString() + retirement;
    }
}
