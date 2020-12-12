package java_fundamentals.optionaltask2;

import java.util.Arrays;

/**
 * 3. Найти сумму элементов матрицы,расположенных между первым и вторым положительными элементами каждой строки
 */
class Task3 {
    public static void main(String[] args) {
        int[][] matrix = Methods.createMatrix(Methods.getMatrixSize());
        Methods.printMatrix(matrix);
        for (int[] array : matrix) {
            int firstPositiveIndex = -1;
            int secondPositiveIndex = -1;
            boolean isFirstPositive = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    if (isFirstPositive) {
                        firstPositiveIndex = i;
                        isFirstPositive = false;
                    } else {
                        secondPositiveIndex = i;
                        break;
                    }
                }
            }
            if (firstPositiveIndex != -1 && secondPositiveIndex != -1) {
                int sum = 0;
                firstPositiveIndex++;
                while (firstPositiveIndex != secondPositiveIndex) {
                    sum += array[firstPositiveIndex];
                    firstPositiveIndex++;
                }
                System.out.printf("row: %s, between the first and second positive elements: %d\n", Arrays.toString(array), sum);
            }
        }
    }
}