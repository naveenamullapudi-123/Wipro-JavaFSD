import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ravi", 8000));
        employees.add(new Employee(102, "Priya", 12000));
        employees.add(new Employee(103, "Kiran", 9500));
        employees.add(new Employee(104, "Anu", 15000));
        employees.add(new Employee(105, "Rahul", 7000));

        // Predicate to check salary less than 10000
        Predicate<Employee> lowSalary = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        for (Employee emp : employees) {
            if (lowSalary.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}