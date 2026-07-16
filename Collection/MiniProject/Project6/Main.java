import java.util.*;

public class Main {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> result = new ArrayList<>();

        // 1. Replace alternate characters of S1 with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());

        // 2. Replace last occurrence of S2 with reverse(S2), else S1+S2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);
        if (first != -1 && first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            result.add(op2);
        } else {
            result.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2 if it appears more than once
        if (first != -1 && first != last) {
            String op3 = s1.substring(0, first) + s1.substring(first + s2.length());
            result.add(op3);
        } else {
            result.add(s1);
        }

        // 4. Divide S2 and add to beginning and end of S1
        int mid = (s2.length() + 1) / 2;
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);
        result.add(firstHalf + s1 + secondHalf);

        // 5. Replace characters in S1 that are present in S2 with '*'
        StringBuilder op5 = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1)
                op5.append('*');
            else
                op5.append(ch);
        }
        result.add(op5.toString());

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter S1:");
        String s1 = sc.nextLine();

        System.out.println("Enter S2:");
        String s2 = sc.nextLine();

        ArrayList<String> list = performOperations(s1, s2);

        System.out.println("Output:");
        for (String s : list) {
            System.out.println(s);
        }

        sc.close();
    }
}