package java_fundamentals.optionaltask1;

import java.util.List;

/**
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания.
 * Если таких чисел несколько, найти первое из них.
 */
class Task6 {
    public static void main(String[] args) {
        List<Integer> list = Methods.getIntsFromScanner();
        if (list.size() != 0) {
            for (Integer i : list) {
                if (isIncreasingSequence(i)) {
                    System.out.println(i + " is number whose digits are in strict ascending order");
                    break;
                }
            }
        }
    }

    static boolean isIncreasingSequence(int i) {
        int max = 10;
        while (i > 0) {
            int digit = i % 10;
            if (max <= digit) {
                return false;
            }
            max = digit;
            i /= 10;
        }
        return true;
    }
}
