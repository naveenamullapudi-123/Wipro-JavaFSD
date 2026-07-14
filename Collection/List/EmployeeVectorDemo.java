import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class EmployeeVectorDemo {

    public static void main(String[] args) {

        // Create a Vector to store Employee objects
        Vector<Employee1> employees = new Vector<>();

        // Add Employee objects
        employees.add(new Employee1(101, "Pavan", 50000));
        employees.add(new Employee1(102, "Rahul", 45000));
        employees.add(new Employee1(103, "Priya", 55000));

        // Display using Iterator
        System.out.println("Using Iterator:");
        Iterator<Employee1> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Employee1 emp = iterator.next();
            emp.display();
        }

        // Display using Enumeration
        System.out.println("Using Enumeration:");
        Enumeration<Employee1> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {
            Employee1 emp = enumeration.nextElement();
            emp.display();
        }
    }
}