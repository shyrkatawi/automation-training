package java_fundamentals.optionaltask2;

/**
 * 4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы,его содержащие
 */
class Task4 {
    public static void main(String[] args) {
        int[][] matrix = Methods.createMatrix(Methods.getMatrixSize());
        Methods.printMatrix(matrix);

        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int i : row) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println("max: " + max);

        boolean[] deleteRow = new boolean[matrix.length];
        boolean[] deleteColumn = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[i][k] == max) {
                    deleteRow[i] = true;
                    deleteColumn[k] = true;
                }
            }
        }
        int row = 0;
        int column = 0;
        for (boolean b : deleteRow) {
            if (!b) {
                row++;
            }
        }
        for (boolean b : deleteColumn) {
            if (!b) {
                column++;
            }
        }
        int[][] resultMatrix = new int[row][column];
        int rowTmp = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (!deleteRow[i]) {
                int columnTmp = 0;
                for (int k = 0; k < matrix[i].length; k++) {
                    if (!deleteColumn[k]) {
                        resultMatrix[rowTmp][columnTmp] = matrix[i][k];
                        columnTmp++;
                    }
                }
                rowTmp++;
            }
        }
        Methods.printMatrix(resultMatrix);
    }
}