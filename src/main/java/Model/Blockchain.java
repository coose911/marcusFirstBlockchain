package Model;

import Model.Block;
import Model.Transaction;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Blockchain {

    public static void main(String[] args) throws NoSuchAlgorithmException {


        Transaction transaction1 = new Transaction("Marcus", "Jenyth", 1000L);
        Transaction transaction2 = new Transaction("Jenyth", "Marcus", 1000L);
        Transaction transaction3 = new Transaction("Jenyth", "Marcus", 1000L);
        Block block = new Block("0", Arrays.asList(transaction1, transaction2));
        block.getHash();
        Block block1 = new Block(block.getHash(), Arrays.asList(transaction3));
        System.out.println(block.getHash());
        System.out.println(block1.getHash());
        System.out.println(block1.getPreviousHash());



    }
}
