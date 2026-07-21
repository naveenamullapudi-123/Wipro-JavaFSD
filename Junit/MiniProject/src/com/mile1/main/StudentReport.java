package com.mile1.main;

public class StudentReport {

    // Validate student object
    public void validate(Student s)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (s == null) {
            throw new NullStudentException();
        }

        if (s.name == null) {
            throw new NullNameException();
        }

        if (s.marks == null) {
            throw new NullMarksArrayException();
        }
    }

    // Calculate grade
    public String findGrade(Student s)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        validate(s);

        int sum = 0;
        for (int mark : s.marks) {
            sum += mark;
        }

        int avg = sum / s.marks.length;

        if (avg >= 80) {
            return "A";
        } else if (avg >= 60) {
            return "B";
        } else if (avg >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // TC7: Count students with null names
    public int findNumberOfNullName(Student[] students) {
        int count = 0;

        for (Student s : students) {
            if (s != null && s.name == null) {
                count++;
            }
        }

        return count;
    }

    // TC8: Count null student objects
    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;

        for (Student s : students) {
            if (s == null) {
                count++;
            }
        }

        return count;
    }

    // TC9: Count students with null marks array
    public int findNumberOfNullMarks(Student[] students) {
        int count = 0;

        for (Student s : students) {
            if (s != null && s.marks == null) {
                count++;
            }
        }

        return count;
    }
}