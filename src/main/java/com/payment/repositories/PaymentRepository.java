package com.payment.repositories;

import com.payment.connection.SQLConnection;
import com.payment.entities.Payment;
import com.payment.entities.TypePayment;
import com.payment.exceptions.DBException;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PaymentRepository implements DaoRepository<Payment>{

    @Override
    public void insert(Payment obj) {
        PreparedStatement st = null;
        Connection connection = SQLConnection.getConnection();
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
        PreparedStatement st = null;
        Connection connection = SQLConnection.getConnection();
        try {
            st = connection.prepareStatement("UPDATE payments SET type_payment = ? , id_employee = ? WHERE id = ? ");
            st.setString(1,obj.getTypePayment().toString());
            st.setInt(2,obj.getEmployee().getId());
            st.setInt(3,obj.getId());
            st.executeUpdate();
            System.out.println("customer updated");
            connection.close();

        } catch (SQLException e) {
            throw new DBException("no customer updated");
        }
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
