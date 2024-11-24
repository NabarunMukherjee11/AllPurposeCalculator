package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        AreaCalculator areaCalculator = new AreaCalculator(calculator);
        VolumeCalculator volumeCalculator = new VolumeCalculator(calculator);
        FinancialCalculator financialCalculator = new FinancialCalculator(calculator);
        VectorCalculator vectorCalculator = new VectorCalculator(calculator);
        ComplexNumberCalculator complexNumberCalculator = new ComplexNumberCalculator(calculator);

        int choice;
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Make a Calculation");
            System.out.println("2. Calculate Area");
            System.out.println("3. Calculate Volume");
            System.out.println("4. Calculate Finance");
            System.out.println("5. Calculate Complex Number");
            System.out.println("6. Calculate Vector");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> calculator.performCalculation();
                case 2 -> areaCalculator.calculateArea();
                case 3 -> volumeCalculator.calculateVolume();
                case 4 -> financialCalculator.performFinancialOperations();
                case 5 -> complexNumberCalculator.performComplexOperations();
                case 6 -> vectorCalculator.performVectorOperations();
                case 7 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}
