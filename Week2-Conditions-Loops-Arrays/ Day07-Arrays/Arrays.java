// day 7 - arrays
// array stores multiple values of same type
// index starts from 0 not 1

public class Arrays {
    public static void main(String[] args) {

        // declaring and initializing array
        int[] nums = {10, 20, 30, 40, 50};

        // printing using for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println("index " + i + " = " + nums[i]);
        }

        // for each loop - cleaner way
        System.out.println("using for each:");
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
