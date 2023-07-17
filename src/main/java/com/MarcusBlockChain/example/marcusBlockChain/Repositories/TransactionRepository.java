package com.MarcusBlockChain.example.marcusBlockChain.Repositories;


import com.MarcusBlockChain.example.marcusBlockChain.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
