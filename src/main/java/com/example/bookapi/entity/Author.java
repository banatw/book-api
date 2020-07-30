package com.example.bookapi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Author {
    @Id
    @NonNull
    private Integer authorId;

    @NonNull
    private String name;

    @UpdateTimestamp
    private Date auditDate;
}