// day 6 - fibonacci series
// each number is sum of previous two numbers
// 0, 1, 1, 2, 3, 5, 8, 13...
// starts with 0 and 1

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("fibonacci: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b; // next number is sum of previous two
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
}
