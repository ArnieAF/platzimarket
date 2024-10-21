package com.platzi.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private int purchateId;
    private String clientId;
    private LocalDateTime date;
    private String payment;
    private String comment;
    private String state;
    private List<PurchaseItem> item;

    public int getPurchateId() {
        return purchateId;
    }

    public void setPurchateId(int purchateId) {
        this.purchateId = purchateId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PurchaseItem> getItem() {
        return item;
    }

    public void setItem(List<PurchaseItem> item) {
        this.item = item;
    }
}