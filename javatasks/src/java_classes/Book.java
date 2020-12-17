package java_classes;

import java.util.Arrays;

class Book {
    private static int counter = 1;
    private int id;
    private String name;
    private String[] writers;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private String binding;

    Book(String name, String[] writers, String publisher, int year, int pages, int price, String binding) {
        this.id = counter;
        counter++;
        this.name = name;
        this.writers = writers;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String[] getWriters() {
        return writers;
    }

    void setWriters(String[] writers) {
        this.writers = writers;
    }

    String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getPages() {
        return pages;
    }

    void setPages(int pages) {
        this.pages = pages;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getBinding() {
        return binding;
    }

    void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", writers=" + Arrays.toString(writers) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", binding='" + binding + '\'';
    }
}
