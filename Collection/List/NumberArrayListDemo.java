import java.util.ArrayList;

public class NumberArrayListDemo {
    public static void main(String[] args) {

        // ArrayList that stores only Number objects
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(100);        // Integer
        numbers.add(25.5f);      // Float
        numbers.add(99.99);      // Double
        numbers.add(123456789L); // Long
        numbers.add((short)50);  // Short
        numbers.add((byte)10);   // Byte

        System.out.println("Numbers in the ArrayList:");

        for (Number n : numbers) {
            System.out.println(n);
        }

        // numbers.add("Java"); // Compile-time Error
    }
}