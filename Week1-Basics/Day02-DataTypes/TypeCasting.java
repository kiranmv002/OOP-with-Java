// day 2 - typecasting
// converting one type to another
// widening = small to big (automatic)
// narrowing = big to small (manual, data loss happens)

public class TypeCasting {
    public static void main(String[] args) {
        // automatic - no need to do anything
        int num = 100;
        double d = num;
        System.out.println("int to double: " + d); // 100.0

        // manual - we force it using (int)
        double price = 9.99;
        int p = (int) price; // .99 is lost
        System.out.println("double to int: " + p); // 9
    }
}
