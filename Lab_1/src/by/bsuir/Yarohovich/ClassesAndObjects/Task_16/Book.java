package by.bsuir.Deschenya.ClassesAndObjects.Task_16;

import java.util.Comparator;

public class Book{
    private String title;
    private String author;
    private int price;
    private static int edition;    
    
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;                
    }

    public Book() {}

    public static Comparator<Book> compareByTitle = Comparator.comparing(book -> book.title);
    public static Comparator<Book> compareByAuthor = Comparator.comparing(book -> book.author);
    public static Comparator<Book> compareByPrice = Comparator.comparingInt(book -> book.price);

    public static Comparator<Book> compareByTitleAuthor = compareByTitle.thenComparing(compareByAuthor);
    public static Comparator<Book> compareByAuthorTitle = compareByAuthor.thenComparing(compareByTitle);
    public static Comparator<Book> compareByAuthorTitlePrice = compareByAuthor.thenComparing(compareByTitle.thenComparing(compareByPrice));
    
}
