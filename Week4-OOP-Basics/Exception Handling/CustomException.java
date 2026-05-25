// day 18 - custom exception
// we can create our own exception class
// extend Exception class to create custom one
// useful when we want specific error messages

// custom exception class
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class CustomException {

    // method that throws custom exception
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("age " + age + " is too young, must be 18+");
        } else {
            System.out.println("age " + age + " is valid!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(20); // valid
            checkAge(15); // throws exception
        } catch (AgeException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}
