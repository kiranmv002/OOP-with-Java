// day 11 - constructors
// constructor is a special method that runs when object is created
// same name as class, no return type
// used to set initial values when creating object
// default constructor has no parameters

public class StudentConstructor {

    String name;
    int age;
    float marks;

    // default constructor - no parameters
    StudentConstructor() {
        name = "unknown";
        age = 0;
        marks = 0;
        System.out.println("default constructor called");
    }

    void display() {
        System.out.println("name: " + name + " age: " + age + " marks: " + marks);
    }

    public static void main(String[] args) {
        // default constructor is called automatically
        StudentConstructor s1 = new StudentConstructor();
        s1.display();
    }
}
