package java_fundamentals.optionaltask2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 */
class Task1 {
    public static void main(String[] args) {
        int[][] matrix = Methods.createMatrix(Methods.getMatrixSizeFromScanner());
        int k = 3;
        Methods.printMatrix(matrix);
        sortRowsByColumnValues(matrix, k);
        Methods.printMatrix(matrix);
        sortColumnsByRowsValues(matrix, k);
        Methods.printMatrix(matrix);
    }

    static void sortRowsByColumnValues(int[][] matrix, int k) {
        if (k > -1 && k < matrix.length) {
            Arrays.sort(matrix, Comparator.comparingInt(arr -> arr[k]));
        }
    }

    static void sortColumnsByRowsValues(int[][] matrix, int k) {
        if (k > -1 && k < matrix.length) {
            boolean isSorted = false;
            while (!isSorted) {
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[k][i] > matrix[k][i + 1]) {
                        swapColumns(matrix, i, i + 1);
                        isSorted = false;
                    } else {
                        isSorted = true;
                    }
                }
            }
        }
    }

    static void swapColumns(int[][] matrix, int first, int second) {
        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][first];
            matrix[i][first] = matrix[i][second];
            matrix[i][second] = tmp;
        }
    }
}