/**
 * Class that provides division functionality for the Calculator application.
 */
public class Division {
    /**
     * Divides the first number by the second and returns the result.
     * 
     * @param numerator The number to be divided (numerator)
     * @param denominator The number to divide by (denominator)
     * @return The quotient of the division
     * @throws ArithmeticException If the denominator is zero
     */
    public static double divide(double numerator, double denominator) {
        // Check for division by zero
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        
        // Check for potential overflow
        if (numerator == Double.MAX_VALUE && denominator < 1 && denominator > 0) {
            throw new ArithmeticException("Division would cause overflow");
        }
        
        // Check for potential underflow
        if (numerator == -Double.MAX_VALUE && denominator < 1 && denominator > 0) {
            throw new ArithmeticException("Division would cause underflow");
        }
        
        return numerator / denominator;
    }
}