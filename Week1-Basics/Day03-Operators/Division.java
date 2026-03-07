// day 3 - division
// / gives quotient, % gives remainder
// if we divide by 0 java throws an error so added a check

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter dividend: ");
        int a = sc.nextInt();

        System.out.print("enter divisor: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("cant divide by zero!");
        } else {
            System.out.println("quotient = " + (a / b));
            System.out.println("remainder = " + (a % b));
        }
    }
}
