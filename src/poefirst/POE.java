package poefirst;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class POE {

    public static void main(String[] args) {
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
    }

}
