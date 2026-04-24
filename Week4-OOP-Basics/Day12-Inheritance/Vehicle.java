// day 12 - vehicle inheritance
// Vehicle is parent class
// Car and Bike are child classes
// child classes inherit start() and stop() from Vehicle
// and have their own methods too

public class Vehicle {

    String brand;
    int speed;

    void start() {
        System.out.println(brand + " started");
    }

    void stop() {
        System.out.println(brand + " stopped");
    }
}

class Car2 extends Vehicle {

    int doors;

    void honk() {
        System.out.println(brand + " is honking");
    }
}

