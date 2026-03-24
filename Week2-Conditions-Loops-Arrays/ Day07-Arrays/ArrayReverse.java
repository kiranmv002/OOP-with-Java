// day 7 - reverse an array
// printing array from last index to first index

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("reversed: ");
        for (int i = n - 1; i >= 0; i--) { // start from last index
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
