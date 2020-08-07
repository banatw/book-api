package com.example.bookapi.controller;

import java.util.List;

import com.example.bookapi.entity.Book;
import com.example.bookapi.output_model.BookModel;
import com.example.bookapi.repo.BookRepos;
import com.example.bookapi.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Autowired
    private BookRepos bookRepos;

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getBooksByTitle(@RequestParam("title") String title) {
        return bookRepos.findByTitle(title);
    }

    @GetMapping("/book/{id}")
    public Book getBooksById(@PathVariable("id") Integer id) {
        return bookRepos.cariById(id);
    }

    @GetMapping("/books")
    public List<Book> getAll(@RequestParam("size") Integer size, @RequestParam("page") Integer page) {
        return bookRepos.findAll(PageRequest.of(page, size)).toList();
    }

    @GetMapping("/books1")
    public List<BookModel> getAll() {
        return bookService.getBook();
    }
}