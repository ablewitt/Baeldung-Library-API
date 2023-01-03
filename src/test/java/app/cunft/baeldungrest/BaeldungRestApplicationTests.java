package app.cunft.baeldungrest;

import app.cunft.baeldungrest.repo.BookRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BaeldungRestApplicationTests {

    @Autowired
    private BookRepository bookRepo;

    @Test
    void contextLoads() {
    }

    @Test
    void persistenceWorks(){
        assertNotEquals(bookRepo.findAll(), Matchers.emptyIterable());
    }

}
