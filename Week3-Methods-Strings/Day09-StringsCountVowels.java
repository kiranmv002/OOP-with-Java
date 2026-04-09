// day 9 - count vowels in a string
// vowels are a, e, i, o, u
// looping through each character and checking if its a vowel

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");
        String str = sc.next().toLowerCase();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // checking if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("number of vowels = " + count);
    }
}
