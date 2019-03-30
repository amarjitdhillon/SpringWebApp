package com.amar.test.bootstrap;

import com.amar.test.Repositories.AuthorRepository;
import com.amar.test.Repositories.BookRepository;
import com.amar.test.model.Author;
import com.amar.test.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
    }

    void initData()
    {
        Author author = new Author("Amarjit", "Dhillon");
        Book book     = new Book("Thesis Book","1234","Springer");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);

    }
}
