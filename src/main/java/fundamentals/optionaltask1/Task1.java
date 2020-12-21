package fundamentals.optionaltask1;

import java.util.List;

/**
 * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */
class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = Utils.getIntegerListFromScanner();
        if (integerList.size() != 0) {
            int minLength = Utils.calculateLengthOfInteger(integerList.get(0));
            int maxLength = Utils.calculateLengthOfInteger(integerList.get(0));
            for (Integer i : integerList) {
                int tmpLength = Utils.calculateLengthOfInteger(i);
                if (minLength > tmpLength) {
                    minLength = tmpLength;
                }
                if (maxLength < tmpLength) {
                    maxLength = tmpLength;
                }
            }
            StringBuilder elementsWithMinLength = new StringBuilder();
            StringBuilder elementsWithMaxLength = new StringBuilder();
            for (Integer i : integerList) {
                int tmpLength = Utils.calculateLengthOfInteger(i);
                if (minLength == tmpLength) {
                    elementsWithMinLength.append(i).append(" ");
                }
                if (maxLength == tmpLength) {
                    elementsWithMaxLength.append(i).append(" ");
                }
            }
            System.out.printf("\nminimal length is %d, elements: %s", minLength, elementsWithMinLength.toString());
            System.out.printf("\nmaximal length is %d, elements: %s", maxLength, elementsWithMaxLength.toString());
        }
    }
}
