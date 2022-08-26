package com.payment.entities;

public class Invoice {
    private int id;
    private double total;
    private double reduction;
    private Customer customer;
    private Payment payment;

    public Invoice() {
    }

    public Invoice(int id, double total, double reduction, Customer customer, Payment payment) {
        this.id = id;
        this.total = total;
        this.reduction = reduction;
        this.customer = customer;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
