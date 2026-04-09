// day 9 - reverse a string
// looping from last character to first
// building a new reversed string

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String str = sc.next();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("reversed: " + reversed);
    }
}
