// day 5 - simple calculator using switch
// user enters two numbers and an operator
// switch checks which operator and does the calculation

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        double a = sc.nextDouble();

        System.out.print("enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0); // reading single character

        System.out.print("enter second number: ");
        double b = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("result = " + (a + b)); break;
            case '-': System.out.println("result = " + (a - b)); break;
            case '*': System.out.println("result = " + (a * b)); break;
            case '/':
                if (b == 0) System.out.println("cant divide by zero");
                else System.out.println("result = " + (a / b));
                break;
            default: System.out.println("invalid operator");
        }
    }
}
