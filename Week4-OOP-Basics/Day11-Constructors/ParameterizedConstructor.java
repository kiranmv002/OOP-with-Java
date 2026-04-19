// day 11 - parameterized constructor
// constructor with parameters
// we can pass values when creating object
// cleaner than setting values one by one
// this keyword refers to current object

public class ParameterizedConstructor {

    String name;
    int age;
    float marks;

    // parameterized constructor
    ParameterizedConstructor(String name, int age, float marks) {
        this.name = name;     // this.name = field, name = parameter
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("marks: " + marks);
    }

    public static void main(String[] args) {
        // passing values directly when creating object
        ParameterizedConstructor s1 = new ParameterizedConstructor("kiran", 20, 85.5f);
        s1.display();

        System.out.println();

        ParameterizedConstructor s2 = new ParameterizedConstructor("rahul", 21, 92.0f);
        s2.display();
    }
}
