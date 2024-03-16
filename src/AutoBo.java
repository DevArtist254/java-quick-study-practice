import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double intDep) {
        this(name.toUpperCase(), new ArrayList<Double>(500));

        transactions.add(intDep);
    }
}
public class AutoBo {
    public static void main(String[] args) {
        var bank = new Bank("Chase");
        bank.addNewCustomer("Mellow", 300.0);

        bank.addTransaction("Mellow", 300.0);
        bank.addTransaction("Mellow", 1300.0);
        bank.addTransaction("Mellow", 1300.0);
        bank.addTransaction("Mellow", -300.0);

        bank.printStatement("Mellow");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){

        for(var c : customers){
            if(c.name().equalsIgnoreCase(customerName)){
                return c;
            }
        }

        System.out.printf("Customer (%s) wasn't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double intDep) {
        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, intDep);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {

        var customer = getCustomer(name);

        if (customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {

        var c = getCustomer(customerName);
        if (c == null) return;

        System.out.println("Transactions for customer name :"+ customerName);
        System.out.println("-".repeat(30));
        for (double d : c.transactions()){
            System.out.printf("$%10.2f (%s)%n",
                                    d, d < 0 ? "debit" : "credit"
            );
        }
    }

}