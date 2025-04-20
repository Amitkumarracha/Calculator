/**
 * Class that provides multiplication functionality for the Calculator application.
 */
public class Multiplication {
    /**
     * Multiplies two numbers and returns the result.
     * 
     * @param num1 The first number
     * @param num2 The second number
     * @return The product of the two numbers
     */
    public static double multiply(double num1, double num2) {
        // Check for potential overflow
        if (num1 > 0 && num2 > 0 && num1 > Double.MAX_VALUE / num2) {
            throw new ArithmeticException("Multiplication would cause overflow");
        }
        if (num1 > 0 && num2 < 0 && num2 < -Double.MAX_VALUE / num1) {
            throw new ArithmeticException("Multiplication would cause underflow");
        }
        if (num1 < 0 && num2 > 0 && num1 < -Double.MAX_VALUE / num2) {
            throw new ArithmeticException("Multiplication would cause underflow");
        }
        if (num1 < 0 && num2 < 0 && num1 < Double.MAX_VALUE / num2) {
            throw new ArithmeticException("Multiplication would cause overflow");
        }
        
        return num1 * num2;
    }
}