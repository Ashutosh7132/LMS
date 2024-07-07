package com.collabera.digital.libraryManagement.repository;

import com.collabera.digital.libraryManagement.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
