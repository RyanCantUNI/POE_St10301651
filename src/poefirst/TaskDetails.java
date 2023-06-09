/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poefirst;

/**
 *
 * @author ADMIN
 */
public class TaskDetails {
    //declaring a variable 
    String taskName;
    int taskNumber;
    String taskDescription;
    String developerDetails;
    int taskDuration;
    String taskID;
    String taskStatus;
//creating task details 
    public TaskDetails(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskID, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskID = taskID;
        this.taskStatus = taskStatus;
    }
//creating a contructor 
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    //overriding tostring to display required format
     @Override
    public String toString() {
        return  "Task Status: "+taskStatus+
                "\nDeveloper Details: "+ developerDetails+
                "\nTask Number: "+taskNumber+
                "\nTask Name: "+taskName+
                "\nTask Description: "+taskDescription+
                "\nTask ID: "+taskID+
                "\nTask Duration: "+taskDuration+"hours\n";
                
                 
        
                
    }
}
