package com.example.bookapi;

import java.util.Locale;

import com.example.bookapi.entity.Author;
import com.example.bookapi.entity.Book;
import com.example.bookapi.entity.Publisher;
import com.example.bookapi.repo.AuthorRepository;
import com.example.bookapi.repo.BookRepository;
import com.example.bookapi.repo.PublisherRepository;
import com.github.javafaker.Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApiApplication implements CommandLineRunner {
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker(new Locale("in_ID"));
		for (int i = 1; i < 5; ++i) {
			Publisher publisher = new Publisher(i, faker.book().publisher());
			publisherRepository.save(publisher);
		}

		for (int i = 1; i < 5; ++i) {
			Author author = new Author(i, faker.book().author());
			authorRepository.save(author);
		}

		for (int i = 0; i < 20; ++i) {
			// Random random = new Random();
			Publisher publisher = publisherRepository.findById(2).get();
			Author author = authorRepository.findById(2).get();

			bookRepository.save(new Book(faker.book().title(), author, publisher));
		}
	}

}
