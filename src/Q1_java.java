// Question 1 - Functions and Conditionals
// Topic: Temperature Converter
//
// Task 1:
// Write a method called convertTemp that accepts two arguments:
//   - value: a numeric temperature value (double)
//   - unit: a String, either "C" for Celsius or "F" for Fahrenheit
//
// The method should:
//   - Convert Celsius to Fahrenheit if unit is "C"  →  Formula: (value × 9/5) + 32
//   - Convert Fahrenheit to Celsius if unit is "F"  →  Formula: (value − 32) × 5/9
//   - Return -1 if unit is neither "C" nor "F"
//   - Round the result to 2 decimal places before returning

/**
 * Author: Mohammed Shafique Ur Razzaque
 * Date: 10 May 2026
 * Description: Temperature converter between Celsius and Fahrenheit, rounded to 2 decimal places.
 */

public class Q1_java {

    public static double convertTemp(double value, String unit) {
        
        // Validate the input value of unit is "C" or "F". If null or mismatch, return -1.0.
        if (unit == null || (!unit.equalsIgnoreCase("C") && !unit.equalsIgnoreCase("F"))) {
            return -1.0;
        }

        unit = unit.toUpperCase();  // Convert to uppercase, to pre-empt lowercase input.
        double result;              // Contains the converted value before rounding.
        double roundedResult;       // Contains the converted value after rounding to 2 decimal places.

        if (unit.equals("C")) {
            result = (value * 9.0 / 5.0) + 32.0;    // Convert Celsius to Fahrenheit
        } 
        else if (unit.equals("F")) {
            result = ((value - 32.0) * 5.0 / 9.0);  // Convert Fahrenheit to Celsius
        } 
        else {
            return -1.0;
        }

        roundedResult = Math.round(result * 100.0) / 100.0;
        return roundedResult;
    }

    public static void main(String[] args) {
        
        System.out.println("Converting 100 degree Celsius 'C' to Fahrenheit: " + convertTemp(100, "C")); // Should return: 212.0
        System.out.println("Converting 32 degree Fahrenheit 'F' to Celsius: " + convertTemp(32, "F"));  // Should return: 0.0
        System.out.println("Converting 37 degree Celsius 'C' to Fahrenheit: " + convertTemp(37, "C"));  // Should return: 98.6
        System.out.println("Converting 0 degree 'X': " + convertTemp(0, "X"));                        // Should return: -1.0

        //Additional test cases
        System.out.println("\nAdditional test cases for lowercase input, null input, rounding, and empty string input:");
        System.out.println("\nConverting 100 degree Celsius 'c' to Fahrenheit: " + convertTemp(100, "c")); // Should return: 212.0
        System.out.println("Converting 32 degree Fahrenheit 'f' to Celsius: " + convertTemp(32, "f"));  // Should return: 0.0
        System.out.println("Converting 37.555 degree Celsius 'C' to Fahrenheit: " + convertTemp(37.555, "C"));  // Should return: 99.6
        System.out.println("Converting 100 degree null unit: " + convertTemp(100, null));           // Should return: -1.0
        System.out.println("Converting 100 degree empty string '' unit: " + convertTemp(100, ""));  // Should return: -1.0
        
    }
}
