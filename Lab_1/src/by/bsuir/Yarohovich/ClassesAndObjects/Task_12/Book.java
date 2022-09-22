package by.bsuir.Deschenya.ClassesAndObjects.Task_12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        return title == book.title && author == book.author && price == book.price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + price;
       
        return result;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nPrice: %d\nEdition: %d", title, author, price, edition);
    }
}
