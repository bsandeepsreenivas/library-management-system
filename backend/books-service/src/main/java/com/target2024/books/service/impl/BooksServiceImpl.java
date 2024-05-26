package com.target2024.books.service.impl;

import com.target2024.books.dto.request.BookDTO;
import com.target2024.books.model.Books;
import com.target2024.books.repository.BooksRepository;
import com.target2024.books.service.BooksService;
import com.target2024.books.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public void addBook(BookDTO bookDTO) {
        Books book = new Books();
        book.setName(bookDTO.getName());
        book.setAuthor(bookDTO.getAuthor());
        book.setPublication(bookDTO.getPublication());
        book.setTotalItems(bookDTO.getTotalItems());
        book.setCreatedAt(LocalDateTime.now());
        book.setUpdatedAt(LocalDateTime.now());
        if (null == bookDTO.getUpdateReason()) {
            book.setUpdateReason(Constants.ADD_NEW_BOOK_MESSAGE);
        } else {
            book.setUpdateReason(bookDTO.getUpdateReason());
        }
        booksRepository.save(book);
    }
}
