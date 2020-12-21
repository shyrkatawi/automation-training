package java_fundamentals.maintask;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
class Task2 {
    public static void main(String[] args) {
        args = new String[]{"0", "1", "2"};
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}