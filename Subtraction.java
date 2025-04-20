/**
 * Class that provides subtraction functionality for the Calculator application.
 */
public class Subtraction {
    /**
     * Subtracts the second number from the first and returns the result.
     * 
     * @param num1 The number to subtract from
     * @param num2 The number to subtract
     * @return The difference between the two numbers
     */
    public static double subtract(double num1, double num2) {
        // Check for potential overflow/underflow
        if (num2 < 0 && num1 > Double.MAX_VALUE + num2) {
            throw new ArithmeticException("Subtraction would cause overflow");
        }
        if (num2 > 0 && num1 < -Double.MAX_VALUE + num2) {
            throw new ArithmeticException("Subtraction would cause underflow");
        }
        
        return num1 - num2;
    }
}