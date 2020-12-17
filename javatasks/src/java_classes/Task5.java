package java_classes;

/**
 * 5. Создать класс Book, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book:
 * —id,
 * —название,
 * —автор(ы),
 * —издательство,
 * —год издания,
 * —количество страниц,
 * —цена,
 * —тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
class Task5 {
    public static void main(String[] args) {
        Books books = new Books(new Book[]{
                new Book("name1", new String[]{"wrtr1","wrtr2"},"pub1",1111,11,1,"type"),
                new Book("name2", new String[]{"wrtr3","wrtr2"},"pub2",1222,111,1,"type1"),
                new Book("name3", new String[]{"wrtr4","wrtr5"},"pub3",1122,112,1,"type2"),
                new Book("name4", new String[]{"wrtr4","wrtr6"},"pub2",1211,131,1,"type3"),
                new Book("name5", new String[]{"wrtr2"},"pub1",1321,11,144,"type4"),
        });

        books.showBooksByPublisher("pub1");
        books.showBooksByWriter("wrtr2");
        books.showBooksReleasedAfterSpecifiedYear(1200);
    }
}
