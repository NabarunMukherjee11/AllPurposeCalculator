package org.example;

import java.util.Scanner;

public class AreaCalculator {
    private Calculator calculator;

    public AreaCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Area Calculation Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5) return;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    double radiusSquared = calculator.multiply(radius, radius);
                    double areaCircle = calculator.multiply(Math.PI, radiusSquared);
                    System.out.println("Area of Circle: " + areaCircle);
                }
                case 2 -> {
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = scanner.nextDouble();
                    double areaRectangle = calculator.multiply(length, breadth);
                    System.out.println("Area of Rectangle: " + areaRectangle);
                }
                case 3 -> {
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    double halfBaseHeight = calculator.multiply(0.5, calculator.multiply(base, height));
                    System.out.println("Area of Triangle: " + halfBaseHeight);
                }
                case 4 -> {
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    double sideSquared = calculator.multiply(side, side);
                    System.out.println("Area of Square: " + sideSquared);
                }
                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
