package java_fundamentals.maintask;

import java.time.Month;
import java.util.Scanner;

/**
 * 5.Ввести число от 1 до 12.
 * Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */
class Task5 {
    public static void main(String[] args) {
        int numberOfTheMonth = getNumberOfTheMonthFromScanner();
        if (numberOfTheMonth != 0) {
            System.out.println("Month name is " + Month.of(numberOfTheMonth).name());
        }
    }

    private static int getNumberOfTheMonthFromScanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of the month (n > 0 and n < 13)");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n > 0 && n < 13) {
                    return n;
                }
            }
            System.out.println("ERROR: wrong input, try again");
            return 0;
        }
    }
}
