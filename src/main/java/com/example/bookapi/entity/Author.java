package com.example.bookapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Table("author")
public class Author {
    @Id
    private Integer authorId;
    @NonNull
    @Column(value = "author_name")
    private String name;
}