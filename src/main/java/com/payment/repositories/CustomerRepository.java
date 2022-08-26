package com.payment.repositories;

import com.payment.entities.Customer;
import com.payment.exceptions.DBException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CustomerRepository implements DaoRepository<Customer>{
    private Connection connection;

    public CustomerRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Customer obj) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement("INSERT INTO customers"
                    +"VALUES(?,?,?)");
            st.setInt(1, 0);
            st.setString(2, obj.getName());
            st.setString(3,obj.getEmail());

        } catch (SQLException e) {
            throw new DBException("no Customer affected");
        }
    }

    @Override
    public void update(Customer obj) {

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