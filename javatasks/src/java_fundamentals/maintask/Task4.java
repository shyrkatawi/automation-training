package java_fundamentals.maintask;

/**
 * 4. Ввести целые числа как аргументы командной строки,
 * подсчитать их сумму (произведение) и вывести результат на консоль.
 */
class Task4 {
    public static void main(String[] args) {
        args = new String[]{"1", "2", "3", "4"};
        int sum = 0;
        int multiply = 1;

        for (String s : args) {
            int i = Integer.parseInt(s);
            sum += i;
            multiply *= i;
        }
        System.out.println("the result of the sum is " + sum);
        System.out.println("the result of the multiplication is " + multiply);
    }
}
