package com.MarcusBlockChain.example.marcusBlockChain.Repositories;

import com.MarcusBlockChain.example.marcusBlockChain.Model.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {
}
