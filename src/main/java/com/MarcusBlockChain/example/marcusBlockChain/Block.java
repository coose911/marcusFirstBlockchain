package com.MarcusBlockChain.example.marcusBlockChain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Block {

    private int previousHash;
    private List<Transaction> transaction;
    private String hash;

    public Block(int previousHash, List<Transaction> transaction) throws NoSuchAlgorithmException {
        this.previousHash = previousHash;
        this.transaction = transaction;
        this.hash = generateHash();
    }

    private String generateHash() throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // Creating a simple string from transactions
        StringBuilder transactionData = new StringBuilder();
        for (Transaction t : transaction) {
            transactionData.append(t.toString());
        }

        byte[] hash = md.digest(transactionData.toString().getBytes(StandardCharsets.UTF_8));

        // Convert byte array into signum representation
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for(int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public int getPreviousHash() {
        return previousHash;
    }

//    set previous hash need work so it stores previous hash
    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
// need to find a way of each block storing previous blocks hash
