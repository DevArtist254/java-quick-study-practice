package Workforce;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee jack = new SalariedEmployee("Jack", 1995, 20000, 20,2010);

        System.out.println(jack);
        System.out.println(jack.getSalary());
    }
}
