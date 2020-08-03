package com.example.bookapi.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Book {
    @Id
    private Integer bookId;

    @NonNull
    private String title;
    @NonNull
    private Integer publisherId;
    @NonNull
    private Integer authorId;

}