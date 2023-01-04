package Matrix;

class Matrix {
    private double[][] array = {{1,2,3},{4,5,6}};
    private int rows = 2;
    private int columns = 3;
    void addMatrix(double[][] matrix){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += matrix[i][j];
            }
        }
    }
    void multiplyByNum(double num){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = array[i][j] * num;
            }
        }
    }
    void printMatrix(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
