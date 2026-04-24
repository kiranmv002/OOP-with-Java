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

class Bike extends Vehicle {

    boolean hasGear;

    void wheelie() {
        System.out.println(brand + " doing a wheelie!");
    }
}

class VehicleMain {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.brand = "toyota";
        car.speed = 120;
        car.doors = 4;
        car.start();
        car.honk();
        car.stop();

        System.out.println();

        Bike bike = new Bike();
        bike.brand = "yamaha";
        bike.speed = 100;
        bike.hasGear = true;
        bike.start();
        bike.wheelie();
        bike.stop();
    }
}
