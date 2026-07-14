import java.util.ArrayList;
import java.util.Random;

public class PrimeLambda {

    // Method to check whether a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();

        // Add 25 random numbers (1 to 100)
        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1);
        }

        System.out.println("ArrayList Elements:");
        System.out.println(al);

        System.out.println("\nPrime Numbers:");
        al.forEach(num -> {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        });
    }
}