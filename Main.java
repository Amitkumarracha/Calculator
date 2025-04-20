// Name: Amitkumar Racha
// PRN: 24070126501
// Batch: A1 (2023-27)


import java.util.Scanner;

public class Main {
    /**
     * Main method - entry point of the program.
     * Displays a menu and handles user input to perform calculations.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Welcome to the Calculator Application");
        
        while (running) {
            displayMenu();
            
            try {
                System.out.print("Enter your choice (1-8): ");
                int choice = scanner.nextInt();
                
                if (choice == 8) {
                    running = false;
                    System.out.println("Thank you for using the Calculator. Goodbye!");
                    continue;
                }
                
                if (choice < 1 || choice > 8) {
                    throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 8.");
                }
                
                performOperation(choice, scanner);
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
            
            System.out.println(); // Add a blank line for readability
        }
        
        scanner.close();
    }
    
    /**
     * Displays the calculator menu options.
     */
    private static void displayMenu() {
        System.out.println("\nCALCULATOR MENU");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Square Root");
        System.out.println("8. Exit");
    }
    
    /**
     * Performs the selected operation based on user choice.
     * 
     * @param choice The operation chosen by the user
     * @param scanner Scanner object for input
     */
    private static void performOperation(int choice, Scanner scanner) {
        try {
            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter first number: ");
                    double addNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double addNum2 = scanner.nextDouble();
                    double addResult = Addition.add(addNum1, addNum2);
                    System.out.println("Result: " + addResult);
                    break;
                    
                case 2: // Subtraction
                    System.out.print("Enter first number: ");
                    double subNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double subNum2 = scanner.nextDouble();
                    double subResult = Subtraction.subtract(subNum1, subNum2);
                    System.out.println("Result: " + subResult);
                    break;
                    
                case 3: // Multiplication
                    System.out.print("Enter first number: ");
                    double mulNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mulNum2 = scanner.nextDouble();
                    double mulResult = Multiplication.multiply(mulNum1, mulNum2);
                    System.out.println("Result: " + mulResult);
                    break;
                    
                case 4: // Division
                    System.out.print("Enter numerator: ");
                    double divNum1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    double divNum2 = scanner.nextDouble();
                    try {
                        double divResult = Division.divide(divNum1, divNum2);
                        System.out.println("Result: " + divResult);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 5: // Square
                    System.out.print("Enter a number: ");
                    double squareNum = scanner.nextDouble();
                    double squareResult = Square.calculateSquare(squareNum);
                    System.out.println("Result: " + squareResult);
                    break;
                    
                case 6: // Cube
                    System.out.print("Enter a number: ");
                    double cubeNum = scanner.nextDouble();
                    double cubeResult = Cube.calculateCube(cubeNum);
                    System.out.println("Result: " + cubeResult);
                    break;
                    
                case 7: // Square Root
                    System.out.print("Enter a number: ");
                    double sqrtNum = scanner.nextDouble();
                    try {
                        double sqrtResult = SquareRoot.calculateSquareRoot(sqrtNum);
                        System.out.println("Result: " + sqrtResult);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
            scanner.nextLine(); // Clear the invalid input
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}