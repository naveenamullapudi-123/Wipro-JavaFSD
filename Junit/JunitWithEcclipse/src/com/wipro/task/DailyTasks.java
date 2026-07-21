package com.wipro.task;

import java.util.Arrays;

public class DailyTasks {

    // Method to concatenate two strings
    public String doStringConcat(String str1, String str2) {
        return str1 + " " + str2;
    }

    // Method to sort an integer array
    public int[] sortValues(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // Method to check whether a string is present
    public boolean checkPresence(String str, String search) {
        return str.contains(search);
    }

    // Optional: Main method for testing
    public static void main(String[] args) {

        DailyTasks obj = new DailyTasks();

        // String Concatenation
        System.out.println("Concatenated String: "
                + obj.doStringConcat("Hello", "World"));

        // Array Sorting
        int[] numbers = {5, 3, 1, 4, 2};
        int[] sorted = obj.sortValues(numbers);

        System.out.print("Sorted Array: ");
        for (int n : sorted) {
            System.out.print(n + " ");
        }

        System.out.println();

        // Check Presence
        System.out.println("Contains 'Tech': "
                + obj.checkPresence("Wipro Technologies", "Tech"));

        System.out.println("Contains 'Java': "
                + obj.checkPresence("Wipro Technologies", "Java"));
    }
}