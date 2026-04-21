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

// Dog inherits from Animal
class Dog extends Animal {

    String breed;

    void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

// Cat inherits from Animal
class Cat extends Animal {

    void purr() {
        System.out.println(name + " is purring");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "tommy";
        d.sound = "woof";
        d.breed = "labrador";
        d.eat();        // inherited from Animal
        d.makeSound();  // inherited from Animal
        d.fetch();      // Dog's own method

        System.out.println();

        Cat c = new Cat();
        c.name = "kitty";
        c.sound = "meow";
        c.eat();        // inherited from Animal
        c.makeSound();  // inherited from Animal
        c.purr();       // Cat's own method
    }
}
