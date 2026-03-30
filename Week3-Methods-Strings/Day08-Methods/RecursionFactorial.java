// day 8 - recursion
// recursion = method calling itself
// factorial using recursion
// factorial(5) = 5 * factorial(4)
//              = 5 * 4 * factorial(3) and so on
// base case is important, without it it runs forever

public class RecursionFactorial {
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1; // base case - stops recursion
        return n * factorial(n - 1);    // calling itself
    }

    public static void main(String[] args) {
        System.out.println("factorial of 5 = " + factorial(5));
        System.out.println("factorial of 6 = " + factorial(6));
        System.out.println("factorial of 0 = " + factorial(0));
    }
}
