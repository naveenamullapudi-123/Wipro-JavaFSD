import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {

        // Create ArrayList of Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ravi", 25, "Pune"));
        employees.add(new Employee(102, "Sita", 30, "Hyderabad"));
        employees.add(new Employee(103, "Amit", 28, "Pune"));
        employees.add(new Employee(104, "Neha", 26, "Chennai"));
        employees.add(new Employee(105, "Kiran", 29, "Pune"));

        // Filter employees whose location is Pune
        ArrayList<Employee> puneEmployees = employees.stream()
                .filter(e -> e.getLocation().equalsIgnoreCase("Pune"))
                .collect(Collectors.toCollection(ArrayList::new));

        // Print filtered employees
        System.out.println("Employees from Pune:");
        puneEmployees.forEach(System.out::println);
    }
}