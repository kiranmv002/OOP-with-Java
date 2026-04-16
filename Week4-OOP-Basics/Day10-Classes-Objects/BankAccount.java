// day 10 - bank account class
// real world example of class and object
// deposit and withdraw are methods that change balance
// balance should not go negative

public class BankAccount {

    String owner;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("deposited: " + amount);
        System.out.println("balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("not enough balance!");
        } else {
            balance = balance - amount;
            System.out.println("withdrawn: " + amount);
            System.out.println("balance: " + balance);
        }
    }

    void display() {
        System.out.println("account owner: " + owner);
        System.out.println("current balance: " + balance);
    }
