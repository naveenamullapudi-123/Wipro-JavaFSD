package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks task = new DailyTasks();

        String str = "Wipro TalentNext";

        assertTrue(task.checkPresence(str, "Talent"));

        assertFalse(task.checkPresence(str, "Java"));
    }
}