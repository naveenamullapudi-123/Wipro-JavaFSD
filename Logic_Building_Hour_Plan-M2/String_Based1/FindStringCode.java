import java.util.*;

public class FindStringCode {

    public static int findStringCode(String input) {

        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {

            char first = Character.toUpperCase(word.charAt(0));
            char last = Character.toUpperCase(word.charAt(word.length() - 1));

            result += Math.abs(first - last);
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {

        String input = "Wipro Limited";
        System.out.println(findStringCode(input));
    }
}