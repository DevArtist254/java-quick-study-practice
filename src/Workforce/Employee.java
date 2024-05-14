package Workforce;

import java.util.Random;

public class Employee extends Worker{
    protected long employeeId;

    public Employee(){}

    public Employee(String name, int birthYear, int basicSalary){
        super(name, birthYear, basicSalary);
        this.employeeId = generateRandomId();
    }

    public long generateRandomId(){

        Random ran = new Random();
        long id = ran.nextLong(1000);

        return id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString(){
        return super.toString() + "EmployeeId -> " + employeeId + "\n";
    }
}
