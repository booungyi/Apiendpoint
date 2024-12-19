package booungyi.Apiendpoint;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.util.Objects;

public record CreateBookRequest(@Size(min = 2, max = 10) String title,
                                @Size(min = 2, max = 10) String author,
                                @Size(max = 13, min = 13) String isbn,
                                @Min (1) Integer price,
                                @Min(1900) @Max(2024) Integer publishedYear
) {
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBookRequest that = (CreateBookRequest) o;
        return Objects.equals(isbn, that.isbn) && Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(price, that.price) && Objects.equals(publishedYear, that.publishedYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn, price, publishedYear);
    }

//    @Override
//    public String title() {
//        if (title.length()<2||title.length()>50) {
//            throw new IllegalArgumentException("2자 이상 50자 이하");
//        }
//        return title;
//    }
//
//    @Override
//    public String author() {
//        if (author.length() < 2 || author.length() < 50) {
//            throw new IllegalArgumentException("2자 이상 50자 이하");
//        }
//        return author;
//    }
//
//    @Override
//    public String isbn() {
//        if (!(isbn.length()==13)) {
//            throw new IllegalArgumentException("13자리 숫자");
//        }
//        return isbn;
//    }
//
//    @Override
//    public Integer price() {
//        if (price <= 0) {
//            throw new IllegalArgumentException("2자 이상 50자 이하");
//        }
//        return price;
//    }
//
//    @Override
//    public Integer publishedYear() {
//        if (publishedYear < 1900 || publishedYear > 2024) {
//            throw new IllegalArgumentException("2자 이상 50자 이하");
//        }
//        return publishedYear;
//    }
}
