public class Rotation extends AffineTrasformation {
    private static Matrix rotationMatrix(double alpha){
        double[][] rotation = {{Math.cos(alpha), Math.sin(alpha), 0},
                {Math.sin(alpha),Math.cos(alpha), 0},
                {0,0, 1}};
        return new Matrix(rotation);
    }
    public Rotation(double alpha){

        super(rotationMatrix(alpha));
    }
}
