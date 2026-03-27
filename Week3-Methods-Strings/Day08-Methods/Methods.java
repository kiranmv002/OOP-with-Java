// day 8 - methods
// method is a block of code that does a specific task
// we define it once and call it multiple times
// helps avoid writing same code again and again

public class Methods {
    // method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // method to check even or odd
    static String evenOdd(int n) {
        if (n % 2 == 0) return "even";
        else return "odd";
    }

    // method with no return value
    static void greet(String name) {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        System.out.println("sum = " + add(10, 20));
        System.out.println("5 is " + evenOdd(5));
        greet("kiran");
    }
}
