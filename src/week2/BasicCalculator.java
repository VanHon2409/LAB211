/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ADMIN
 */
public class BasicCalculator {
      public static double operate(double x, String op, double y) {
        switch (op) {
            case "+": return x + y;
            case "-": return x - y;
            case "*": return x * y;
            case "/":
                if (y == 0) throw new ArithmeticException("Error: Division by zero");
                return x / y;
            case "^": return Math.pow(x, y);
            default: throw new IllegalArgumentException("Error: Operator not recognized");
        }
    }

    public static double computeBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        if (heightM <= 0) throw new IllegalArgumentException("Height must be positive");
        return weightKg / (heightM * heightM);
    }

    public static String classifyBMI(double bmiValue) {
        if (bmiValue < 19) return "Under-standard";
        if (bmiValue < 25) return "Standard";
        if (bmiValue < 30) return "Overweight";
        if (bmiValue <= 40) return "Fat - should lose weight";
        return "Very fat - should lose weight immediately";
    }
}
