public class Scaling extends AffineTrasformation {
    private static Matrix scalingMatrix(double kx, double ky){
        double[][] scale = new double[3][3];
        scale[0][0] = kx;
        scale[1][1] = ky;
        scale[2][2] = 1;
        return new Matrix(scale);
    }
    public Scaling(double kx, double ky){
        super(scalingMatrix(kx, ky));
    }
}
