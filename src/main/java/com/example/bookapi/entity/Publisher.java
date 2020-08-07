package com.example.bookapi.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Publisher {
    @Id
    private Integer publisherId;
    @NonNull
    private String name;
}