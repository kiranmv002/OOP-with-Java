// day 6 - armstrong number
// armstrong = sum of cubes of digits equals the number
// example: 153 = 1^3 + 5^3 + 3^3 = 1+125+27 = 153
// this one was fun to figure out

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // get last digit
            sum = sum + (digit * digit * digit); // cube it and add
            n = n / 10; // remove last digit
        }

        if (sum == original) {
            System.out.println(original + " is an armstrong number");
        } else {
            System.out.println(original + " is not an armstrong number");
        }
    }
}
