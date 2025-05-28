/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Calculator & BMI");
            System.out.println("2. Shape Calculator");
            System.out.println("3. Matrix Operations");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.println("1. Calculator");
                    System.out.println("2. BMI");
                    int subOpt = Integer.parseInt(input.nextLine());

                    if (subOpt == 1) {
                        System.out.print("Input first number: ");
                        double memory = Double.parseDouble(input.nextLine());
                        while (true) {
                            System.out.print("Input operator (+, -, *, /, ^) or '=' to show result: ");
                            String oper = input.nextLine();
                            if (oper.equals("=")) {
                                System.out.println("Final Result: " + memory);
                                break;
                            }
                            System.out.print("Input next number: ");
                            double nextNum = Double.parseDouble(input.nextLine());
                            memory = BasicCalculator.operate(memory, oper, nextNum);
                            System.out.println("Current value: " + memory);
                        }
                    } else if (subOpt == 2) {
                        System.out.print("Enter weight (kg): ");
                        double w = Double.parseDouble(input.nextLine());
                        System.out.print("Enter height (cm): ");
                        double h = Double.parseDouble(input.nextLine());
                        double bmi = BasicCalculator.computeBMI(w, h);
                        System.out.printf("BMI: %.2f\n", bmi);
                        System.out.println("BMI Status: " + BasicCalculator.classifyBMI(bmi));
                    }
                }
                case 2 -> {
                    System.out.print("Rectangle width: ");
                    double w = Double.parseDouble(input.nextLine());
                    System.out.print("Rectangle length: ");
                    double l = Double.parseDouble(input.nextLine());

                    System.out.print("Circle radius: ");
                    double r = Double.parseDouble(input.nextLine());

                    System.out.print("Triangle side A: ");
                    double a = Double.parseDouble(input.nextLine());
                    System.out.print("Triangle side B: ");
                    double b = Double.parseDouble(input.nextLine());
                    System.out.print("Triangle side C: ");
                    double c = Double.parseDouble(input.nextLine());

                    double[] rect = ShapeCalculator.calcRectangle(w, l);
                    double[] circ = ShapeCalculator.calcCircle(r);
                    double[] tri = ShapeCalculator.calcTriangle(a, b, c);

                    System.out.printf("Rectangle area: %.2f, perimeter: %.2f\n", rect[0], rect[1]);
                    System.out.printf("Circle area: %.2f, perimeter: %.2f\n", circ[0], circ[1]);
                    System.out.printf("Triangle area: %.2f, perimeter: %.2f\n", tri[0], tri[1]);
                }
                case 3 -> {
                    int matOption;
                    do {
                        System.out.println("--- Matrix Menu ---");
                        System.out.println("1. Add");
                        System.out.println("2. Subtract");
                        System.out.println("3. Multiply");
                        System.out.println("4. Back");
                        System.out.print("Choice: ");
                        matOption = Integer.parseInt(input.nextLine());

                        if (matOption == 4) break;

                        System.out.print("Rows of matrix 1: ");
                        int r1 = Integer.parseInt(input.nextLine());
                        System.out.print("Columns of matrix 1: ");
                        int c1 = Integer.parseInt(input.nextLine());

                        MatrixCalc m1 = new MatrixCalc(r1, c1);
                        System.out.println("Enter matrix 1 values:");
                        for (int i = 0; i < r1; i++) {
                            for (int j = 0; j < c1; j++) {
                                System.out.printf("m1[%d][%d]: ", i + 1, j + 1);
                                m1.setElement(i, j, Double.parseDouble(input.nextLine()));
                            }
                        }

                        MatrixCalc m2;
                        if (matOption == 3) {
                            System.out.print("Rows of matrix 2: ");
                            int r2 = Integer.parseInt(input.nextLine());
                            System.out.print("Columns of matrix 2: ");
                            int c2 = Integer.parseInt(input.nextLine());
                            if (c1 != r2) {
                                System.out.println("Multiplication not possible: cols of m1 != rows of m2.");
                                continue;
                            }
                            m2 = new MatrixCalc(r2, c2);
                            System.out.println("Enter matrix 2 values:");
                            for (int i = 0; i < r2; i++) {
                                for (int j = 0; j < c2; j++) {
                                    System.out.printf("m2[%d][%d]: ", i + 1, j + 1);
                                    m2.setElement(i, j, Double.parseDouble(input.nextLine()));
                                }
                            }
                        } else {
                            System.out.println("Matrix 2 dimensions must match matrix 1.");
                            m2 = new MatrixCalc(r1, c1);
                            System.out.println("Enter matrix 2 values:");
                            for (int i = 0; i < r1; i++) {
                                for (int j = 0; j < c1; j++) {
                                    System.out.printf("m2[%d][%d]: ", i + 1, j + 1);
                                    m2.setElement(i, j, Double.parseDouble(input.nextLine()));
                                }
                            }
                        }

                        MatrixCalc res = null;
                        switch (matOption) {
                            case 1 -> res = m1.add(m2);
                            case 2 -> res = m1.subtract(m2);
                            case 3 -> res = m1.multiply(m2);
                            default -> System.out.println("Invalid choice.");
                        }
                        if (res != null) {
                            System.out.println("Result:");
                            res.print();
                        }

                    } while (matOption != 4);
                }
                case 4 -> System.out.println("Program terminated.");
                default -> System.out.println("Invalid option, try again.");
            }
        } while (option != 4);

        input.close();
    }
}
