// day 3 - simple interest
// formula: SI = (P * R * T) / 100
// P = principal, R = rate, T = time

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter principal: ");
        double p = sc.nextDouble();

        System.out.print("enter rate: ");
        double r = sc.nextDouble();

        System.out.print("enter time: ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("simple interest = " + si);
        System.out.println("total amount = " + (p + si));
    }
}
