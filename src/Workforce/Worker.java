package Workforce;

public class Worker {

    protected String name;
    protected int birthYear;
    protected int basicSalary;

    public Worker(){}

    public Worker(String name, int birthYear, int basicSalary){
        this.name = name;
        this.birthYear = birthYear;
        this.basicSalary = basicSalary;
    }

    public int getAge(){
        //Date date = new Date();
        int year = 2024;


        return year - birthYear;
    }

    @Override
    public String toString(){
        return "---\n" +
        "Name -> " + name + "\n" + "Age -> " + getAge() + "\n";
    }
}
