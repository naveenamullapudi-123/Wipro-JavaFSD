public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        // Constructor Reference
        PrimeInterface pi = PrimeCheck::new;

        // Invoke constructor
        pi.checkPrime(17);
        pi.checkPrime(20);
    }
}