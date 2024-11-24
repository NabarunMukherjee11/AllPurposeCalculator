package org.example;

import java.util.Scanner;

public class VectorCalculator {
    private Calculator calculator;

    public VectorCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void performVectorOperations() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Vector Calculation Menu ---");
            System.out.println("1. Vector Addition");
            System.out.println("2. Vector Subtraction");
            System.out.println("3. Dot Product");
            System.out.println("4. Cross Product");
            System.out.println("5. Magnitude");
            System.out.println("6. Angle Between Vectors");
            System.out.println("7. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 7) return;

            System.out.print("Enter components of Vector 1 (x y z): ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double z1 = scanner.nextDouble();
            double[] vector1 = {x1, y1, z1};

            double[] vector2 = null;
            if (choice != 5) {
                System.out.print("Enter components of Vector 2 (x y z): ");
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double z2 = scanner.nextDouble();
                vector2 = new double[]{x2, y2, z2};
            }

            switch (choice) {
                case 1 -> {
                    double[] result = {
                            calculator.add(vector1[0], vector2[0]),
                            calculator.add(vector1[1], vector2[1]),
                            calculator.add(vector1[2], vector2[2])
                    };
                    System.out.println("Vector Addition: (" + result[0] + ", " + result[1] + ", " + result[2] + ")");
                }
                case 2 -> {
                    double[] result = {
                            calculator.subtract(vector1[0], vector2[0]),
                            calculator.subtract(vector1[1], vector2[1]),
                            calculator.subtract(vector1[2], vector2[2])
                    };
                    System.out.println("Vector Subtraction: (" + result[0] + ", " + result[1] + ", " + result[2] + ")");
                }
                case 3 -> {
                    double dotProduct = calculator.add(
                            calculator.multiply(vector1[0], vector2[0]),
                            calculator.add(
                                    calculator.multiply(vector1[1], vector2[1]),
                                    calculator.multiply(vector1[2], vector2[2])
                            )
                    );
                    System.out.println("Dot Product: " + dotProduct);
                }
                case 4 -> {
                    double[] result = {
                            calculator.subtract(calculator.multiply(vector1[1], vector2[2]), calculator.multiply(vector1[2], vector2[1])),
                            calculator.subtract(calculator.multiply(vector1[2], vector2[0]), calculator.multiply(vector1[0], vector2[2])),
                            calculator.subtract(calculator.multiply(vector1[0], vector2[1]), calculator.multiply(vector1[1], vector2[0]))
                    };
                    System.out.println("Cross Product: (" + result[0] + ", " + result[1] + ", " + result[2] + ")");
                }
                case 5 -> {
                    double magnitude = Math.sqrt(
                            calculator.add(
                                    calculator.add(
                                            calculator.multiply(vector1[0], vector1[0]),
                                            calculator.multiply(vector1[1], vector1[1])
                                    ),
                                    calculator.multiply(vector1[2], vector1[2])
                            )
                    );
                    System.out.println("Magnitude of Vector: " + magnitude);
                }
                case 6 -> {
                    double dotProduct = calculator.add(
                            calculator.multiply(vector1[0], vector2[0]),
                            calculator.add(
                                    calculator.multiply(vector1[1], vector2[1]),
                                    calculator.multiply(vector1[2], vector2[2])
                            )
                    );
                    double magnitude1 = Math.sqrt(
                            calculator.add(
                                    calculator.add(
                                            calculator.multiply(vector1[0], vector1[0]),
                                            calculator.multiply(vector1[1], vector1[1])
                                    ),
                                    calculator.multiply(vector1[2], vector1[2])
                            )
                    );
                    double magnitude2 = Math.sqrt(
                            calculator.add(
                                    calculator.add(
                                            calculator.multiply(vector2[0], vector2[0]),
                                            calculator.multiply(vector2[1], vector2[1])
                                    ),
                                    calculator.multiply(vector2[2], vector2[2])
                            )
                    );
                    double angle = Math.toDegrees(Math.acos(dotProduct / (magnitude1 * magnitude2)));
                    System.out.println("Angle Between Vectors: " + angle + " degrees");
                }
                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
