package edu.au.javacourse.transformation;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Matrix vector) {
        this.x = vector.getValue(0, 0);
        this.y = vector.getValue(0, 1);
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public Matrix asVector() {
        double[][] coord = new double[1][3];
        coord[0][0] = this.x;
        coord[0][1] = this.y;
        coord[0][2] = 1.;
        return new Matrix(coord);
    }
}
