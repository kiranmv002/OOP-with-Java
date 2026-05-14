// day 16 - arraylist
// arraylist is like an array but size can grow and shrink
// no need to define size at start
// part of java collections framework

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // adding elements
        names.add("kiran");
        names.add("rahul");
        names.add("priya");
        names.add("arjun");

        System.out.println("list: " + names);
        System.out.println("size: " + names.size());
        System.out.println("first: " + names.get(0));

        // remove by value
        names.remove("rahul");
        System.out.println("after remove: " + names);

        // check if exists
        System.out.println("has kiran: " + names.contains("kiran"));

        // loop through
        System.out.println("looping:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
