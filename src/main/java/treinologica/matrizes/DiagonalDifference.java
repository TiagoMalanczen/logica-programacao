package treinologica.matrizes;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] matrix) {
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i< matrix.length; i++){
            mainDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][matrix.length - i - 1];
        }
        return Math.abs(mainDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };
        System.out.println(diagonalDifference(matrix));
    }
}
