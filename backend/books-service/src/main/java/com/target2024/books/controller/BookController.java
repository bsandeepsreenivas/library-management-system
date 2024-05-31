package com.target2024.books.controller;

import com.target2024.books.dto.request.BookRequestDTO;
import com.target2024.books.dto.response.BookResponseDTO;
import com.target2024.books.dto.response.GenericResponse;
import com.target2024.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BooksService booksService;

    @PostMapping("/books")
    private ResponseEntity<GenericResponse> addBook(@RequestBody BookRequestDTO bookRequestDTO) {
        booksService.addBook(bookRequestDTO);
        GenericResponse response = new GenericResponse("Book added Successfully", LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/books")
    private ResponseEntity<List<BookResponseDTO>> getAllBooks() {
        List<BookResponseDTO> allBooks = booksService.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK);
    }

}
