package com.mile1.test;

import com.mile1.main.*;

public class StudentReportTest {

    public static void main(String[] args) {

        StudentReport report = new StudentReport();

        // ---------- TC1: A Grade ----------
        try {
            Student s1 = new Student("Naveena", new int[]{90, 85, 88});
            System.out.println("TC1 Grade: " + report.findGrade(s1)); // A
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ---------- TC2: D Grade ----------
        try {
            Student s2 = new Student("Ravi", new int[]{45, 40, 42});
            System.out.println("TC2 Grade: " + report.findGrade(s2)); // D
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ---------- TC3: F Grade ----------
        try {
            Student s3 = new Student("Sita", new int[]{20, 25, 30});
            System.out.println("TC3 Grade: " + report.findGrade(s3)); // F
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ---------- TC4: Null Student Object ----------
        try {
            report.findGrade(null);
        } catch (Exception e) {
            System.out.println("TC4: " + e.getMessage());
        }

        // ---------- TC5: Null Name ----------
        try {
            Student s5 = new Student(null, new int[]{70, 75, 80});
            report.findGrade(s5);
        } catch (Exception e) {
            System.out.println("TC5: " + e.getMessage());
        }

        // ---------- TC6: Null Marks Array ----------
        try {
            Student s6 = new Student("Kiran", null);
            report.findGrade(s6);
        } catch (Exception e) {
            System.out.println("TC6: " + e.getMessage());
        }

        // ---------- TC7, TC8, TC9 ----------
        Student[] students = {
                new Student("A", new int[]{80, 90}),
                new Student(null, new int[]{70, 75}),
                null,
                new Student("B", null),
                new Student(null, null)
        };

        System.out.println("TC7 Null Names: " + report.findNumberOfNullName(students));
        System.out.println("TC8 Null Objects: " + report.findNumberOfNullObjects(students));
        System.out.println("TC9 Null Marks: " + report.findNumberOfNullMarks(students));
    }
}