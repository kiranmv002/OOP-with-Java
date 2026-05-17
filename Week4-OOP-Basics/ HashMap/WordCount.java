// day 17 - word count using hashmap
// counting how many times each word appears
// if word already in map, increase count
// if not, add it with count 1

import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) {
        String sentence = "java is fun java is easy java";
        String[] words = sentence.split(" "); // split by space

        HashMap<String, Integer> count = new HashMap<>();

        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1); // increase count
            } else {
                count.put(word, 1); // first time seeing this word
            }
        }

        System.out.println("word count: " + count);
    }
}
