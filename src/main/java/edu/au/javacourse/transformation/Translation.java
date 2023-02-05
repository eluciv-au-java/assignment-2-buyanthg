package edu.au.javacourse.transformation;

public class Translation extends AffineTrasformation {
    private static Matrix translationMatrix(double dx, double dy) {
        double[][] translation = new double[3][3];
        for (int i = 0; i < 3; i++) {
            translation[i][i] = 1;
        }
        translation[2][0] = dx;
        translation[2][1] = dy;
        return new Matrix(translation);
    }
    public Translation(double dx, double dy) {

        super(translationMatrix(dx, dy));
    }
}
