import java.util.*;

public class MostFrequentlyOccurringDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        int count[] = new int[10];

        for(int i=0;i<num.length();i++) {

            char ch = num.charAt(i);

            count[ch-'0']++;
        }

        int max = 0;
        int digit = 0;

        for(int i=0;i<10;i++) {

            if(count[i] > max) {
                max = count[i];
                digit = i;
            }
        }

        System.out.println(digit);
    }
}