package com.collabera.digital.libraryManagement.service.impl;

import com.collabera.digital.libraryManagement.entity.Book;
import com.collabera.digital.libraryManagement.entity.Borrower;
import com.collabera.digital.libraryManagement.repository.BookRepository;
import com.collabera.digital.libraryManagement.repository.BorrowerRepository;
import com.collabera.digital.libraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowerRepository borrowerRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book borrowBook(Long bookId, Long userId) {
        Book book = findById(bookId);
        Borrower borrower = borrowerRepository.findById(userId).orElse(null);

        if (book != null && !book.isBorrowed() && borrower != null) {
            book.setBorrowedBy(borrower);
            book.setBorrowed(true);
            return save(book);
        }
        // Handle errors (e.g., book not found, book already borrowed, user not found)
        return null;
    }

    public Book returnBook(Long bookId) {
        Book book = findById(bookId);
        if (book != null && book.isBorrowed()) {
            book.setBorrowedBy(null);
            book.setBorrowed(false);
            return save(book);
        }
        // Handle errors (e.g., book not found, book not borrowed)
        return null;
    }
}