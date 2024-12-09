public class MatrixMultiplication{
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        int[][] matrix3 =matrixMult(matrix1, matrix2);
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(matrix3[i][j]);
            }
        }

    }
    public static int[][] matrixMult(int[][] matrix1,int[][] matrix2 ){
        int[][] fMatrix = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                fMatrix[i][j] = matrix1[i][j] * matrix2[j][i];
            }
        }
        return fMatrix;
    }
}