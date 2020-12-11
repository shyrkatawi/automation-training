package java_fundamentals.maintask;

import java.util.Random;
import java.util.Scanner;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */
class Task3 {
    public static void main(String[] args) {
        int limit = getNumberFromScanner();
        for (int i = 0; i < limit; i++) {
            System.out.println(getRandomInt());
        }
        for (int i = 0; i < limit; i++) {
            System.out.print(getRandomInt());
        }
    }

    private static int getNumberFromScanner() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("ERROR: wrong input, try again");
            return 0;
        }
    }

    private static int getRandomInt() {
        return new Random().nextInt(10);
    }
}
