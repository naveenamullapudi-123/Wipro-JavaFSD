import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ravi", "Hyderabad", 50000));
        employees.add(new Employee(102, "Priya", "Chennai", 55000));
        employees.add(new Employee(103, "Kiran", "Bangalore", 60000));
        employees.add(new Employee(104, "Anu", "Pune", 45000));
        employees.add(new Employee(105, "Rahul", "Mumbai", 70000));

        // Function to extract location
        Function<Employee, String> getLocation = emp -> emp.location;

        ArrayList<String> locations = new ArrayList<>();

        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }

        System.out.println("Employee Locations:");
        for (String loc : locations) {
            System.out.println(loc);
        }
    }
}