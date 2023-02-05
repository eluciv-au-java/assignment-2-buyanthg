package edu.au.javacourse.transformation;

public class Matrix {
    private double[][] data;
    public Matrix(double[][] data) {
        this.data = data;
    }
    private int numRows() {
        return data.length;
    }
    private int numColumn() {
        return data[0].length;
    }
    public Matrix multiply(Matrix other) {
        int column = other.numColumn();
        int row = this.numRows();
        int numTerms = this.numColumn();
        double[][] res = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < numTerms; k++) {
                    res[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(res);
    }
    double getValue(int row, int column) {
        return this.data[row][column];
    }

}
