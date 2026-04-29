// day 14 - abstraction
// abstract class cant be instantiated directly
// abstract method has no body, child must implement it
// hiding complexity and showing only what is needed

abstract class Shape2 {

    String color;

    // abstract method - no body here
    // child class must provide the body
    abstract double area();

    // normal method - child inherits this
    void display() {
        System.out.println("color: " + color);
        System.out.println("area: " + area());
    }
}

class Circle2 extends Shape2 {

    double radius;

    Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle2 extends Shape2 {

    double length, width;

    Rectangle2(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Circle2 c = new Circle2(5, "red");
        c.display();

        System.out.println();

        Rectangle2 r = new Rectangle2(4, 6, "blue");
        r.display();
    }
}
