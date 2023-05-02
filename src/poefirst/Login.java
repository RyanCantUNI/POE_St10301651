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
//declaring a new boolean class
     public boolean checkUserName(String username) {
         //declaring conditions that need to be met before proceeding witht the process
        return username.length() >= 5 && username.contains("_");
    }
//cresting a new boolean method to intilize the password complexity
    public  boolean checkPasswordComplexity(String password) {
//declaring the special characters that need to be implemented in order for the password to work
        Pattern letter = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        

        
        Matcher hasLetter = letter.matcher(password);
        Matcher hasDigit = digit.matcher(password);
        Matcher hasSpecial = special.matcher(password);
//if the password does not have 8 characters in it, then it will fail to execute
        if (password.length() <= 8) {
            return false;
        }
// making the password complexity find the special characters
        return hasLetter.find() && hasDigit.find() && hasSpecial.find();

    }
//declaring a new method using a string method
    public  String registerUser(boolean validateUserName, boolean validatePassword) {
//using an if statement to show if the username is valid and if the password is valid as well
        if (validateUserName == false) {

            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .";
        }
        if (validatePassword == false) {

            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
        }
//outputing a literal string to show that the user has captured their information correctly 
        return "Password successfully captured";

    }
    //declaring a new boolean method 
    public  boolean loginUser(String loginUsername, String loginPassword, String username, String password) {
        
//creating an if statement to show if the login username works 
        if (!username.contains(loginUsername)) {
            return false;
        }
        if (!password.contains(loginPassword)) {
            return false;
        }
        return true;
    }
//declaring a new string method 
    public  String returnLoginStatus(boolean loginStatus, String firstName, String lastName) {
        if (!loginStatus) {
            return "Username or password incorrect, please try again!";
        }
        return "Welcome " + firstName + ", " + lastName + " it is great to see you again!!";

    }
}
