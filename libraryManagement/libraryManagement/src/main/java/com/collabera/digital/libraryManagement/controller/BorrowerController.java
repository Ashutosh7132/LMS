package com.collabera.digital.libraryManagement.controller;

import com.collabera.digital.libraryManagement.entity.Borrower;
import com.collabera.digital.libraryManagement.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrowers")
public class BorrowerController {
    @Autowired
    private BorrowerService borrowerService;

    @GetMapping
    public List<Borrower> getAllBorrowers() {
        return borrowerService.findAll();
    }

    @PostMapping
    public Borrower addBorrower(@RequestBody Borrower borrower) {
        return borrowerService.save(borrower);
    }
}
