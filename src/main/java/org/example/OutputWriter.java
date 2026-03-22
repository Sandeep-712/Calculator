package org.example;

public class OutputWriter {
    /**
     * Prints a successful calculation result to System.out.
     * Format: "Result: a op b = result"
     */
    public void printResult(double a, String op, double b, double result) {
        System.out.printf("Result: %.2f %s %.2f = %.2f%n", a, op, b, result);
    }

    public void printError(String message) {
        System.err.println("Error: " + message);
    }
}
