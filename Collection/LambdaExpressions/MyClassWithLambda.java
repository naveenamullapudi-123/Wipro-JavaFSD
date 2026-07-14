// Functional Interface
interface WordCount {
    int count(String str);
}

// Main Class
public class MyClassWithLambda {

    public static void main(String[] args) {

        // Lambda Expression
        WordCount wc = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            return str.trim().split("\\s+").length;
        };

        String text = "Java is a powerful programming language";

        System.out.println("String: " + text);
        System.out.println("Number of Words: " + wc.count(text));
    }
}