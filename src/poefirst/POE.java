package poefirst;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Poee {

    public static void main(String[] args) {
        Login login = new Login();

        Scanner scan = new Scanner(System.in);
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
        boolean validateUserName = login.checkUserName(username);

        System.out.println("Enter password: ");
        String password = scan.nextLine();
        boolean validatePassword = login.checkPasswordComplexity(password);

        String registerAccount = login.registerUser(validateUserName, validatePassword);

        System.out.println(registerAccount);

        boolean loginStatus = login.loginUser(username, password);

        String loginMessage = login.returnLoginStatus(loginStatus, firstname, lastname);
        System.out.println(loginMessage);
    }

}
