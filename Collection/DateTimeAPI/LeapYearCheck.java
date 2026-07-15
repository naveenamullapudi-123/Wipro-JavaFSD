import java.time.Year;

public class LeapYearCheck {
    public static void main(String[] args) {

        // Get the current year
        int currentYear = Year.now().getValue();

        // Check whether it is a leap year
        if (Year.isLeap(currentYear)) {
            System.out.println(currentYear + " is a Leap Year.");
        } else {
            System.out.println(currentYear + " is Not a Leap Year.");
        }
    }
}