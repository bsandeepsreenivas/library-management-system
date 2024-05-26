package com.target2024.books.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDTO {

    private String name;
    private String author;
    private String publication;
    private int totalItems;
    private String updateReason;

}
