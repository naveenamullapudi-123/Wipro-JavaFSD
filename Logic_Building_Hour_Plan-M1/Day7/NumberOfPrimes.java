import java.util.Scanner;

public class NumberOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i < 2)
                continue;

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                count++;
        }

        System.out.println(count);
    }
}