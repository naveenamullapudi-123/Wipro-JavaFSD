import java.util.Scanner;

public class AllDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        if (num == 0) {
            System.out.println(1);
            return;
        }

        num = Math.abs(num);

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println(count);
    }
}