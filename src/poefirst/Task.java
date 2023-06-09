package poefirst;

import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author ADMIN
 */
public class Task {
    //chech task description 
    public boolean checkTaskDescription(int taskDescription) {
        if (taskDescription > 50) {//showing error message if the condition was not met 
            JOptionPane.showMessageDialog(null, """
                                                Please enter a task description of less than 
                                                50 characters""");

            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Task successfully captured");
            return true;
        }
    }
    //creting the task id method
    public String createTaskID(String taskName, int taskNumber, String devName, int dLength) {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + devName.substring(dLength - 3).toUpperCase();
        return taskID;

    }
    
    //print task details
    public String printTaskDetails(List<TaskDetails> taskList) 
    {
     StringBuilder details = new StringBuilder();
        details.append("Task Details:\n\n");
        for (var item : taskList) {
            details.append(item).append("\n");
        }

        //returning the details 
        return details.toString();

    }
//calculating a total hours 
    public int returnTotalHours(List<TaskDetails> taskList){
        int finalDuration = 0;
        for (var item : taskList) {
           finalDuration += item.getTaskDuration();
            
        }
        return finalDuration;
    }
    
}
