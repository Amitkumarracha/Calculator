/**
 * Class that provides cube calculation functionality for the Calculator application.
 */
public class Cube {
    /**
     * Calculates the cube of a number and returns the result.
     * 
     * @param num The number to cube
     * @return The cube of the number
     */
    public static double calculateCube(double num) {
        // Check for potential overflow
        if (num > 0 && num > Math.cbrt(Double.MAX_VALUE)) {
            throw new ArithmeticException("Cube calculation would cause overflow");
        }
        if (num < 0 && -num > Math.cbrt(Double.MAX_VALUE)) {
            throw new ArithmeticException("Cube calculation would cause underflow");
        }
        
        return num * num * num;
    }
}