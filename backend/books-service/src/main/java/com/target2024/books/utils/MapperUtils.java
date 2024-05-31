package com.target2024.books.utils;

import com.target2024.books.dto.request.BookRequestDTO;
import com.target2024.books.dto.response.BookResponseDTO;
import com.target2024.books.model.Books;

import java.time.LocalDateTime;

public class MapperUtils {

    public static Books mapBookRequestToBookCollection(BookRequestDTO bookRequestDTO) {
        Books book = new Books();
        book.setName(bookRequestDTO.getName());
        book.setAuthor(bookRequestDTO.getAuthor());
        book.setPublication(bookRequestDTO.getPublication());
        book.setTotalBooks(bookRequestDTO.getTotalBooks());
        book.setAvailableBooks(bookRequestDTO.getTotalBooks());
        book.setDepartment(bookRequestDTO.getDepartment());
        book.setCreatedAt(LocalDateTime.now());
        book.setUpdatedAt(LocalDateTime.now());
        book.setUpdateReason(Constants.ADD_NEW_BOOK_MESSAGE);
        return book;
    }

    public static BookResponseDTO mapBookCollectionToBookResponse(Books book) {
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        bookResponseDTO.setId(book.getId());
        bookResponseDTO.setName(book.getName());
        bookResponseDTO.setAuthor(book.getAuthor());
        bookResponseDTO.setPublications(book.getPublication());
        bookResponseDTO.setDepartment(book.getDepartment());
        bookResponseDTO.setTotalBooks(book.getTotalBooks());
        bookResponseDTO.setAvailableBooks(book.getAvailableBooks());
        bookResponseDTO.setAvailableForLease(bookResponseDTO.getAvailableBooks() > 0);
        return bookResponseDTO;

    }

}
