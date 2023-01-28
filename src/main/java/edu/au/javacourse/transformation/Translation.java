public class Translation extends AffineTrasformation{
    private static Matrix translationMatrix(double dx, double dy){
        double[][] translation = {{1, 0, 0},
                                {0, 1, 0},
                                {dx, dy, 1}};
        return new Matrix(translation);
    }
    public Translation(double dx, double dy){

        super(translationMatrix(dx,dy));
    }
}
