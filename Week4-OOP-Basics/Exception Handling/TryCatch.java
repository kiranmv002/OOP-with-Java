// day 18 - exception handling
// exception = error that happens at runtime
// try catch is used to handle exceptions
// without try catch, program crashes on error

public class TryCatch {

    public static void main(String[] args) {

        // without try catch this would crash
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // division by zero
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("caught error: " + e.getMessage());
        }

        // array out of bounds
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // index doesnt exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array error: index doesnt exist");
        }

        // this runs even if error happened
        System.out.println("program continues after catch!");
    }
}
