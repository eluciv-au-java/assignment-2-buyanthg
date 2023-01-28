public class Matrix {
    private double[][] data;
    Matrix(double[][] data){
        this.data = data;
    }
    private int numRows(){
        return data.length;
    }
    private int numLines(){
        return data[0].length;
    }
    public Matrix multiply(Matrix other){
        int row = other.numRows();
        int lines = this.numLines();
        int numTerms = this.numRows();
        double[][] res = new double[lines][row];
        for (int i = 0; i < lines; i++){
            for (int j = 0; j < row; j++){
                for (int k = 0; k < numTerms; k++){
                    res[i][j] += this.data[i][k]*other.data[k][j];
                }
            }
        }
        return new Matrix(res);
    }
    double getValue(int row, int column){
        return this.data[row][column];
    }

}
