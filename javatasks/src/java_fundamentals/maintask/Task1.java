package java_fundamentals.maintask;

import java.util.Scanner;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */
class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String usernameFromScanner = scanner.next();
            System.out.printf("Hello %s!\n", usernameFromScanner);
        }
    }
}