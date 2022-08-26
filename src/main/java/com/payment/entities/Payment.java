package com.payment.entities;


import java.util.List;

public class Payment {
    private int id;
    private TypePayment typePayment;
    private Employee employee;
    private List<Invoice> invoices;

    public Payment() {
    }

    public Payment(int id, TypePayment typePayment, Employee employee) {
        this.id = id;
        this.typePayment = typePayment;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypePayment getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(TypePayment typePayment) {
        this.typePayment = typePayment;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
