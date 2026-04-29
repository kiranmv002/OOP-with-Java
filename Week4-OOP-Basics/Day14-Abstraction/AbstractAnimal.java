// day 14 - abstract animal
// every animal eats and sleeps - defined in abstract class
// but every animal makes different sound - abstract method
// child must define their own sound

abstract class Animal3 {

    String name;

    // abstract - every animal has different sound
    abstract void sound();

    // concrete - all animals eat and sleep
    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog3 extends Animal3 {

    Dog3(String name) {
        this.name = name;
    }

    @Override
    void sound() {
        System.out.println(name + " says woof!");
    }
}

class Cat3 extends Animal3 {

    Cat3(String name) {
        this.name = name;
    }

    @Override
    void sound() {
        System.out.println(name + " says meow!");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Dog3 d = new Dog3("tommy");
        d.sound();
        d.eat();
        d.sleep();

        System.out.println();

        Cat3 c = new Cat3("kitty");
        c.sound();
        c.eat();
    }
}
