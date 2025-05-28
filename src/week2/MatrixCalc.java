/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ADMIN
 */
public class MatrixCalc {
     private int rows, cols;
    private double[][] elements;

    public MatrixCalc(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        elements = new double[rows][cols];
    }

    public void setElement(int r, int c, double value) {
        elements[r][c] = value;
    }

    public double getElement(int r, int c) {
        return elements[r][c];
    }

    public MatrixCalc add(MatrixCalc other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Addition not possible: matrices dimensions differ.");
            return null;
        }
        MatrixCalc result = new MatrixCalc(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    public MatrixCalc subtract(MatrixCalc other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Subtraction not possible: matrices dimensions differ.");
            return null;
        }
        MatrixCalc result = new MatrixCalc(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.elements[i][j] = this.elements[i][j] - other.elements[i][j];
            }
        }
        return result;
    }

    public MatrixCalc multiply(MatrixCalc other) {
        if (this.cols != other.rows) {
            System.out.println("Multiplication not possible: col of A != row of B.");
            return null;
        }
        MatrixCalc result = new MatrixCalc(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.elements[i][k] * other.elements[k][j];
                }
                result.elements[i][j] = sum;
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%10.2f", elements[i][j]);
            }
            System.out.println();
        }
    }
}
