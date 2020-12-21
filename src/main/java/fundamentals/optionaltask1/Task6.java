package fundamentals.optionaltask1;

import java.util.List;

/**
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания.
 * Если таких чисел несколько, найти первое из них.
 */
class Task6 {
    public static void main(String[] args) {
        List<Integer> integerList = Utils.getIntegerListFromScanner();
        if (integerList.size() != 0) {
            for (Integer i : integerList) {
                if (isIncreasingSequence(i)) {
                    System.out.println(i + " is number whose digits are in strict ascending order");
                    break;
                }
            }
        }
    }

    static boolean isIncreasingSequence(int i) {
        int limit = 10;
        while (i > 0) {
            int digit = i % 10;
            if (limit <= digit) {
                return false;
            }
            limit = digit;
            i /= 10;
        }
        return true;
    }
}
