package com.monica.jpaexample.bootstrap;

import com.monica.jpaexample.model.Author;
import com.monica.jpaexample.model.Book;
import com.monica.jpaexample.model.Publisher;
import com.monica.jpaexample.repository.AuthorRepository;
import com.monica.jpaexample.repository.BookRepository;
import com.monica.jpaexample.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher pub1 = new Publisher("Harper Collins", "Lincoln 11, New York");
        Book ddd = new Book("Domain Driven Design", "1234", pub1);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        this.publisherRepository.save(pub1);
        this.authorRepository.save(eric);
        this.bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher pub2 = new Publisher("Worx", "Sydney street 25, New Work");
        Book noEJB = new Book("J2EE Development without EJB", "23444", pub2);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        this.publisherRepository.save(pub2);
        this.authorRepository.save(rod);
        this.bookRepository.save(noEJB);

    }
}
