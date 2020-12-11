package java_fundamentals.optionaltask1;

import java.util.Comparator;
import java.util.List;

/**
 * 2. Вывести числа в порядке возрастания (убывания) значений их длины.
 */
class Task2 {
    public static void main(String[] args) {
        List<Integer> list = Methods.getIntsFromScanner();
        if (list.size() != 0) {
            list.sort(Comparator.comparingInt(Methods::calculateLength));
            Methods.printList(list, "sorted elements by length in ascending order");
            list.sort(Comparator.comparingInt(Methods::calculateLength).reversed());
            Methods.printList(list, "sorted elements by length in descending order");
        }
    }
}
