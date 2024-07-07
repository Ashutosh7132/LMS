package com.collabera.digital.libraryManagement.service.impl;

import com.collabera.digital.libraryManagement.entity.Borrower;
import com.collabera.digital.libraryManagement.repository.BorrowerRepository;
import com.collabera.digital.libraryManagement.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;
    @Override
    public List<Borrower> findAll() {
        return borrowerRepository.findAll();
    }

    @Override
    public Borrower save(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }
}
