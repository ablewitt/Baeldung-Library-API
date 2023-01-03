package app.cunft.baeldungrest;

import app.cunft.baeldungrest.domain.Book;
import app.cunft.baeldungrest.repo.BookRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BaeldungRestApplication {

    @Autowired
    private BookRepository bookRepo;
    @Component
    class DataSetup implements ApplicationRunner{
        @Override
        public void run(ApplicationArguments args) throws Exception{
            bookRepo.save(Book.builder().title("Gone with da wind").isbn("234523452345").build());
            bookRepo.save(Book.builder().title("To killa mopping turd").isbn("456743245645").build());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(BaeldungRestApplication.class, args);
    }

}
