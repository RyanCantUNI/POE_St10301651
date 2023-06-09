package poefirst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author lab_services_student
 */
public class POE {

    public static void main(String[] args) {
        Task task = new Task();
        List<TaskDetails> taskList = new ArrayList<>();

        Login login = new Login();
//Declaring a new Scanner 
        Scanner scan = new Scanner(System.in);
        //Displaying the registeration login feature
        System.out.println("--Registeration--");

// Prompt user to enter their first name
        System.out.println("Enter firstname: ");
        String firstname = scan.nextLine();
// Prompt user to enter their last name
        System.out.println("Enter lastname: ");
        String lastname = scan.nextLine();
// Prompt user to enter their desired username
        System.out.println("Enter username: ");
        String username = scan.nextLine();
//creating a boolean to validate the username
        boolean validateUserName = login.checkUserName(username);
//Prompting the user for their password
        System.out.println("Enter password: ");
        String password = scan.nextLine();
//Declaring a new boolean to validate the password created. it has to meet the conditions before proceeding. 
        boolean validatePassword = login.checkPasswordComplexity(password);

        // This method validates the users details
        String registerAccount = login.registerUser(validateUserName, validatePassword);
        System.out.println(registerAccount);

        // If the users username or password is invalid, then the system exit
        if (!validateUserName || !validatePassword) {
            System.out.println("Please try again.");
            System.exit(0);
        }

        //declaring a new scanner 
        Scanner logScan = new Scanner(System.in);
        System.out.println("--Login--");

        //prompting user for username 
        System.out.println("Enter username: ");
        String loginUsername = logScan.nextLine();

        //prompting user for password
        System.out.println("Enter password: ");
        String loginPassword = logScan.nextLine();

        boolean loginStatus = login.loginUser(loginUsername, loginPassword, username, password);
        String loginMessage = login.returnLoginStatus(loginStatus, firstname, lastname);
        System.out.println(loginMessage);
        
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Welcome to EasyKhanban");//move to the top of app

        //menu
        String[] menu = {"Add Tasks", "Show Tasks", "Quit"};
        String[] statuses = {"To Do", "Done", "Doing"};
        int option = 3;
        while (option <= 3) {
            option = JOptionPane.showOptionDialog(frame, "Choose an option: ", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, menu, menu[0]);//creating a switch value 
            switch (option) {
                //Add tasks
                case 0:
                    String taskNumber = JOptionPane.showInputDialog(null, "Enter number of tasks: ",
                            null, JOptionPane.PLAIN_MESSAGE);
                    if (taskNumber == null) {
                        break;
                    }
                    //converting the string value to integer 
                    int parseTaskNumber = Integer.parseInt(taskNumber);

                    int count = 0;
                    while (count < Integer.parseInt(taskNumber)) {
                        String taskName = JOptionPane.showInputDialog(frame, "Enter task name: ");
                        JTextArea textArea = new JTextArea(10, 10);
                        if (taskName == null) {
                            break;
                        }
                        
                        String taskDescription = JOptionPane.showInputDialog(textArea,
                                "Enter task description: ");
                        if (taskDescription == null) {
                            break;
                        }//trying to make task description perfect 
                        int taskDescr = taskDescription.length();
                        boolean checked = task.checkTaskDescription(taskDescr);
                        if (!checked) {
                            while (taskDescr > 50) {

                                taskDescription = JOptionPane.showInputDialog(textArea,
                                        "Enter task description: ");
                                if (taskDescription == null) {
                                    break;
                                }
                                taskDescr = taskDescription.length();
                                task.checkTaskDescription(taskDescr);
                            }
                        }
                        //creating a method for developer name 
                        String devName = JOptionPane.showInputDialog(frame, "Enter developer first and lastname: ");
                        if (devName == null) {
                            break;
                        }
                        String taskDuration = JOptionPane.showInputDialog(frame, "Enter number of hours it will take to complete: ");
                        if (taskDuration == null) {
                            break;
                        }
                        int taskDurationInt = Integer.parseInt(taskDuration);
                        //overriding developer name to dlength 
                        int dLength = devName.length();
                        String taskID = task.createTaskID(taskName, taskDescr, devName, dLength);

                        // Drop down menu
                        String status = (String) JOptionPane.showInputDialog(null, "Choose the Status: ", "Menu",
                                JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);
                        if (status == null) {
                            break;
                        }
                        //Creating a new task and assigning task details
                        TaskDetails taskDetails = new TaskDetails(
                                taskName,
                                parseTaskNumber,
                                taskDescription,
                                devName,
                                taskDurationInt,
                                taskID,
                                status);//adding current task detaisl to task array list
                        taskList.add(taskDetails);
                        //show message 
                        JOptionPane.showMessageDialog(frame, "Task added", "Captured", JOptionPane.INFORMATION_MESSAGE);

                        count = count + 1;

                    }//calling and passing task details 
                    String taskDisplay = task.printTaskDetails(taskList);
                    JOptionPane.showMessageDialog(null, taskDisplay + "\nTotal Duration: " + task.returnTotalHours(taskList)+" hours", "Task Details", JOptionPane.INFORMATION_MESSAGE);
                    break;

                //show tasks
                case 1:
                    JOptionPane.showMessageDialog(frame, "Coming Soon", "Show Report", JOptionPane.INFORMATION_MESSAGE);
                    break;
                //Quit
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;

            }
        }
        

    }

}
