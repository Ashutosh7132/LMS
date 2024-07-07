package com.collabera.digital.libraryManagement.repository;

import com.collabera.digital.libraryManagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
