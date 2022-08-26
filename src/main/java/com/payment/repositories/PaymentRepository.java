package com.payment.repositories;

import com.payment.entities.Payment;
import com.payment.entities.TypePayment;
import com.payment.exceptions.DBException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PaymentRepository implements DaoRepository<Payment>{
    private Connection connection;

    public PaymentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Payment obj) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement("INSERT INTO payments"
                    +"VALUES(?,?,?)");
            st.setInt(1,0);
            st.setString(2, String.valueOf(TypePayment.CARD));
            st.setInt(3,obj.getEmployee().getId());

        } catch (SQLException e) {
            throw new DBException("no Payment affected");
        }
    }

    @Override
    public void update(Payment obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Payment findById(int id) {
        return null;
    }

    @Override
    public List<Payment> findAll() {
        return null;
    }
}
