public class Employee {
    private int empNo;
    private String name;
    private int age;
    private String location;

    // Parameterized Constructor
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee No: " + empNo +
               ", Name: " + name +
               ", Age: " + age +
               ", Location: " + location;
    }
}