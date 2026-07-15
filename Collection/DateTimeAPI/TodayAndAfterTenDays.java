import java.time.LocalDate;

public class TodayAndAfterTenDays {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Get the date after 10 days
        LocalDate afterTenDays = today.plusDays(10);

        // Display the dates
        System.out.println("Today's Date      : " + today);
        System.out.println("Date After 10 Days: " + afterTenDays);
    }
}