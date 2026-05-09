/*********************************************************
 * Name: Lastazia Dickens
 * Date: 05/08/2026
 * Assignment: SDC230 Final Project - Integrated Calculator
 * Description: A logic-specific class that performs 
 * arithmetic division while explicitly handling the 
 * ArithmeticException to prevent division by zero.
 */

public class Division {
    // Account for division by zero and Exception Handling
    public double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}