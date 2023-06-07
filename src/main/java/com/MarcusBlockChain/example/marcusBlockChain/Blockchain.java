package com.MarcusBlockChain.example.marcusBlockChain;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

public class Blockchain {

    public static void main(String[] args) throws NoSuchAlgorithmException {


        Transaction transaction1 = new Transaction("Marcus", "Jenyth", 1000L);
        Transaction transaction2 = new Transaction("Jenyth", "Marcus", 1000L);
        Block block = new Block(0, Arrays.asList(transaction1, transaction2));


    }
}
