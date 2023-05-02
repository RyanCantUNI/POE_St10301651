package poefirst;

import java.util.Scanner;
import java.util.regex.*;
import java.util.*;
import java.awt.Component;

/**
 *
 * @author lab_services_student
 */
public class Login {

     public boolean checkUserName(String username) {
         
        return username.length() >= 5 && username.contains("_");
    }

    public  boolean checkPasswordComplexity(String password) {

        Pattern letter = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        //Pattern eight = Pattern.compile (".{8}");

        //cHECKING IF THE PASSWORD ACTUALLY MATCHESD THE CONDITIIONS WORKS
        Matcher hasLetter = letter.matcher(password);
        Matcher hasDigit = digit.matcher(password);
        Matcher hasSpecial = special.matcher(password);

        if (password.length() <= 8) {
            return false;
        }

        return hasLetter.find() && hasDigit.find() && hasSpecial.find();

    }

    public  String registerUser(boolean validateUserName, boolean validatePassword) {

        if (validateUserName == false) {

            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .";
        }
        if (validatePassword == false) {

            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
        }

        return "Password successfully captured";

    }
    
    public  boolean loginUser(String username, String password) {
        Scanner logScan = new Scanner(System.in);
        System.out.println("--Login--");

        System.out.println("Enter username: ");
        String loginUsername = logScan.nextLine();

        System.out.println("Enter password: ");
        String loginPassword = logScan.nextLine();

        if (!username.contains(loginUsername)) {
            return false;
        }
        if (!password.contains(loginPassword)) {
            return false;
        }
        return true;
    }

    public  String returnLoginStatus(boolean loginStatus, String firstName, String lastName) {
        if (!loginStatus) {
            return "Username or password incorrect, please try again!";
        }
        return "Welcome " + firstName + ", " + lastName + " it is great to see you again!!";

    }
}
