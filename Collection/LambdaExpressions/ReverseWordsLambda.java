import java.util.ArrayList;

public class ReverseWordsLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        // Add 10 different words
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Cherry");
        al.add("Pineapple");
        al.add("Papaya");
        al.add("Guava");
        al.add("Watermelon");

        System.out.println("Original List:");
        System.out.println(al);

        System.out.println("\nStrings in Reverse Order:");

        // Print in reverse order using lambda expression
        for (int i = al.size() - 1; i >= 0; i--) {
            final int index = i;
            java.util.stream.Stream.of(al.get(index))
                    .forEach(word -> System.out.println(word));
        }
    }
}