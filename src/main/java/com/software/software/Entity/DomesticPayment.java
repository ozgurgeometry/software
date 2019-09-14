package com.software.software.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Domestic")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomesticPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sender_Name")
    private String senderName;

    @Column(name = "recipient_Name")
    private String recipientName;

    @Column(name = "sender_Sort_Code")
    private String senderSortCode;

    @Column(name = "recipient_Sort_Code")
    private String recipientSortCode;

    @Column(name = "sender_Acc_Number")
    private String senderAccNumber;

    @Column(name = "recipient_Acc_Number")
    private String recipientAccNumber;

    @Column(name = "amount")
    private double amount;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getSenderSortCode() {
        return senderSortCode;
    }

    public void setSenderSortCode(String senderSortCode) {
        this.senderSortCode = senderSortCode;
    }

    public String getRecipientSortCode() {
        return recipientSortCode;
    }

    public void setRecipientSortCode(String recipientSortCode) {
        this.recipientSortCode = recipientSortCode;
    }

    public String getSenderAccNumber() {
        return senderAccNumber;
    }

    public void setSenderAccNumber(String senderAccNumber) {
        this.senderAccNumber = senderAccNumber;
    }

    public String getRecipientAccNumber() {
        return recipientAccNumber;
    }

    public void setRecipientAccNumber(String recipientAccNumber) {
        this.recipientAccNumber = recipientAccNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

