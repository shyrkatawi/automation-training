package java_fundamentals.optionaltask2;

import java.util.Arrays;

/**
 * 3. Найти сумму элементов матрицы,расположенных между первым и вторым положительными элементами каждой строки
 */
class Task3 {
    public static void main(String[] args) {
        int[][] matrix = Methods.createMatrix(Methods.getMatrixSizeFromScanner());
        Methods.printMatrix(matrix);
        for (int[] array : matrix) {
            int indexOfFirstPositiveNumber = -1;
            int indexOfSecondPositiveNumber = -1;
            boolean isFirstPositive = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    if (isFirstPositive) {
                        indexOfFirstPositiveNumber = i;
                        isFirstPositive = false;
                    } else {
                        indexOfSecondPositiveNumber = i;
                        break;
                    }
                }
            }
            if (indexOfFirstPositiveNumber != -1 && indexOfSecondPositiveNumber != -1) {
                int sum = 0;
                indexOfFirstPositiveNumber++;
                while (indexOfFirstPositiveNumber != indexOfSecondPositiveNumber) {
                    sum += array[indexOfFirstPositiveNumber];
                    indexOfFirstPositiveNumber++;
                }
                System.out.printf("row: %s, between the first and second positive elements: %d\n", Arrays.toString(array), sum);
            }
        }
    }
}