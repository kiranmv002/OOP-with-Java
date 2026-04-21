// day 12 - inheritance
// inheritance = child class gets all properties of parent class
// avoids writing same code again
// extends keyword is used for inheritance
// parent class = Animal, child classes = Dog, Cat

public class Animal {

    String name;
    String sound;

    // parent class method
    void eat() {
        System.out.println(name + " is eating");
    }

    void makeSound() {
        System.out.println(name + " says " + sound);
    }
}

