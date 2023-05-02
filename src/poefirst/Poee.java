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
        // Define variables
        String firstname, lastname, username, password;
        boolean checkUserName = false;
        boolean checkPasswordComplexity = false;
        String registerUser = "Kyl_1";
        boolean loginUser = false;
        String returnLoginStatus = "";

// Prompt user to enter their first name
        firstname = ("Enter your first name:");

// Prompt user to enter their last name
        lastname = ("Enter your last name:");

// Prompt user to enter their desired username
        username = ("Enter your desired username:");

// Prompt user to enter their desired password
        password = ("Enter your desired password:");

// Check if username is at least 6 characters long and doesn't contain spaces
        if (username.length() >= 8 && !username.contains("_")) {
            checkUserName = true;
        }
    }
// Check if password is at least 8 characters long and contains at least one uppercase letter, one lowercase letter, and one number

    public boolean Password_Validation(String password) {
        // Prompt user to enter their first name
        firstname = ("Enter your first name:");

// Prompt user to enter their last name
        lastname = ("Enter your last name:");

// Prompt user to enter their desired username
        username = ("Enter your desired username:");

// Prompt user to enter their desired password
        password = ("Enter your desired password:");

// Check if username is at least 6 characters long and doesn't contain spaces
        if (username.length() >= 8 && !username.contains("_")) {
            checkUserName = true;
            String username, firstname, lastname;
            boolean checkUserName = false;
            boolean checkPasswordComplexity = false;
            String registerUser = "Kyl_1";
            boolean loginUser = false;
            String returnLoginStatus = "";

            if (password.length() >= 8) {
                Pattern letter = Pattern.compile("[a-zA-z]");
                Pattern digit = Pattern.compile("[0-9]");
                Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
                //Pattern eight = Pattern.compile (".{8}");

                //cHECKING IF THE PASSWORD ACTUALLY MATCHESD THE CONDITIIONS WORKS
                Matcher hasLetter = letter.matcher(password);
                Matcher hasDigit = digit.matcher(password);
                Matcher hasSpecial = special.matcher(password);

                return hasLetter.find() && hasDigit.find() && hasSpecial.find();

            } else {
                checkPasswordComplexity = true;
            }

// Register the user if their username and password meet the complexity requirements
            if (checkUserName && checkPasswordComplexity) {
                registerUser = "Welcome " + firstname + " " + lastname + "Your username: " + username + " and password have been registered.";
                loginUser = true;
            } else {
                registerUser = "Error: Please make sure your username is at least 8 characters long and doesn't contain spaces, and your password is at least 8 characters long and contains at least one uppercase letter, one lowercase letter, and one number.";
            }

// Log the registration message to the console
            return
            .log(registerUser);

// Check if the user is able to log in with their registered username and password
            if (loginUser) {
                var enteredUsername = ("Enter your username:");
                var enteredPassword = ("Enter your password:");

                if (enteredUsername == username && enteredPassword == password) {
                    returnLoginStatus = "Welcome back, " + firstname + " " + lastname;
                } else {
                    returnLoginStatus = "Error: Incorrect username or password.";
                }

            }

// Log the login status message to the console
            String.valueOf(returnLoginStatus);
        }
    }
