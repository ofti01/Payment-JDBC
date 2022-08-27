package com.payment.connection;

import com.payment.exceptions.DBException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class SQLConnection {

    public static final String URL = "jdbc:mysql://localhost:3306/paymentsystem";
    public static final String USER = "root";
    public static final String PASSWORD = "12345";
    public static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("ok connection");
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        if(connection!= null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }

    }
}
