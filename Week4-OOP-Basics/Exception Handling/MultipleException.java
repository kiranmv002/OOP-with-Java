// day 18 - multiple exceptions
// we can catch different types of exceptions separately
// finally block runs always, even if exception happens
// useful for closing files or connections

import java.util.Scanner;

public class MultipleException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("enter a number: ");
            int n = Integer.parseInt(sc.next()); // can throw NumberFormatException

            int[] arr = new int[5];
            arr[n] = 100; // can throw ArrayIndexOutOfBoundsException

            System.out.println("value set at index " + n);

        } catch (NumberFormatException e) {
            System.out.println("thats not a number!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of range, use 0 to 4");
        } finally {
            // this always runs
            System.out.println("done. finally block executed.");
        }
    }
}
