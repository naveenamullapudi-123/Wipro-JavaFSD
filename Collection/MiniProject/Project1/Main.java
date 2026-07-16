import java.util.*;

class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    @Override
    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %-30s %-15s",
                firstName, lastName, mobile, email, address);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Employees");
        int n = Integer.parseInt(sc.nextLine());

        TreeSet<Employee> employees = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Employee " + i + " Details");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            employees.add(new Employee(firstName, lastName, mobile, email, address));
        }

        System.out.println("\nEmployee List");
        System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}