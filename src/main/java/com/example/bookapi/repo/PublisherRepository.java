package com.example.bookapi.repo;

import com.example.bookapi.entity.Publisher;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}