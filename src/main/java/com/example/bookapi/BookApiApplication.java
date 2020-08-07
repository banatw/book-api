package com.example.bookapi;

import com.example.bookapi.entity.Author;
import com.example.bookapi.entity.Book;
import com.example.bookapi.entity.Publisher;
import com.example.bookapi.repo.AuthorRepos;
import com.example.bookapi.repo.BookRepos;
import com.example.bookapi.repo.PublisherRepos;
import com.github.javafaker.Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApiApplication implements CommandLineRunner {

	@Autowired
	private BookRepos bookRepos;

	@Autowired
	private AuthorRepos authorRepos;

	@Autowired
	private PublisherRepos publisherRepos;

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Faker faker = new Faker();
		for (int i = 0; i < 5; i++) {
			authorRepos.save(new Author(faker.book().author()));
			publisherRepos.save(new Publisher(faker.book().publisher()));
		}

		for (int i = 0; i < 20; i++) {
			bookRepos.save(new Book(faker.book().title(), 2, 3));
		}
	}

}
