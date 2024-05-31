package com.target2024.books.service.impl;

import com.target2024.books.dto.request.BookRequestDTO;
import com.target2024.books.dto.response.BookResponseDTO;
import com.target2024.books.model.Books;
import com.target2024.books.repository.BooksRepository;
import com.target2024.books.service.BooksService;

import com.target2024.books.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public void addBook(BookRequestDTO bookRequestDTO) {
        booksRepository.save(MapperUtils.mapBookRequestToBookCollection(bookRequestDTO));
    }

    @Override
    public List<BookResponseDTO> getAllBooks() {
        List<Books> books = booksRepository.findAll();
        return books.stream()
                .map(MapperUtils::mapBookCollectionToBookResponse)
                .collect(Collectors.toList());
    }
}
