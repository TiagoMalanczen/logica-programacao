package treinologica.matrizes;

public class SpiralMatrix {

    public static void spiralMatrix(int [][] matrix){
        int rowIni = 0;
        int rowFin = matrix.length -1;
        int columnIni = 0;
        int columnFin = matrix.length -1;

        while (rowIni <= rowFin && columnIni <= columnFin){
            for(int i =columnIni ; i<= columnFin; i++){
                System.out.print(matrix[rowIni][i] + " ");
            }
            rowIni++;
            for(int i = rowIni; i<= rowFin; i++){
                System.out.print(matrix[i][columnFin] + " ");
            }
            columnFin--;

            for(int i = columnFin; i>=columnIni;i--){
                System.out.print(matrix[rowFin][i] + " ");
            }
            rowFin--;

            for(int i = rowFin; i >= rowIni; i--){
                System.out.print(matrix[i][columnIni] + " ");
            }
            columnIni++;

        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        spiralMatrix(matrix);
    }
}
