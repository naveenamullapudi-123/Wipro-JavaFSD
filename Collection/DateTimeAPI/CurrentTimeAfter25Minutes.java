import java.time.LocalTime;

public class CurrentTimeAfter25Minutes {
    public static void main(String[] args) {

        // Get current time
        LocalTime currentTime = LocalTime.now();

        // Add 25 minutes
        LocalTime timeAfter25Minutes = currentTime.plusMinutes(25);

        // Display the times
        System.out.println("Current Time         : " + currentTime);
        System.out.println("Time After 25 Minutes: " + timeAfter25Minutes);
    }
}