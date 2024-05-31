package com.target2024.books.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    private String id;
    private String name;
    private String author;
    private String publication;
    private String department;
    private int totalBooks;
    private int availableBooks;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String updateReason;

}
