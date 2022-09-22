package by.bsuir.Deschenya.ClassesAndObjects.Task_14;

public class Book{
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public Book clone() {
        Book newBook = new Book();
        newBook.title = this.title;
        newBook.author = this.author;
        newBook.price = this.price;  
        
        return newBook;
    }
}
