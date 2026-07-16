import java.util.*;

class Card {
    char symbol;
    int number;

    Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Stores first occurrence of each symbol
        TreeMap<Character, Card> map = new TreeMap<>();

        int count = 0;

        while (map.size() < 4) {
            System.out.println("Enter a card");
            char symbol = sc.next().charAt(0);

            System.out.println("Enter a number");
            int number = sc.nextInt();

            count++;

            if (!map.containsKey(symbol)) {
                map.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are");

        for (Card c : map.values()) {
            System.out.println(c.symbol + " " + c.number);
        }

        sc.close();
    }
}