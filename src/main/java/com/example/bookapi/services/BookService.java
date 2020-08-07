package com.example.bookapi.services;

import java.util.List;

import com.example.bookapi.output_model.BookModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<BookModel> getBook() {
        String sql = "SELECT book_id,title,b.name as author_name,c.name as publisher_name FROM book a "
                + "JOIN author b ON a.author_id = b.author_id JOIN publisher c ON c.publisher_id = a.publisher_id";
        return jdbcTemplate.query(sql, (RowMapper) (rs, rowNum) -> {
            BookModel bookModel = new BookModel(rs.getInt("book_id"), rs.getString("title"),
                    rs.getString("author_name"), rs.getString("publisher_name"));
            return bookModel;
        });
    }
}