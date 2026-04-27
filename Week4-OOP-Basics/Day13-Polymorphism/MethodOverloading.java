// day 13 - method overloading
// same method name but different parameters
// java decides which one to call based on what we pass
// this is compile time polymorphism

public class MethodOverloading {

    // same name, different parameters
    static void print(int n) {
        System.out.println("int: " + n);
    }

    static void print(String s) {
        System.out.println("string: " + s);
    }

    static void print(int a, int b) {
        System.out.println("two ints: " + a + " and " + b);
    }

    public static void main(String[] args) {
        print(10);
        print("kiran");
        print(10, 20);
    }
}
