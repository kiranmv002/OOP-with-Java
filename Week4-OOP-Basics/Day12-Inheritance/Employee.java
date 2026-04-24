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

class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "kiran";
        m.salary = 80000;
        m.department = "engineering";
        m.teamSize = 10;
        m.displayInfo();
        m.manage();

        System.out.println();

        Developer d = new Developer();
        d.name = "rahul";
        d.salary = 60000;
        d.department = "engineering";
        d.language = "java";
        d.displayInfo();
        d.code();
    }
}
