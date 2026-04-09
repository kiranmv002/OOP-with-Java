// day 9 - palindrome check
// palindrome = word that reads same forward and backward
// example: madam, racecar, level
// trick: reverse the string and compare with original

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a word: ");
        String word = sc.next().toLowerCase(); // lowercase for fair comparison

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i); // building reversed string
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
