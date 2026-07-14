import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayListDemo {

    // Method to print all elements using Iterator
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        // Create an ArrayList that stores only Strings
        ArrayList<String> list = new ArrayList<>();

        // Add String elements
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");

        // Print all elements
        System.out.println("Elements in the ArrayList:");
        printAll(list);
    }
}