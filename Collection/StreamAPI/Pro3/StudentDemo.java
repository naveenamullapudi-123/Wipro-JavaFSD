import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {

        // Create ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Ravi", 75));
        students.add(new Student(102, "Sita", 45));
        students.add(new Student(103, "Amit", 60));
        students.add(new Student(104, "Neha", 38));
        students.add(new Student(105, "Kiran", 50));

        // Count students who scored 50 or more
        long count = students.stream()
                .filter(s -> s.getMark() >= 50)
                .count();

        // Print count
        System.out.println("Number of students who cleared the test: " + count);
    }
}