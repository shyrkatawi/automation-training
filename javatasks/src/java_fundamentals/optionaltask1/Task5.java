package java_fundamentals.optionaltask1;

import java.util.List;

/**
 * 5. Найти количество чисел, содержащих только четные цифры,
 * а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 */
class Task5 {
    public static void main(String[] args) {
        List<Integer> list = Methods.getIntsFromScanner();
        if (list.size() != 0) {
            int onlyEvenCount = 0;
            int countOfSameNumberOfEvenAndOdd = 0;
            for (Integer i : list) {
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
                    onlyEvenCount++;
                } else if (numberOfEven == numberOfOdd) {
                    countOfSameNumberOfEvenAndOdd++;
                }
            }
            System.out.println("the number of numbers with only even digits is " + onlyEvenCount);
            System.out.println("the number of numbers with the same number of even and odd digits is " + countOfSameNumberOfEvenAndOdd);
        }
    }

    static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
