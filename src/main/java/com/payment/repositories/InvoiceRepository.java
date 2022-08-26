package com.payment.repositories;

import com.payment.entities.Invoice;
import com.payment.exceptions.DBException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class InvoiceRepository implements DaoRepository<Invoice> {
    private Connection connection;

    public InvoiceRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Invoice obj) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement("INSERT INTO invoices"
            +"VALUES(?,?,?,?)");
            st.setInt(1,0);
            st.setDouble(2,obj.getTotal());
            st.setDouble(3,obj.getReduction());
            st.setInt(4,obj.getCustomer().getId());
            st.setInt(5,obj.getPayment().getId());

        } catch (SQLException e) {
            throw new DBException("no invoice affected");
        }

    }

    @Override
    public void update(Invoice obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Invoice findById(int id) {
        return null;
    }

    @Override
    public List<Invoice> findAll() {
        return null;
    }
}
