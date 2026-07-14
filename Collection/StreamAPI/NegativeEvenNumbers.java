import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(-2);
        numbers.add(5);
        numbers.add(-8);
        numbers.add(7);
        numbers.add(-11);
        numbers.add(-14);
        numbers.add(20);
        numbers.add(-6);

        // Filter negative even numbers and store in new ArrayList
        ArrayList<Integer> result = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        // Print the new ArrayList
        System.out.println("Negative Even Numbers:");
        result.forEach(System.out::println);
    }
}