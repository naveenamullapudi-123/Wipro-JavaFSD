import java.util.ArrayList;

public class OddLengthStrings {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        // Add 10 different words
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Cherry");
        al.add("Papaya");
        al.add("Guava");
        al.add("Kiwi");
        al.add("Watermelon");

        System.out.println("ArrayList Elements:");
        System.out.println(al);

        System.out.println("\nStrings with Odd Length:");

        // Lambda expression
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}