package com.MarcusBlockChain.example.marcusBlockChain.Controller;


import com.MarcusBlockChain.example.marcusBlockChain.Model.Block;
import com.MarcusBlockChain.example.marcusBlockChain.Repositories.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlockController {

    @Autowired
    BlockRepository blockRepository;

    @GetMapping(value = "/blockchain")
    public List<Block> getAllBlocks() {
        return blockRepository.findAll();
    }
}


