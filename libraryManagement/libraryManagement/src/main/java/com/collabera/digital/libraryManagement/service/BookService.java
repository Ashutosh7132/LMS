package com.collabera.digital.libraryManagement.service;

import com.collabera.digital.libraryManagement.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public List<Book> findAll();
    public Book findById(Long id);
    public Book save(Book book);

    public void deleteById(Long id);

    public Book borrowBook(Long bookId, Long userId);

    public Book returnBook(Long bookId);
}
