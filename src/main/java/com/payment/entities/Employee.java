package com.payment.entities;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String functionEmpl;
    private List<Payment> payments;

    public Employee() {
    }

    public Employee(int id, String name, String functionEmpl) {
        this.id = id;
        this.name = name;
        this.functionEmpl = functionEmpl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunctionEmpl() {
        return functionEmpl;
    }

    public void setFunctionEmpl(String functionEmpl) {
        this.functionEmpl = functionEmpl;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
