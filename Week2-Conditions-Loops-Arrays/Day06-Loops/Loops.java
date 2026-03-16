// day 6 - loops
// three types of loops in java
// for loop - when we know how many times
// while loop - when we dont know how many times
// do while - runs at least once even if condition is false

public class Loops {
    public static void main(String[] args) {

        // for loop
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop
        System.out.println("while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do while loop
        System.out.println("do while loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
