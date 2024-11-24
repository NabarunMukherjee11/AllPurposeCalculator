package org.example;

import java.util.Scanner;

public class ComplexNumberCalculator {
    private Calculator calculator;

    public ComplexNumberCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void performComplexOperations() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Complex Number Calculation Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Magnitude");
            System.out.println("6. Phase");
            System.out.println("7. Conjugate");
            System.out.println("8. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 8) return;

            System.out.print("Enter the real and imaginary parts of Complex Number 1: ");
            double real1 = scanner.nextDouble();
            double imag1 = scanner.nextDouble();

            double real2 = 0, imag2 = 0;
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the real and imaginary parts of Complex Number 2: ");
                real2 = scanner.nextDouble();
                imag2 = scanner.nextDouble();
            }

            switch (choice) {
                case 1 -> {
                    double real = calculator.add(real1, real2);
                    double imag = calculator.add(imag1, imag2);
                    System.out.println("Result: " + real + " + " + imag + "i");
                }
                case 2 -> {
                    double real = calculator.subtract(real1, real2);
                    double imag = calculator.subtract(imag1, imag2);
                    System.out.println("Result: " + real + " + " + imag + "i");
                }
                case 3 -> {
                    double real = calculator.subtract(calculator.multiply(real1, real2), calculator.multiply(imag1, imag2));
                    double imag = calculator.add(calculator.multiply(real1, imag2), calculator.multiply(imag1, real2));
                    System.out.println("Result: " + real + " + " + imag + "i");
                }
                case 4 -> {
                    double denominator = calculator.add(calculator.multiply(real2, real2), calculator.multiply(imag2, imag2));
                    double real = calculator.divide(
                            calculator.add(calculator.multiply(real1, real2), calculator.multiply(imag1, imag2)), denominator);
                    double imag = calculator.divide(
                            calculator.subtract(calculator.multiply(imag1, real2), calculator.multiply(real1, imag2)), denominator);
                    System.out.println("Result: " + real + " + " + imag + "i");
                }
                case 5 -> {
                    double magnitude = Math.sqrt(calculator.add(calculator.multiply(real1, real1), calculator.multiply(imag1, imag1)));
                    System.out.println("Magnitude: " + magnitude);
                }
                case 6 -> {
                    double phase = Math.toDegrees(Math.atan2(imag1, real1));
                    System.out.println("Phase: " + phase + " degrees");
                }
                case 7 -> {
                    System.out.println("Conjugate: " + real1 + " - " + imag1 + "i");
                }
                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
