package com.example.bookapi.repo;

import com.example.bookapi.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Book, Integer> {

}