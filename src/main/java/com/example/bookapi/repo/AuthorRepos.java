package com.example.bookapi.repo;

import com.example.bookapi.entity.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepos extends CrudRepository<Author, Integer> {

}