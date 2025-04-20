/**
 * Class that provides square calculation functionality for the Calculator application.
 */
public class Square {
    /**
     * Calculates the square of a number and returns the result.
     * 
     * @param num The number to square
     * @return The square of the number
     */
    public static double calculateSquare(double num) {
        // Check for potential overflow
        if (num > 0 && num > Math.sqrt(Double.MAX_VALUE)) {
            throw new ArithmeticException("Square calculation would cause overflow");
        }
        if (num < 0 && -num > Math.sqrt(Double.MAX_VALUE)) {
            throw new ArithmeticException("Square calculation would cause overflow");
        }
        
        return num * num;
    }
}