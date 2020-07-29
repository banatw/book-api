package com.example.bookapi;

import java.util.Locale;

import com.example.bookapi.entity.Book;
import com.example.bookapi.repo.BookRepository;
import com.github.javafaker.Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApiApplication implements CommandLineRunner {
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker(new Locale("in_ID"));
		for (int i = 0; i < 100; ++i) {
			bookRepository.save(new Book(faker.book().title(), faker.book().author(), faker.book().publisher(),
					faker.book().genre()));
		}
	}

}
