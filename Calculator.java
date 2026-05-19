public class Calculator {

    // Addition
    public int add(int a, int b, int c, int d, int e, int f) {
        // return the sum of a, b, c, d and e
        return a + b + c + d + e + f;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Add: " + calculator.add(10, 50));
        System.out.println("Subtract: " + calculator.subtract(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
    }
}
