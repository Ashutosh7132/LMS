package com.collabera.digital.libraryManagement.service;

import com.collabera.digital.libraryManagement.entity.Borrower;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BorrowerService {

    public List<Borrower> findAll();

    public Borrower save(Borrower borrower);
}
