import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        // Create a HashSet to store employee names
        HashSet<String> employees = new HashSet<>();

        // Add employee names
        employees.add("Pavan");
        employees.add("Rahul");
        employees.add("Anitha");
        employees.add("Kiran");
        employees.add("Priya");

        // Retrieve elements using Iterator
        System.out.println("Employee Names:");

        Iterator<String> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}