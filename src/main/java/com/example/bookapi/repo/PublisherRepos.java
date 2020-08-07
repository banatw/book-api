package com.example.bookapi.repo;

import com.example.bookapi.entity.Publisher;

import org.springframework.data.repository.CrudRepository;

public interface PublisherRepos extends CrudRepository<Publisher, Integer> {

}