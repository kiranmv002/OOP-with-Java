// day 15 - multiple interfaces
// java doesnt support multiple inheritance with classes
// but a class can implement multiple interfaces
// this is how java handles multiple inheritance

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Runnable2 {
    void run();
}

// duck can fly, swim and run
class Duck implements Flyable, Swimmable, Runnable2 {

    String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Duck d = new Duck("donald");
        d.fly();
        d.swim();
        d.run();
    }
}
