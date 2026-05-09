/*********************************************************
 * Name: Lastazia Dickens
 * Date: 05/08/2026
 * Assignment: SDC230 Final Project
 * Description: The main controller that manages the user 
 * interface, builds full operation strings, and allows 
 * users to save their work to the memory vault.
 *********************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class App {
    /**
     * The main entry point of the application.
     * Initializes the memory, math objects, and starts the menu loop.
     */
    public static void main(String[] args) {
        // Scanner for user input and objects for memory/math logic
        Scanner input = new Scanner(System.in);
        CalculationMemory myMem = new CalculationMemory();
        Division div = new Division();
        boolean running = true;

        // Print header line
        System.out.println("Project: Final Calculator - Lastazia Dickens");
        System.out.println("WELCOME TO THE DICKENS MATH-PRO v5.0");

        // Primary application loop
        while (running) {
            try {
                // Main navigation menu display
                System.out.println("\n MAIN MENU ");
                System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");
                System.out.println("5. Multi-Value Operations  6. View Memory  7. Clear Memory  999. Quit");
                System.out.print("Selection: ");
                
                int choice = input.nextInt();

                // Logical branching for menu selections
                if (choice == 999) {
                    running = false;
                } else if (choice >= 1 && choice <= 4) {
                    // Basic two-number arithmetic
                    handleBasicMath(choice, input, div, myMem);
                } else if (choice == 5) {
                    // Advanced multi-value processing
                    handleMultiValue(input);
                } else if (choice == 6) {
                    // Recall saved operation strings
                    myMem.displayCollection();
                } else if (choice == 7) {
                    // Wipe the memory vault
                    myMem.clearMemory();    
                } else {
                    System.out.println("Invalid selection. Please use the menu options or 999.");
                }
            } catch (InputMismatchException e) {
                // Fail-safe for non-numeric menu choices
                System.out.println("INPUT ERROR: Please enter a valid menu number.");
                input.next(); // Clear the scanner buffer to prevent infinite loops
            }
        }
        
        // Final closing message
        System.out.println("\nThank you for using the Dickens Math-Pro!");
        input.close();
    }

    /**
     * Handles addition, subtraction, multiplication, and division.
     * Shows a full string representation of the math for memory storage.
     */
    private static void handleBasicMath(int choice, Scanner input, Division div, CalculationMemory myMem) {
        try {
            System.out.print("Enter first number: ");
            double n1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = input.nextDouble();
            
            double result = 0;
            String function = "";

            // Math logic based on menu choice
            if (choice == 1) { result = n1 + n2; function = "+"; }
            else if (choice == 2) { result = n1 - n2; function = "-"; }
            else if (choice == 3) { result = n1 * n2; function = "*"; }
            else if (choice == 4) { 
                // Uses the Division class to check for zero-division exceptions
                result = div.divide(n1, n2); 
                function = "/"; 
            }

            // Formatting the operation string for display and storage
            String fullOperation = String.format("%.2f %s %.2f = %.3f", n1, function, n2, result);
            System.out.println("\nRESULT: " + fullOperation);

            // Conditional storage logic
            System.out.print("Would you like to save this operation to memory? (Y/N): ");
            String saveRequest = input.next().toUpperCase();

            if (saveRequest.equals("Y")) {
                if (myMem.addOperation(fullOperation)) {
                    System.out.println("Operation successfully saved to the vault.");
                } else {
                    System.out.println("Memory limit (10) reached. Cannot save more operations.");
                }
            }

        } catch (ArithmeticException e) {
            // Displays specific math errors like division by zero
            System.out.println("MATH ERROR: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Displays error if symbols or letters are typed
            System.out.println("INPUT ERROR: Please enter numeric values only.");
            input.next(); // Buffer clear
        }
    }

    /**
     * Allows a single string of numbers separated by spaces.
     * Uses a list to process the values sequentially.
     */
    private static void handleMultiValue(Scanner input) {
        input.nextLine(); // Clear scanner buffer
        try {
            System.out.println("\n--- MULTI-VALUE OPERATION ---");
            System.out.println("Enter numbers separated by spaces (e.g., 10 2.5 30):");
            String line = input.nextLine();
            
            // Collect parsed doubles into a list
            List<Double> nums = new ArrayList<>();
            for (String part : line.split(" ")) {
                try {
                    nums.add(Double.parseDouble(part));
                } catch (NumberFormatException e) {
                    // Logic to ignore symbols within the string
                    System.out.println("Skipping invalid input: " + part);
                }
            }

            // Ensure the user has input sufficient data to calculate
            if (nums.size() < 2) {
                System.out.println("Need at least two numbers to calculate.");
                return;
            }

            System.out.println("Select Operation: 1. Add  2. Subtract  3. Multiply");
            int op = input.nextInt();
            double total = nums.get(0); // Set starting point

            // Loop through numbers to perform calculation sequence
            for (int i = 1; i < nums.size(); i++) {
                if (op == 1) total += nums.get(i);
                else if (op == 2) total -= nums.get(i);
                else if (op == 3) total *= nums.get(i);
            }

            System.out.printf("Multi-Value Result: %.3f%n", total);
        } catch (Exception e) {
            System.out.println("Error processing multi-value operation.");
        }
    }
}