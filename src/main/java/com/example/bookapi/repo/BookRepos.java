package com.example.bookapi.repo;

import com.example.bookapi.entity.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepos extends CrudRepository<Book, Integer> {

}