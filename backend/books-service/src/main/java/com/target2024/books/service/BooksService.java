package com.target2024.books.service;

import com.target2024.books.dto.request.BookDTO;
import com.target2024.books.dto.response.GenericResponse;

public interface BooksService {

    void addBook(BookDTO bookDTO);

}
