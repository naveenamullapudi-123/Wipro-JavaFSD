import java.util.ArrayList;
import java.util.function.Consumer;

public class OddOrEven {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding 10 numbers
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(37);
        numbers.add(44);
        numbers.add(59);
        numbers.add(68);
        numbers.add(73);
        numbers.add(80);
        numbers.add(95);

        // Consumer to display odd/even
        Consumer<Integer> checkOddEven = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        // Apply Consumer to each element
        numbers.forEach(checkOddEven);
    }
}