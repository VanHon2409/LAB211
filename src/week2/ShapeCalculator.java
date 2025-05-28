/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ADMIN
 */
public class ShapeCalculator {
    // Trả về {diện tích, chu vi} hình chữ nhật
    public static double[] calcRectangle(double w, double l) {
        double area = w * l;
        double perimeter = 2 * (w + l);
        return new double[] {area, perimeter};
    }

    // Trả về {diện tích, chu vi} hình tròn
    public static double[] calcCircle(double r) {
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        return new double[] {area, perimeter};
    }

    // Trả về {diện tích, chu vi} tam giác theo 3 cạnh
    public static double[] calcTriangle(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        double perimeter = side1 + side2 + side3;
        return new double[] {area, perimeter};
    }
}
