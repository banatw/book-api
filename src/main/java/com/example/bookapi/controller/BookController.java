package com.example.bookapi.controller;

import java.util.List;

import com.example.bookapi.entity.Book;
import com.example.bookapi.repo.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = "book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @PostMapping(value = "")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping(value = "/{id}")
    public Book getBook(@PathVariable("id") Integer id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping(value = "/{id}")
    public Book updateBook(@PathVariable("id") Integer id, @RequestBody Book book) {
        try {
            Book oBook = bookRepository.findById(id).get();
            oBook.setTitle(book.getTitle());
            oBook.setAuthor(book.getAuthor());
            oBook.setPublisher(book.getPublisher());
            return bookRepository.save(oBook);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping(value = "/{id}")
    public void deleteBook(@PathVariable("id") Integer id) {
        try {
            bookRepository.deleteById(id);
        } catch (Exception e) {
            // TODO: handle exception
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}