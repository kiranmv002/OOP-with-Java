// day 7 - largest element in array
// assuming first element is largest
// then comparing with each element

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element: ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0]; // assume first is largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // update if bigger found
            }
        }

        System.out.println("largest = " + largest);
    }
}
