package org.example;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);

    // Basic Operations
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double exponent(double base, double power) {
        return Math.pow(base, power);
    }

    public double logarithm(double value) {
        if (value <= 0) {
            throw new ArithmeticException("Logarithm of non-positive numbers is undefined.");
        }
        return Math.log(value);
    }

    public double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }

    public void performCalculation() {
        int choice;
        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exponent");
            System.out.println("6. Logarithm");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 10) return;

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter first number: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + add(a, b));
                    }
                    case 2 -> {
                        System.out.print("Enter first number: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + subtract(a, b));
                    }
                    case 3 -> {
                        System.out.print("Enter first number: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + multiply(a, b));
                    }
                    case 4 -> {
                        System.out.print("Enter first number: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + divide(a, b));
                    }
                    case 5 -> {
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter power: ");
                        double power = scanner.nextDouble();
                        System.out.println("Result: " + exponent(base, power));
                    }
                    case 6 -> {
                        System.out.print("Enter a number: ");
                        double value = scanner.nextDouble();
                        System.out.println("Result: " + logarithm(value));
                    }
                    case 7 -> {
                        System.out.print("Enter angle in degrees: ");
                        double angle = scanner.nextDouble();
                        System.out.println("Result: " + sine(angle));
                    }
                    case 8 -> {
                        System.out.print("Enter angle in degrees: ");
                        double angle = scanner.nextDouble();
                        System.out.println("Result: " + cosine(angle));
                    }
                    case 9 -> {
                        System.out.print("Enter angle in degrees: ");
                        double angle = scanner.nextDouble();
                        System.out.println("Result: " + tangent(angle));
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }
}
