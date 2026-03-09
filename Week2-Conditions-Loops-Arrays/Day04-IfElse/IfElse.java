// day 4 - if else
// basic condition checking
// if condition is true it runs that block, else other block

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("positive number");
        } else if (num < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("its zero");
        }
    }
}
