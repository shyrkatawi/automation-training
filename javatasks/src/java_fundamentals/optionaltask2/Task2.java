package java_fundamentals.optionaltask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2. Найти и вывести наибольшее число возрастающих(убывающих)элементов матрицы,идущих подряд.
 */
class Task2 {
    public static void main(String[] args) {
        int[][] matrix = Methods.createMatrix(Methods.getMatrixSize());
        Methods.printMatrix(matrix);

        int[] array = transformMatrixToArray(matrix);
        System.out.println(Arrays.toString(array));

        List<Integer> tmpList = new ArrayList<>();
        List<Integer> increasingElements = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            tmpList.add(array[i]);
            if (array[i] >= array[i + 1]) {
                if (tmpList.size() > increasingElements.size()) {
                    increasingElements = tmpList;
                }
                tmpList = new ArrayList<>();
            }
        }
        System.out.println(increasingElements.toString());
    }

    static int[] transformMatrixToArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix.length];
        int index = 0;
        for (int[] row : matrix) {
            for (int i : row) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}