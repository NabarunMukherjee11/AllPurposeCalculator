package org.example;

import java.util.Scanner;

public class FinancialCalculator {
    private Calculator calculator;

    public FinancialCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void performFinancialOperations() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Financial Calculation Menu ---");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.println("3. EMI Calculation");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 4) return;

            System.out.print("Enter Principal Amount: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double rate = scanner.nextDouble();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Time (in years): ");
                    double time = scanner.nextDouble();
                    double si = calculator.divide(calculator.multiply(principal, calculator.multiply(rate, time)), 100);
                    System.out.println("Simple Interest: " + si);
                }
                case 2 -> {
                    System.out.print("Enter Time (in years): ");
                    double time = scanner.nextDouble();
                    System.out.print("Enter Compounding Frequency (e.g., 1 for annual, 12 for monthly): ");
                    int frequency = scanner.nextInt();
                    double amount = principal * Math.pow((1 + rate / (100 * frequency)), frequency * time);
                    double ci = calculator.subtract(amount, principal);
                    System.out.println("Compound Interest: " + ci);
                }
                case 3 -> {
                    System.out.print("Enter Time Period (in months): ");
                    int months = scanner.nextInt();
                    double monthlyRate = rate / (12 * 100);
                    double emi = calculator.divide(
                            calculator.multiply(principal, monthlyRate * Math.pow(1 + monthlyRate, months)),
                            Math.pow(1 + monthlyRate, months) - 1
                    );
                    System.out.println("EMI: " + emi);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (true);
    }
}
