package com.example.bookapi.output_model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookModel {
    private Integer idBook;
    private String title;
    private String author;
    private String publisher;
}