// day 9 - strings
// string is a sequence of characters
// lots of built in methods available in java for strings
// strings are immutable - cant be changed once created

public class Strings {
    public static void main(String[] args) {
        String name = "kiran";

        // useful string methods
        System.out.println("length: " + name.length());
        System.out.println("uppercase: " + name.toUpperCase());
        System.out.println("lowercase: " + name.toLowerCase());
        System.out.println("first char: " + name.charAt(0));
        System.out.println("contains 'ran': " + name.contains("ran"));
        System.out.println("replace: " + name.replace("kiran", "java"));
        System.out.println("trim: " + "  hello  ".trim());

        // comparing strings
        String a = "hello";
        String b = "hello";
        System.out.println("equals: " + a.equals(b)); // use equals not ==
    }
}
