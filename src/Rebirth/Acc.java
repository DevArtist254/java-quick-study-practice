package Rebirth;

public class Acc {

    //We are setting the val to be private since coz updates will only occur within this class
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String accNumber;
    private double balance;


    //Default cons. in case no data is fed to init
    public Acc(){
        this("John Doe", "a@z.c", "09887", "jdazc09", 5000);
    }

    //Default cons. with only the bare need and uses this to set the rest of the values
    public Acc(String customerName, String customerEmail, String customerPhone){
        this(customerName, customerEmail, customerPhone, "zz12", 100.00);
    }

    //Standard cons.
    public Acc(String customerName, String customerEmail, String customerPhone, String accNumber, double balance){
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println("The amount you deposited was " + amount + "ksh your new bank balance is " + this.balance + "ksh");
    }

    public void withdrawalFunds(double amount) {
        if(this.balance - amount <= 0){
            System.out.println("Insufficient funds to withdraw " + amount + "ksh");
        } else{
            this.balance -= amount;
            System.out.println("You have successfully withdrawn " + amount + "ksh your new balance is " + this.balance + "ksh");
        }
    }

    @Override
    public String toString(){
        return "Acc { \n" +
                "\t Customer Name: " + customerName + ",\n" +
                "\t Customer Email: " + customerEmail + ",\n" +
                "\t Customer Phone: " + customerPhone + ",\n" +
                "\t Account Number: " + accNumber + ",\n" +
                "\t Customer's balance: " + balance + ",\n" +
                "}";
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
