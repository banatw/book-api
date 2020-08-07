package com.example.bookapi.repo;

import java.util.List;

import com.example.bookapi.entity.Book;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepos extends PagingAndSortingRepository<Book, Integer> {
    @Query("SELECT * FROM book WHERE LOWER(title) LIKE :title || '%'")
    List<Book> findByTitle(@Param("title") String title);

    @Query("SELECT * FROM book WHERE book_id=:id")
    Book cariById(@Param("id") Integer id);
}