package java_fundamentals.optionaltask1;

import java.util.List;

/**
 * 4. Найти число, в котором количество различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */
class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Methods.getIntsFromScanner();
        if (list.size() != 0) {
            int n = list.get(0);
            int minAmount = getAmountOfDifferentDigits(n);
            for (Integer i : list) {
                int tmpAmount = getAmountOfDifferentDigits(i);
                if (minAmount > tmpAmount) {
                    n = i;
                    minAmount = tmpAmount;
                }
            }
            System.out.println("minimum amount of different digits is " + minAmount);
            System.out.println("number with min amount is " + n);
        }

    }

    static int getAmountOfDifferentDigits(int n) {
        boolean[] include = new boolean[10];
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (!include[digit]) {
                include[digit] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
