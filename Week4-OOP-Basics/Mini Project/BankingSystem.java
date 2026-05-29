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
