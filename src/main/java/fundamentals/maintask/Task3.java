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
            System.out.println(generateRandomInt(limit));
        }
        for (int i = 0; i < limit; i++) {
            System.out.print(generateRandomInt(limit));
        }
    }

    private static int getNumberFromScanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("ERROR: wrong input, try again");
            return 0;
        }
    }

    private static int generateRandomInt(int bound) {
        return new Random().nextInt(bound+5);
    }
}
