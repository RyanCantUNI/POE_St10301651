/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poefirst;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author ADMIN
 */
public class TaskTest {

    public TaskTest() {
    }

    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");

        int taskDescription = 49;
        Task instance = new Task();
        boolean result = instance.checkTaskDescription(taskDescription);
        if (result == true) {
            assertTrue(result);
        } else {
            assertFalse(result);
        }

    }

    @Test
    public void testCheckTaskDescriptionFailure() {
        System.out.println("checkTaskDescription");

        int taskDescription = 51;
        Task instance = new Task();
        boolean result = instance.checkTaskDescription(taskDescription);
        if (result == false) {
            assertFalse(result);
        } else {
            assertTrue(result);
        }

    }

    @Test
    public void testCreateTaskID() {
        System.out.println("TaskID");
        //AD:1:BYN

        String taskName = "Adele";
        int taskNumber = 1;
        String devName = "John Stbyn";
        int dLength = 10;

        Task instance = new Task();
        String expResult = "AD:1:BYN";
        String result = instance.createTaskID(taskName, taskNumber, devName, dLength);
        if (expResult.equals(result)) {
            assertTrue(true);
        } else {
            assertFalse(false);
        }

    }


    @Test
    public void testPrintTaskDetails() {
    }

    @Test
    public void testReturnTotalHours() {
    }

}
