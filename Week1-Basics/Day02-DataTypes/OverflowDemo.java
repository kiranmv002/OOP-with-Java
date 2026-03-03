// day 2 - overflow
// int has a max limit, if we cross it, it wraps to negative
// didnt know this before, pretty interesting

public class OverflowDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println("max value: " + max); // 2147483647

        // crossing the limit causes overflow
        System.out.println("max + 1 = " + (max + 1)); // goes negative!

        int min = Integer.MIN_VALUE;
        System.out.println("min value: " + min);
    }
}
