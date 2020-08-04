package com.example.bookapi.repo;

import com.example.bookapi.entity.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepos extends CrudRepository<Book, Integer> {

}