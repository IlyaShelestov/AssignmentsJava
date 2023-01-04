package Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        double[][] array = {{1,2,3},{4,5,6}};
        matrix.printMatrix();
        matrix.multiplyByNum(3);
        matrix.printMatrix();
        matrix.addMatrix(array);
        matrix.printMatrix();
    }
}