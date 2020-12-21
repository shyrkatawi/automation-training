package fundamentals.optionaltask1;

import java.util.List;

/**
 * 7. Найти число, состоящее только из различных цифр.
 * Если таких чисел несколько, найти первое из них.
 */
class Task7 {
    public static void main(String[] args) {
        List<Integer> integerList = Utils.getIntegerListFromScanner();
        if (integerList.size() != 0) {
            for (Integer i : integerList) {
                if (isContainsDifferentDigits(i)) {
                    System.out.println(i + " contains only of different digits.");
                    break;
                }
            }
        }
    }

    static boolean isContainsDifferentDigits(int n) {
        boolean[] include = new boolean[10];
        while (n > 0) {
            int digit = n % 10;
            if (include[digit]) {
                return false;
            } else {
                include[digit] = true;
            }
            n /= 10;
        }
        return true;
    }
}
