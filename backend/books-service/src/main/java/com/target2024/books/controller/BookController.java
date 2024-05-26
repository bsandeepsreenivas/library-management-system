package com.target2024.books.controller;

import com.target2024.books.dto.request.BookDTO;
import com.target2024.books.dto.response.GenericResponse;
import com.target2024.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BooksService booksService;

    @PostMapping("/books")
    private ResponseEntity<GenericResponse> addBook(@RequestBody BookDTO bookDTO) {
        booksService.addBook(bookDTO);
        GenericResponse response = new GenericResponse("Book added Successfully", LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
