package dev.stamford;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");

        // Input for the first number
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        // Input for the second number
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        // Input for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Initialize the variable to store the result
        double result = 0;

        // Perform calculation based on the operator using if-else statements
        if (operator == '+') {
            // TODO: Implement addition logic
        } else if (operator == '-') {
            // TODO: Implement subtraction logic
        } else if (operator == '*') {
            // TODO: Implement multiplication logic
        } else if (operator == '/') {
            // TODO: Implement division logic (Remember to check for division by zero!)
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}