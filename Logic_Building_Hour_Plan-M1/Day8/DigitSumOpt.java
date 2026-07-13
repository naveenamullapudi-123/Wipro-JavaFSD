import java.util.Scanner;

public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char choice = sc.next().charAt(0);

        num = Math.abs(num);

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if ((choice == 'E' || choice == 'e') && digit % 2 == 0) {
                sum += digit;
            } else if ((choice == 'O' || choice == 'o') && digit % 2 != 0) {
                sum += digit;
            }

            num /= 10;
        }

        System.out.println(sum);
    }
}