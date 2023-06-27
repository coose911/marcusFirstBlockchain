package Model;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "transactions")

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "recipient")
    private String recipient;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "hash")
    private int hash;

    public Transaction(){};

    public Transaction(String name, String recipient, Long amount) {
        this.name = name;
        this.recipient = recipient;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

//    public int getHash() {
//        return hash;
//    }
//
//    public void setHash(int hash) {
//        this.hash = hash;
//    }
//  comment this out just now so i can work on blocks before giving transactions their own unique identifier
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Transaction that = (Transaction) o;
//        return Objects.equals(name, that.name) && Objects.equals(recipient, that.recipient) && Objects.equals(amount, that.amount);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, recipient, amount);
//    }
}
