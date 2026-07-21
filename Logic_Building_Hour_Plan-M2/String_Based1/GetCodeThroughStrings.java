import java.util.*;

public class GetCodeThroughStrings {

    public static String getCode(String input) {

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (char ch : input.toCharArray()) {

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digit++;
            else
                special++;
        }

        return upper + "" + lower + digit + special;
    }

    public static void main(String[] args) {

        String input = "Wipro@123";
        System.out.println(getCode(input));
    }
}