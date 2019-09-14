package com.software.software.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "International")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InternationalPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "senderIban")
    private String senderIban;

    @Column(name = "recipientIban")
    private String recipientIban;

    @Column(name = "bicCode")
    private String bicCode;

    @Column(name = "refMessage")
    private String refMessage;

    @Column(name = "amount")
    private double amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenderIban() {
        return senderIban;
    }

    public void setSenderIban(String senderIban) {
        this.senderIban = senderIban;
    }

    public String getRecipientIban() {
        return recipientIban;
    }

    public void setRecipientIban(String recipientIban) {
        this.recipientIban = recipientIban;
    }

    public String getBicCode() {
        return bicCode;
    }

    public void setBicCode(String bicCode) {
        this.bicCode = bicCode;
    }

    public String getRefMessage() {
        return refMessage;
    }

    public void setRefMessage(String refMessage) {
        this.refMessage = refMessage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}



