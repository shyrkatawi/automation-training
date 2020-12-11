package java_fundamentals.optionaltask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Methods {
    static List<Integer> getIntsFromScanner() {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<>();
            boolean flag = true;
            while (flag) {
                System.out.println("Enter the number, to stop, enter a non-number");
                if (sc.hasNextInt()) {
                    list.add(sc.nextInt());
                } else {
                    flag = false;
                }
            }
            printList(list,"you entered: ");
            return list;
        }
    }

    static int calculateLength(int n) {
        if (n == 0) {
            return 1;
        }
        int amount = 0;
        while (n != 0) {
            amount++;
            n /= 10;
        }
        return amount;
    }

    static void printList(List<Integer> list, String message) {
        System.out.println(message);
        System.out.println(list.toString());
    }
}
