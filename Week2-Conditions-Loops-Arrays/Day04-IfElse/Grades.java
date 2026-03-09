// day 4 - grades program
// checking marks and printing grade
// used else if ladder for multiple conditions

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("grade: A+");
        } else if (marks >= 80) {
            System.out.println("grade: A");
        } else if (marks >= 70) {
            System.out.println("grade: B");
        } else if (marks >= 60) {
            System.out.println("grade: C");
        } else {
            System.out.println("grade: fail");
        }
    }
}
