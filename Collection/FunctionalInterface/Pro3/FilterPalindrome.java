import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterPalindrome {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        // Adding 10 words
        words.add("madam");
        words.add("hello");
        words.add("level");
        words.add("java");
        words.add("radar");
        words.add("apple");
        words.add("noon");
        words.add("world");
        words.add("refer");
        words.add("chat");

        // Predicate to check palindrome
        Predicate<String> isPalindrome = str -> {
            String rev = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(rev);
        };

        System.out.println("Palindrome Words:");

        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}