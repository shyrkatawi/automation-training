package fundamentals.optionaltask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Utils {
    static List<Integer> getIntegerListFromScanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> integerList = new ArrayList<>();
            boolean isContinueInput = true;
            while (isContinueInput) {
                System.out.println("Enter the number, to stop, enter a non-number");
                if (scanner.hasNextInt()) {
                    integerList.add(scanner.nextInt());
                } else {
                    isContinueInput = false;
                }
            }
            printList(integerList,"you entered: ");
            return integerList;
        }
    }

    static int calculateLengthOfInteger(int i) {
        if (i == 0) {
            return 1;
        }
        int length = 0;
        while (i != 0) {
            length++;
            i /= 10;
        }
        return length;
    }

    static void printList(List<Integer> list, String message) {
        System.out.println(message);
        System.out.println(list.toString());
    }
}
