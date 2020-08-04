package com.example.bookapi.repo;

import com.example.bookapi.entity.Author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepos extends CrudRepository<Author, Integer> {

}