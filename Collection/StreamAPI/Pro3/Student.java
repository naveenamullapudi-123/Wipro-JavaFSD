public class Student {
    private int rollNo;
    private String name;
    private int mark;

    // Parameterized Constructor
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }
}