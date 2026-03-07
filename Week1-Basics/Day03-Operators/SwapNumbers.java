// day 3 - swap two numbers
// swapping without third variable using + and -
// took me a while to understand this logic
// a=10, b=20
// step1: a = 10+20 = 30
// step2: b = 30-20 = 10 (original a)
// step3: a = 30-10 = 20 (original b)

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("before: a=" + a + " b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after: a=" + a + " b=" + b);
    }
}
