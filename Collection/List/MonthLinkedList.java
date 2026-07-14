import java.util.LinkedList;

public class MonthLinkedList {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> months = new LinkedList<>();

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