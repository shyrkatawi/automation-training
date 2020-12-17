package java_fundamentals.optionaltask1;

import java.util.List;

/**
 * 5. Найти количество чисел, содержащих только четные цифры,
 * а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 */
class Task5 {
    public static void main(String[] args) {
        List<Integer> integerList = Methods.getIntegerListFromScanner();
        if (integerList.size() != 0) {
            int counterOfNumbersThatHaveOnlyEvenDigits = 0;
            int counterOfNumbersThatHaveSameNumberOfEvenAndOdd = 0;
            for (Integer i : integerList) {
                int numberOfEven = 0;
                int numberOfOdd = 0;
                while (i > 0) {
                    int digit = i % 10;
                    if (isEven(digit)) {
                        numberOfEven++;
                    } else {
                        numberOfOdd++;
                    }
                    i /= 10;
                }
                if (numberOfOdd == 0) {
                    counterOfNumbersThatHaveOnlyEvenDigits++;
                } else if (numberOfEven == numberOfOdd) {
                    counterOfNumbersThatHaveSameNumberOfEvenAndOdd++;
                }
            }
            System.out.println("the number of numbers with only even digits is " + counterOfNumbersThatHaveOnlyEvenDigits);
            System.out.println("the number of numbers with the same number of even and odd digits is " + counterOfNumbersThatHaveSameNumberOfEvenAndOdd);
        }
    }

    static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
