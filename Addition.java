/**
 * Class that provides addition functionality for the Calculator application.
 */
public class Addition {
    /**
     * Adds two numbers and returns the result.
     * 
     * @param num1 The first number
     * @param num2 The second number
     * @return The sum of the two numbers
     */
    public static double add(double num1, double num2) {
        // Check for potential overflow
        if (num1 > 0 && num2 > Double.MAX_VALUE - num1) {
            throw new ArithmeticException("Addition would cause overflow");
        }
        if (num1 < 0 && num2 < -Double.MAX_VALUE - num1) {
            throw new ArithmeticException("Addition would cause underflow");
        }
        
        return num1 + num2;
    }
}