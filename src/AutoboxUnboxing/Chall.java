package AutoboxUnboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initDeposit){

        //Init the first name and boxing the first value
        this(name.toUpperCase(), new ArrayList<Double>(500));

        //adding out initDep to our list
        transactions.add(initDeposit);
    }
}

public class Chall{
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Kevin W", 2000.0);
        System.out.println(bank);

        bank.addTransaction("Kevin W", 500);
        bank.addTransaction("Kevin W",7000);
        bank.addTransaction("Kevin W", -1000);
        bank.addTransaction("Kevin W", 2000);
        bank.printStatement("Kevin W");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bank{" +
                "name : '" + name + '\'' +
                ", customers : " + customers +
                '}';
    }

    private Customer getCustomer(String customerName){

        //Looping throw the list of available clients
        for (var customer : customers){
            //Checking against the given name
            if (customer.name().equalsIgnoreCase(customerName)){
                return  customer;
            }
        }

        //if Wasn't found print null
        System.out.printf("Customer (%s) wasn't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initDep){
        //Checking to see if the customer is new
        if (getCustomer(customerName) == null){
            var customer = new Customer(customerName, initDep);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transAmount){

        var customer = getCustomer(name);

        if(customer != null) {
            customer.transactions().add(transAmount);
        }
    }

    public void printStatement(String name) {

        var customer = getCustomer(name);

        if (customer == null) {
            System.out.printf("Customer (%s) wasn't found %n", customer);
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transaction: ");

        //unboxing
        for (double transaction : customer.transactions()){
            System.out.printf("$%10.2f (%s)%n", transaction, transaction > 0 ? "debit" : "credit");
        }

    }
}
