// day 12 - employee inheritance
// Employee is parent, Manager and Developer are children
// manager has extra teamSize field
// developer has extra language field
// both inherit salary and name from Employee

public class Employee {

    String name;
    double salary;
    String department;

    void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("department: " + department);
        System.out.println("salary: " + salary);
    }

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {

    int teamSize;

    void manage() {
        System.out.println(name + " is managing a team of " + teamSize);
    }
}

class Developer extends Employee {

    String language;

    void code() {
        System.out.println(name + " is coding in " + language);
    }
}
