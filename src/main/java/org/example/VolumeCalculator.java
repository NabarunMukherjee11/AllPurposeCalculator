package org.example;

import java.util.Scanner;

public class VolumeCalculator {
    private Calculator calculator;

    public VolumeCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void calculateVolume() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Volume Calculation Menu ---");
            System.out.println("1. Sphere");
            System.out.println("2. Cube");
            System.out.println("3. Cylinder");
            System.out.println("4. Rectangular Prism");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5) return;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    double radiusCubed = calculator.multiply(radius, calculator.multiply(radius, radius));
                    double volumeSphere = calculator.multiply(4.0 / 3.0, calculator.multiply(Math.PI, radiusCubed));
                    System.out.println("Volume of Sphere: " + volumeSphere);
                }
                case 2 -> {
                    System.out.print("Enter side length: ");
                    double side = scanner.nextDouble();
                    double sideCubed = calculator.multiply(side, calculator.multiply(side, side));
                    System.out.println("Volume of Cube: " + sideCubed);
                }
                case 3 -> {
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    double radiusSquared = calculator.multiply(radius, radius);
                    double volumeCylinder = calculator.multiply(Math.PI, calculator.multiply(radiusSquared, height));
                    System.out.println("Volume of Cylinder: " + volumeCylinder);
                }
                case 4 -> {
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    double volumeRectPrism = calculator.multiply(length, calculator.multiply(width, height));
                    System.out.println("Volume of Rectangular Prism: " + volumeRectPrism);
                }
                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
