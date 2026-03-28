// day 8 - method overloading
// same method name but different parameters
// java figures out which one to call based on arguments
// pretty cool feature

public class Overloading {
    // adding two ints
    static int add(int a, int b) {
        return a + b;
    }

    // adding three ints
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // adding two doubles
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("two ints: " + add(10, 20));
        System.out.println("three ints: " + add(10, 20, 30));
        System.out.println("two doubles: " + add(1.5, 2.5));
    }
}
