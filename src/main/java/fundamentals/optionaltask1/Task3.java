package fundamentals.optionaltask1;

import java.util.List;

/**
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */
class Task3 {
    public static void main(String[] args) {
        List<Integer> integerList = Utils.getIntegerListFromScanner();
        if (integerList.size() != 0) {
            int totalLength = 0;
            for (Integer i : integerList) {
                totalLength += Utils.calculateLengthOfInteger(i);
            }
            int averageLength = totalLength / integerList.size();
            StringBuilder elementsWithLengthLessThanAverage = new StringBuilder();
            StringBuilder elementsWithLengthGreaterThanAverage = new StringBuilder();
            for (Integer i : integerList) {
                int tmpLength = Utils.calculateLengthOfInteger(i);
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
