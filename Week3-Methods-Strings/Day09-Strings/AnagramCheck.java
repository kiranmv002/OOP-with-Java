// day 9 - anagram check
// anagram = two words with same characters in different order
// example: listen and silent are anagrams
// trick: sort both strings and compare
// if sorted versions are equal then anagram

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first word: ");
        String word1 = sc.next().toLowerCase();

        System.out.print("enter second word: ");
        String word2 = sc.next().toLowerCase();

        // convert to char array, sort, then compare
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("yes they are anagrams");
        } else {
            System.out.println("no they are not anagrams");
        }
    }
}
