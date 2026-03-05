// day 3 - subtraction
// same as addition just using - operator

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = sc.nextInt();

        System.out.print("enter second number: ");
        int b = sc.nextInt();

        System.out.println("result = " + (a - b));
    }
}
