# Calculator Application

## Overview
This is a Java-based Calculator application that provides a command-line interface for performing various mathematical operations. The application is designed with a modular structure, where each mathematical operation is implemented in its own class.

## Features
- Basic arithmetic operations (addition, subtraction, multiplication, division)
- Advanced mathematical functions (square, cube, square root)
- User-friendly command-line interface
- Input validation and error handling
- Protection against numerical overflow/underflow

## Project Structure
The application consists of the following Java classes:
- `Main.java`: Entry point of the application, handles user interface and input
- `Addition.java`: Implements addition functionality
- `Subtraction.java`: Implements subtraction functionality
- `Multiplication.java`: Implements multiplication functionality
- `Division.java`: Implements division functionality
- `Square.java`: Implements square calculation
- `Cube.java`: Implements cube calculation
- `SquareRoot.java`: Implements square root calculation

## Installation
1. Ensure you have Java Development Kit (JDK) installed on your system
2. Clone or download this repository
3. Navigate to the project directory
4. Compile the Java files:
   ```
   javac *.java
   ```
5. Run the application:
   ```
   java Main
   ```

## Usage
When you run the application, you'll be presented with a menu of operations:

```
CALCULATOR MENU
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Square
6. Cube
7. Square Root
8. Exit
```

To use the calculator:
1. Enter the number corresponding to the operation you want to perform
2. Follow the prompts to enter the required numbers
3. View the result of the calculation
4. Continue with another operation or exit the application

## Supported Operations

### Addition
Adds two numbers together. Handles overflow/underflow checking.

### Subtraction
Subtracts the second number from the first. Handles overflow/underflow checking.

### Multiplication
Multiplies two numbers together. Handles overflow/underflow checking.

### Division
Divides the first number by the second. Includes validation to prevent division by zero and handles potential overflow.

### Square
Calculates the square of a number. Includes overflow checking.

### Cube
Calculates the cube of a number. Includes overflow checking.

### Square Root
Calculates the square root of a number. Validates that the input is not negative.

## Error Handling
The application includes comprehensive error handling for:
- Invalid menu selections
- Invalid number inputs
- Mathematical errors (division by zero, negative square root, etc.)
- Potential numerical overflow/underflow

## License
This project is available for educational purposes.

## Author
This Calculator application was created as a Java programming assignment.