import java.util.Scanner;

public class NonRepDigCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        num = Math.abs(num);

        int[] freq = new int[10];

        if (num == 0)
            freq[0]++;

        while (num > 0) {
            int digit = (int)(num % 10);
            freq[digit]++;
            num /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1)
                count++;
        }

        System.out.println(count);
    }
}