/**
 * Class that provides square root calculation functionality for the Calculator application.
 */
public class SquareRoot {
    /**
     * Calculates the square root of a number and returns the result.
     * 
     * @param num The number to calculate the square root of
     * @return The square root of the number
     * @throws IllegalArgumentException If the number is negative
     */
    public static double calculateSquareRoot(double num) {
        // Check for negative number
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        
        return Math.sqrt(num);
    }
}