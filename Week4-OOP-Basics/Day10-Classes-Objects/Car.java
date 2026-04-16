// day 10 - car class
// another real world example
// car has attributes like brand, speed
// and methods like accelerate and brake

public class Car {

    String brand;
    String color;
    int speed;

    void accelerate(int amount) {
        speed = speed + amount;
        System.out.println(brand + " speed increased to " + speed);
    }

    void brake(int amount) {
        if (speed - amount < 0) {
            speed = 0;
        } else {
            speed = speed - amount;
        }
        System.out.println(brand + " speed reduced to " + speed);
    }

    void display() {
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("speed: " + speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "toyota";
        c1.color = "red";
        c1.speed = 0;

        c1.display();
        System.out.println();
        c1.accelerate(50);
        c1.accelerate(30);
        c1.brake(20);
    }
}
