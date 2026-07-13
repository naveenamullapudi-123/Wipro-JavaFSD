import java.util.Scanner;

public class UniqueDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        num = Math.abs(num);

        boolean[] visited = new boolean[10];

        if (num == 0)
            visited[0] = true;

        while (num > 0) {
            int digit = (int)(num % 10);
            visited[digit] = true;
            num /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (visited[i])
                count++;
        }

        System.out.println(count);
    }
}