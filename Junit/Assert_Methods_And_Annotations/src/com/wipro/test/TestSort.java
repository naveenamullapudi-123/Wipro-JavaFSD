package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks task = new DailyTasks();

        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, task.sortValues(input));
    }
}