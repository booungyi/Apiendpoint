package booungyi.Apiendpoint;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
    //      1. 도서 등록을 위한 API endpoint를 구현하세요 (POST /api/v1/books)
    //      2. 도서 정보를 담을 CreateBookRequest 클래스와 Book 클래스를 구현하세요
    //      3. 도서 등록 요청을 처리할 BookRestController 클래스를 구현하세요
    //      4. 아래 필드에 대한 유효성 검사(validation)를 구현하세요
    @PostMapping("/api/v1/books")
    public void doseguen(@Valid @RequestBody CreateBookRequest createBookRequest) {

        Book books = new Book(
                createBookRequest.title(),
                createBookRequest.author(),
                createBookRequest.isbn(),
                createBookRequest.price(),
                createBookRequest.publishedYear());
        System.out.println(books);
    }
}
