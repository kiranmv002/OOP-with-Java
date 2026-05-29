// day 19 - mini project
// simple banking system using everything learned
// classes, objects, methods, exception handling, arraylist
// user can create account, deposit, withdraw, check balance

import java.util.ArrayList;
import java.util.Scanner;

class Account {

    String name;
    int accountNo;
    double balance;

    Account(String name, int accountNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("invalid amount!");
            return;
        }
        balance += amount;
        System.out.println("deposited " + amount + " | balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("invalid amount!");
        } else if (amount > balance) {
            System.out.println("not enough balance!");
        } else {
            balance -= amount;
            System.out.println("withdrawn " + amount + " | balance: " + balance);
        }
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("account no: " + accountNo);
        System.out.println("balance: " + balance);
    }
}

public class BankingSystem {

    static ArrayList<Account> accounts = new ArrayList<>();
    static int nextAccountNo = 1001;
    static Scanner sc = new Scanner(System.in);

    static void createAccount() {
        System.out.print("enter name: ");
        String name = sc.next();
        System.out.print("enter initial deposit: ");
        double deposit = sc.nextDouble();
        Account acc = new Account(name, nextAccountNo++, deposit);
        accounts.add(acc);
        System.out.println("account created! account no: " + acc.accountNo);
    }

    static Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.accountNo == accNo) return acc;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("=== simple banking system ===");

        while (true) {
            System.out.println("\n1. create account");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. check balance");
            System.out.println("5. exit");
            System.out.print("choose: ");

            int choice = sc.nextInt();

