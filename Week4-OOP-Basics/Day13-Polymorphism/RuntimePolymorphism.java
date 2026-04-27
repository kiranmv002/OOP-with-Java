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
