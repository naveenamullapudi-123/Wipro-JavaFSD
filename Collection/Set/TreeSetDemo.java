import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

    public static void main(String[] args) {

        // Create a TreeSet to store String objects
        TreeSet<String> names = new TreeSet<>();

        // Add elements
        names.add("India");
        names.add("Japan");
        names.add("USA");
        names.add("Australia");
        names.add("Canada");

        // a) Reverse the elements of the Collection
        System.out.println("Elements in Reverse Order:");
        System.out.println(names.descendingSet());

        // b) Iterate the elements using Iterator
        System.out.println("\nElements using Iterator:");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if a particular element exists or not
        String search = "India";

        if (names.contains(search)) {
            System.out.println("\n" + search + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + search + " does not exist in the TreeSet.");
        }
    }
}