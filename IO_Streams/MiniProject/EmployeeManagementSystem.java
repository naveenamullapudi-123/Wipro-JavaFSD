import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {

    static final String FILE_NAME = "employee.dat";

    // Used for appending objects without writing header again
    static class AppendObjectOutputStream extends ObjectOutputStream {

        AppendObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        protected void writeStreamHeader() throws IOException {
            reset();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, age, salary);

                    try {

                        File file = new File(FILE_NAME);

                        ObjectOutputStream oos;

                        if (file.exists()) {
                            oos = new AppendObjectOutputStream(
                                    new FileOutputStream(file, true));
                        } else {
                            oos = new ObjectOutputStream(
                                    new FileOutputStream(file));
                        }

                        oos.writeObject(emp);
                        oos.close();

                        System.out.println("Employee Added Successfully.");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;

                case 2:

                    try {

                        File file = new File(FILE_NAME);

                        if (!file.exists()) {
                            System.out.println("No Employee Records Found.");
                            break;
                        }

                        ObjectInputStream ois =
                                new ObjectInputStream(new FileInputStream(file));

                        System.out.println("\n----- Report -----");

                        while (true) {
                            Employee e = (Employee) ois.readObject();
                            System.out.println(e);
                        }

                    } catch (EOFException e) {
                        System.out.println("----- End of Report -----");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 3:
                    System.out.println("Exiting the System");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}