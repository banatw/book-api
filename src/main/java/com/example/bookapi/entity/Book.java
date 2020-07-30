package com.example.bookapi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    @NonNull
    private String title;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "publisherId")
    private Publisher publisher;

    @UpdateTimestamp
    private Date auditDate;

}