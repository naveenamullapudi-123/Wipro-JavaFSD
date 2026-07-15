import java.util.ArrayList;
import java.util.function.Consumer;

public class RevWordUpdate {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        // Adding 10 words
        words.add("Java");
        words.add("Python");
        words.add("Oracle");
        words.add("Apple");
        words.add("Laptop");
        words.add("Mobile");
        words.add("Mouse");
        words.add("Keyboard");
        words.add("Monitor");
        words.add("Internet");

        // Consumer to reverse each word and update the ArrayList
        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        // Apply Consumer
        reverseWords.accept(words);

        // Display updated ArrayList
        System.out.println("Reversed Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}