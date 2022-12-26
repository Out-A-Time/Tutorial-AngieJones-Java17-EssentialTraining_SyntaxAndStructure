package password_validator;

import java.util.Scanner;

public class PasswordValidator {
    private static String currentUsername = "johndoe";
    private static String currentPassword = "ABC_1234";

    public static void main(String[] args) {
        // printPasswordRules();

        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do {
            System.out.println("Enter your new password: ");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        } while (!valid);

        System.out.println("The proposed password is valid");
        scanner.close();
    }

    public static void printPasswordRules() {
        System.out.println("New password must be: ");
        System.out.println(
                "at least 8 characters, have an uppercase letter, have special letter, not contain username, not be the same as old password ");
        System.out.println();
    }

    public static boolean changePassword(String newPassword) {
        boolean valid = true;
        String errorMessage = "";

        if (newPassword.length() < 8) {
            valid = false;
            errorMessage += "\n Your password is too short";
        }

        // Alternatively, we can loop through string and use Character .isUpperCase on
        // each char
        if (newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
            errorMessage += "\n Your Password need to have uppercase letter";
        }

        if (newPassword.matches("[a-zA-Z0-9 ]*")) {
            valid = false;
            errorMessage += "\n Your password must contain special character (eg %,$)";
        }

        if (newPassword.toUpperCase().contains(currentUsername.toUpperCase())) {
            valid = false;
            errorMessage += "\n New password can't contain username";
        }

        if (newPassword.equals(currentPassword)) {
            valid = false;
            errorMessage += "\n Your new password can't be same as old one";
        }

        if (!valid) {
            System.out.println(errorMessage);
        }

        return valid;
    }
}
