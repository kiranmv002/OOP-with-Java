// day 6 - factorial
// factorial of 5 = 5*4*3*2*1 = 120
// using for loop to multiply numbers from 1 to n

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i; // multiplying each number
        }

        System.out.println("factorial of " + n + " = " + fact);
    }
}
