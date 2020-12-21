package java_fundamentals.optionaltask1;

import java.util.List;

/**
 * 4. Найти число, в котором количество различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */
class Task4 {
    public static void main(String[] args) {
        List<Integer> integerList = Methods.getIntegerListFromScanner();
        if (integerList.size() != 0) {
            int n = integerList.get(0);
            int minAmountOfDifferentDigits = getAmountOfDifferentDigits(n);
            for (Integer i : integerList) {
                int tmpAmount = getAmountOfDifferentDigits(i);
                if (minAmountOfDifferentDigits > tmpAmount) {
                    n = i;
                    minAmountOfDifferentDigits = tmpAmount;
                }
            }
            System.out.println("minimum amount of different digits is " + minAmountOfDifferentDigits);
            System.out.println("number with min amount is " + n);
        }

    }

    static int getAmountOfDifferentDigits(int n) {
        boolean[] include = new boolean[10];
        int counter = 0;
        while (n > 0) {
            int digit = n % 10;
            if (!include[digit]) {
                include[digit] = true;
                counter++;
            }
            n /= 10;
        }
        return counter;
    }
}
