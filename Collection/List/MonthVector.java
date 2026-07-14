import java.util.Vector;

public class MonthVector {
    public static void main(String[] args) {

        // Create a Vector
        Vector<String> months = new Vector<>();

        // Add all months
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print all months
        System.out.println("Months of the Year:");

        for (String month : months) {
            System.out.println(month);
        }
    }
}