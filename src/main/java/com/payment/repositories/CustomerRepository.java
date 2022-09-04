package com.payment.repositories;

import com.payment.connection.SQLConnection;
import com.payment.entities.Customer;
import com.payment.exceptions.DBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerRepository implements DaoRepository<Customer>{


    @Override
    public void insert(Customer obj) {
        PreparedStatement st = null;
        Connection connection = SQLConnection.getConnection();
        try {
            st = connection.prepareStatement("INSERT INTO customers VALUES(?,?,?)");
            st.setInt(1, obj.getId());
            st.setString(2, obj.getName());
            st.setString(3,obj.getEmail());
            st.executeUpdate();
            System.out.println("customer added");
            connection.close();
        } catch (SQLException e) {
            throw new DBException("no Customer affected");
        }

    }

    @Override
    public void update(Customer obj) {
        PreparedStatement st = null;
        Connection connection = SQLConnection.getConnection();
        try {
            st = connection.prepareStatement("UPDATE customers SET name = ?, email = ? where id = ?");
            st.setString(1,obj.getName());
            st.setString(2,obj.getEmail());
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
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
