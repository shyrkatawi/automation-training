package java_fundamentals.optionaltask1;

import java.util.List;

/**
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */
class Task3 {
    public static void main(String[] args) {
        List<Integer> list = Methods.getIntsFromScanner();
        if (list.size() != 0) {
            int totalLength = 0;
            for (Integer i : list) {
                totalLength += Methods.calculateLength(i);
            }
            int averageLength = totalLength / list.size();
            StringBuilder elementsWithLengthLessThanAverage = new StringBuilder();
            StringBuilder elementsWithLengthGreaterThanAverage = new StringBuilder();
            for (Integer i : list) {
                int tmpLength = Methods.calculateLength(i);
                if (tmpLength < averageLength) {
                    elementsWithLengthLessThanAverage.append(i).append(" ");
                }
                if (tmpLength > averageLength) {
                    elementsWithLengthGreaterThanAverage.append(i).append(" ");
                }
            }
            System.out.println("average length is " + averageLength);
            System.out.printf("\nelements that have a length less than the average length: %s", elementsWithLengthLessThanAverage.toString());
            System.out.printf("\nelements that have a length greater than the average length: %s", elementsWithLengthGreaterThanAverage.toString());
        }
    }
}
