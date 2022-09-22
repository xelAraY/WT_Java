package by.bsuir.Deschenya.ClassesAndObjects.Task_15;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition = 0;    
    
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;        
        this.isbn = edition++;
    }

    @Override
    public int compareTo(Book book) {
        if (this.isbn > book.isbn)
            return 1;
        else if (this.isbn < book.isbn)
            return -1;
        else
            return 0;
    }
}
