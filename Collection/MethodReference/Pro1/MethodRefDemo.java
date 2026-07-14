public class MethodRefDemo {

    public static void main(String[] args) {

        // Create object
        FactorialClass obj = new FactorialClass();

        // Method Reference to instance method
        FactorialInterface fi = obj::factorial;

        int num = 5;
        int result = fi.calculate(num);

        System.out.println("Factorial of " + num + " = " + result);
    }
}