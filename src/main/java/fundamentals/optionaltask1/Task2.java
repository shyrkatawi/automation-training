package fundamentals.optionaltask1;

import java.util.Comparator;
import java.util.List;

/**
 * 2. Вывести числа в порядке возрастания (убывания) значений их длины.
 */
class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = Utils.getIntegerListFromScanner();
        if (integerList.size() != 0) {
            integerList.sort(Comparator.comparingInt(Utils::calculateLengthOfInteger));
            Utils.printList(integerList, "sorted elements by length in ascending order");
            integerList.sort(Comparator.comparingInt(Utils::calculateLengthOfInteger).reversed());
            Utils.printList(integerList, "sorted elements by length in descending order");
        }
    }
}
