// day 13 - runtime polymorphism
// parent reference pointing to child object
// java decides at runtime which method to call
// this was a bit confusing at first but makes sense now

class Animal2 {
    void sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("dog says woof");
    }
}

class Cat2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("cat says meow");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // parent reference, child object
        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat2();

        a1.sound(); // calls Dog's sound
        a2.sound(); // calls Cat's sound
    }
}
