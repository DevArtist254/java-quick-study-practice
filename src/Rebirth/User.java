package Rebirth;

public class User {
    //Private user cred.
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String accountNumber;
    private double balance;

    public User(String customerName, String customerEmail, String customerPhone, String accountNumber, double balance){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public User() {
        this("Default Name", "Default Email", "Default Phone", "1111a", 50.00);
    }

    public User(String customerName, String customerEmail, String customerPhone){
        this(customerName, customerEmail, customerPhone, "1a", 500.00);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("You have deposited %f ksh your new balance is %f ksh \n", amount, this.balance);
    }

    public void withdrawal(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.printf("You have deposited %f ksh your new balance is %f ksh \n", amount, this.balance);
        }
    }

    @Override
    public String toString(){
        return "User {\n\t" + customerName + ",\n\t"+ customerEmail + ",\n\t" + customerPhone + ",\n\t" + accountNumber + ",\n\t" + balance + "\n}";
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
