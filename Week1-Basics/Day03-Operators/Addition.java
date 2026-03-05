// day 3 - addition
// taking input from user using scanner
// scanner reads what user types on keyboard

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = sc.nextInt();

        System.out.print("enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
