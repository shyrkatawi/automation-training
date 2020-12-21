package java_fundamentals.optionaltask2;

import java.util.Random;
import java.util.Scanner;

class Methods {
    static int getMatrixSizeFromScanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the matrix size");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
        }
        System.out.println("ERROR: wrong input, try again");
        return 0;
    }

    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                matrix[i][k] = new Random().nextInt(10);
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int i : array) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
