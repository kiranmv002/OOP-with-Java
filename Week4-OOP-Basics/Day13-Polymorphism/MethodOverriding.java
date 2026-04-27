// day 13 - method overriding
// child class redefines a method from parent class
// same method name and parameters
// this is runtime polymorphism

class Shape {

    void draw() {
        System.out.println("drawing a shape");
    }
}

class Circle extends Shape {

    // overriding parent method
    @Override
    void draw() {
        System.out.println("drawing a circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("drawing a rectangle");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw(); // calls Shape's draw

        Circle c = new Circle();
        c.draw(); // calls Circle's draw

        Rectangle r = new Rectangle();
        r.draw(); // calls Rectangle's draw
    }
}
