package com.MarcusBlockChain.example.marcusBlockChain;

import Model.Block;
import Model.Transaction;
import Repositories.BlockRepository;
import Repositories.BlockchainRepository;
import Repositories.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@SpringBootTest
class MarcusBlockChainApplicationTests {

	@Autowired
	BlockchainRepository blockchainRepository;
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	BlockRepository blockRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createBlock() throws NoSuchAlgorithmException {

		Transaction transaction1 = new Transaction("Marcus", "Jenyth", 1000L);
		Transaction transaction2 = new Transaction("Jenyth", "Marcus", 1000L);
		Transaction transaction3 = new Transaction("Jenyth", "Marcus", 1000L);
		Block block = new Block("0", Arrays.asList(transaction1, transaction2));
		Block block1 = new Block(block.getHash(), Arrays.asList(transaction3));
		transactionRepository.save(transaction1);



		// Add any assertions or test logic here
	}

}
