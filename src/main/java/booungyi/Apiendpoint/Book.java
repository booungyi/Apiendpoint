package booungyi.Apiendpoint;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Integer price;
    private Integer publishedYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn) && Objects.equals(price, book.price) && Objects.equals(publishedYear, book.publishedYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn, price, publishedYear);
    }

    public Book(String title, String author, String isbn, Integer price, Integer publishedYear) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
