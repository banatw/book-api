package com.example.bookapi.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Author {
    @Id
    private Integer authorId;
    @NonNull
    private String name;
}