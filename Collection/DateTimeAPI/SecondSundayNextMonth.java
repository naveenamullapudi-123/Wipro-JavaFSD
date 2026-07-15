import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSundayNextMonth {
    public static void main(String[] args) {

        // Get the first day of next month
        LocalDate firstDayNextMonth = LocalDate.now()
                                              .plusMonths(1)
                                              .withDayOfMonth(1);

        // Find the first Sunday of next month
        LocalDate firstSunday = firstDayNextMonth.with(
                TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));

        // Find the second Sunday
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Second Sunday of Next Month: " + secondSunday);
    }
}