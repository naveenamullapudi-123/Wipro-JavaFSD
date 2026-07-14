public class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    // Constructor
    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Display Employee Details
    public void getEmployeeDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email         : " + email);
        System.out.println("Gender        : " + gender);
        System.out.println("Salary        : " + salary);
        System.out.println("------------------------------");
    }
}