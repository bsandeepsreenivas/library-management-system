package com.target2024.books.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookResponseDTO {

    private String id;
    private String name;
    private String author;
    private String publications;
    private String department;
    private int totalBooks;
    private int availableBooks;
    private boolean isAvailableForLease;

}
