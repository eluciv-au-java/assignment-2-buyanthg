package edu.au.javacourse.transformation;
public class AffineTrasformation implements Transformation {
    private Matrix matrix;

    public AffineTrasformation() {
        double[][] id = new double[3][3];
        for (int i = 0; i < 3; i++) {
            id[i][i] = 1;
        }
        this.matrix = new Matrix(id);
    }
    public AffineTrasformation(Matrix matrix) {
        this.matrix = matrix;
    }

    public Point apply(Point p) {
        return new Point(p.asVector().multiply(this.matrix));
    }
    public AffineTrasformation thenDo(AffineTrasformation next) {
        return new AffineTrasformation(this.matrix.multiply(next.matrix));
    }
}
