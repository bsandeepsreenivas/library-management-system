package com.target2024.books.service;

import com.target2024.books.dto.request.BookRequestDTO;
import com.target2024.books.dto.response.BookResponseDTO;

import java.util.List;

public interface BooksService {

    void addBook(BookRequestDTO bookRequestDTO);
    List<BookResponseDTO> getAllBooks();

}
