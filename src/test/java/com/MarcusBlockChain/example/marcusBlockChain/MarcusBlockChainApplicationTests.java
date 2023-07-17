package com.MarcusBlockChain.example.marcusBlockChain;

import com.MarcusBlockChain.example.marcusBlockChain.Model.Block;
import com.MarcusBlockChain.example.marcusBlockChain.Model.Transaction;
import com.MarcusBlockChain.example.marcusBlockChain.Repositories.BlockRepository;
import com.MarcusBlockChain.example.marcusBlockChain.Repositories.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class MarcusBlockChainApplicationTests {

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
//		Transaction transaction3 = new Transaction("Jenyth", "Marcus", 1000L);
//		Transaction transaction4 = new Transaction("Jenyth", "Marcus", 1000L);

		Block block1 = new Block("0", Arrays.asList(transaction1, transaction2));
//		Block block2 = new Block(block1.getHash(), Arrays.asList(transaction3, transaction4));

		transaction1.setBlock(block1);
		transaction2.setBlock(block1);
		blockRepository.save(block1);


		transactionRepository.saveAll(Arrays.asList(transaction1, transaction2));

//		blockRepository.save(block2);
//		transaction3.setBlock(block2);
//		transaction4.setBlock(block2);
//		transactionRepository.saveAll(Arrays.asList(transaction3, transaction4));

	}

}
