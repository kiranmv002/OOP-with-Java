// day 4 - largest of three numbers
// comparing three numbers to find the biggest one
// nested if else is used here

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = sc.nextInt();

        System.out.print("enter second number: ");
        int b = sc.nextInt();

        System.out.print("enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("largest = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("largest = " + b);
        } else {
            System.out.println("largest = " + c);
        }
    }
}
