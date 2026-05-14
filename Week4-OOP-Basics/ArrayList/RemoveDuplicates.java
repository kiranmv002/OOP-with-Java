// day 16 - remove duplicates from arraylist
// using a new list to store only unique values
// if element already in new list, skip it

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(4);

        System.out.println("before: " + nums);

        ArrayList<Integer> unique = new ArrayList<>();
        for (int n : nums) {
            if (!unique.contains(n)) { // only add if not already there
                unique.add(n);
            }
        }

        System.out.println("after removing duplicates: " + unique);
    }
}
