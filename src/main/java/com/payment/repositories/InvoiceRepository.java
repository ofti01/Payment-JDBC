package com.payment.repositories;

import com.payment.connection.SQLConnection;
import com.payment.entities.Invoice;
import com.payment.exceptions.DBException;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class InvoiceRepository implements DaoRepository<Invoice> {

    @Override
    public void insert(Invoice obj) {
        PreparedStatement st = null;
        Connection connection = SQLConnection.getConnection();
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
        PreparedStatement st = null;
        Connection connection = SQLConnection.getConnection();
        try {
            st = connection.prepareStatement("UPDATE invoices SET total=? , reduction = ?,id_customer=?,id_payment=? WHERE  id = ?");
            st.setDouble(1,obj.getTotal());
            st.setDouble(2,obj.getReduction());
            st.setInt(3,obj.getCustomer().getId());
            st.setInt(4,obj.getPayment().getId());
            st.setInt(5,obj.getId());
            st.executeUpdate();
            System.out.println("invoice updated");
            connection.close();

        } catch (SQLException e) {
            throw new DBException("no invoice updated");
        }

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
