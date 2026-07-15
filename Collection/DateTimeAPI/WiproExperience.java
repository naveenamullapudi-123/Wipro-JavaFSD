import java.time.LocalDate;
import java.time.Period;

public class WiproExperience {
    public static void main(String[] args) {

        // Joining date (change this to your joining date)
        LocalDate joiningDate = LocalDate.of(2022, 6, 15);

        // Today's date
        LocalDate today = LocalDate.now();

        // Calculate experience
        Period experience = Period.between(joiningDate, today);

        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Today's Date : " + today);
        System.out.println("Experience   : "
                + experience.getYears() + " Years, "
                + experience.getMonths() + " Months, "
                + experience.getDays() + " Days");
    }
}