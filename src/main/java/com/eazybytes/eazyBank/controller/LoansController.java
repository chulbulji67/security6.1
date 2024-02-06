package com.eazybytes.eazyBank.controller;



import com.eazybytes.eazyBank.model.Loans;
import com.eazybytes.eazyBank.ripository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {

    @Autowired
    private LoanRepository loanRepository;

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestParam int id) {
        List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(id);
//        System.out.println(loans.get(0).getLoanNumber());
        if (loans != null ) {
            return loans;
        }else {
            return null;
        }
    }

}