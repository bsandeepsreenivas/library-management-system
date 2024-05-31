package com.target2024.books.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookRequestDTO {
    private String name;
    private String author;
    private String publication;
    private String department;
    private int totalBooks;
}
