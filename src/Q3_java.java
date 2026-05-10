// Question 3 - String Manipulation
// Topic: Name Formatting Utility
//
// Task 1:
// Write a method called formatName(firstName, lastName) that accepts two Strings
// and returns a formatted String in this format: "lastName, firstName"
// Example: formatName("John", "Smith") → "Smith, John"
//
// Task 2:
// Write a method called formatInitials(firstName, lastName) that returns the
// initials of the person as a String in uppercase.
// Example: formatInitials("john", "smith") → "J.S."
// Note: your method should handle inputs in any case (upper, lower, or mixed)
// and always produce properly capitalised output.

/**
 * Author: Mohammed Shafique Ur Razzaque
 * Date: 10 May 2026
 * Description: Formats names and initials.
 */

public class Q3_java {

    public static String formatName(String firstName, String lastName) {
        
        // Captialize the first letter of first name and last name.
        String formattedFirst = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formattedLast = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        
        // Format as Last name , First name
        return formattedLast + ", " + formattedFirst;
    }

    public static String formatInitials(String firstName, String lastName) {
        
        // Capitalize the first letter of first name and last name.
        String firstNameInitial = firstName.substring(0, 1).toUpperCase();
        String lastNameInitial = lastName.substring(0, 1).toUpperCase() ;
        
        return firstNameInitial + "." + lastNameInitial + ".";
    }

    public static void main(String[] args) {
        
        System.out.println(formatName("Alice", "Tan"));     // Should return: "Tan, Alice"
        System.out.println(formatName("bob", "lim"));       // Should return: "Lim, Bob"
        System.out.println(formatInitials("Alice", "Tan")); // Should return: "A.T."
        System.out.println(formatInitials("bob", "lim")); // Should return: "B.L."
    }
}
