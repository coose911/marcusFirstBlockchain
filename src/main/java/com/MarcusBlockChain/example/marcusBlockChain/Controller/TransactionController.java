package com.MarcusBlockChain.example.marcusBlockChain.Controller;



import com.MarcusBlockChain.example.marcusBlockChain.Model.Transaction;
import com.MarcusBlockChain.example.marcusBlockChain.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping(value = "/transactions")
    public List<Transaction> getAllTransactions (){
        return transactionRepository.findAll();
    }
}
