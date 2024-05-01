package Rebirth;

public class Main {
    public static void main(String[] args) {
        Acc timsAcc = new Acc("Tim", "a@Z.c", "23948234");

        timsAcc.depositFunds(2000);
        timsAcc.depositFunds(5000);
        timsAcc.depositFunds(15000);

        timsAcc.withdrawalFunds(30000);

        System.out.println(timsAcc);

        User jane = new User("Jane", "a@Z.c", "23948234");

        jane.deposit(2000);
        jane.deposit(100);

        System.out.println(jane);
    }
}
