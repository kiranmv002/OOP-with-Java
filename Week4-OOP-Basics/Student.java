// day 10 - classes and objects
// class is a blueprint, object is the actual thing
// like class is the design of a house, object is the actual house
// variables inside class are called fields or attributes
// functions inside class are called methods

public class Student {

    // fields - attributes of a student
    String name;
    int age;
    float marks;

    // method inside class
    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("marks: " + marks);
    }

    void grade() {
        if (marks >= 90) System.out.println("grade: A+");
        else if (marks >= 80) System.out.println("grade: A");
        else if (marks >= 70) System.out.println("grade: B");
        else System.out.println("grade: C");
    }

    public static void main(String[] args) {
        // creating objects
        Student s1 = new Student();
        s1.name = "kiran";
        s1.age = 20;
        s1.marks = 85;
        s1.display();
        s1.grade();

        System.out.println();

        Student s2 = new Student();
        s2.name = "rahul";
        s2.age = 21;
        s2.marks = 92;
        s2.display();
        s2.grade();
    }
}
