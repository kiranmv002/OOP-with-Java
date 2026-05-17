// day 17 - hashmap
// hashmap stores key value pairs
// like a dictionary — word is key, meaning is value
// keys are unique, values can repeat

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        // adding key value pairs
        marks.put("kiran", 85);
        marks.put("rahul", 92);
        marks.put("priya", 78);
        marks.put("arjun", 88);

        System.out.println("all marks: " + marks);
        System.out.println("kiran's marks: " + marks.get("kiran"));
        System.out.println("size: " + marks.size());

        // check if key exists
        System.out.println("has rahul: " + marks.containsKey("rahul"));

        // update value
        marks.put("kiran", 90); // updates existing key
        System.out.println("kiran updated: " + marks.get("kiran"));

        // remove a key
        marks.remove("arjun");
        System.out.println("after remove: " + marks);

        // loop through hashmap
        System.out.println("looping:");
        for (String name : marks.keySet()) {
            System.out.println(name + " -> " + marks.get(name));
        }
    }
}
