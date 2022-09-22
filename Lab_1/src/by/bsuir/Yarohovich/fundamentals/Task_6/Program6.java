package by.bsuir.Deschenya.fundamentals.Task_6;

import by.bsuir.Deschenya.fundamentals.Task_4.Program4;

public class Program6 {
    public static void main(String[] args) throws Exception {
        int n = Program4.inputData();
        int[] array = Program4.generateArray(n, 100);
        Program4.outputArray(array);
        int[][] matrix = createMatrix(array);
        outputMatrix(matrix);
    }

    private static int[][] createMatrix(int[] array) {

        int length = array.length;
        int[][] matrix = new int[length][length];
        
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                matrix[i][j] = array[(i + j) % length];
            }
        }

        return matrix;
    }

    private static void outputMatrix(int[][] matrix) {
        int length = matrix.length;

        System.out.println("Result matrix: ");
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                System.out.format("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
