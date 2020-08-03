package com.example.bookapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Publisher {
    @Id
    private Integer publisherId;
    @NonNull
    @Column("publisher_name")
    private String name;
}