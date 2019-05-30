package com.stackroute.jdbcdemo;

import java.sql.*;

public class JdbcTransactionDemo {
    public void getAllStudents() throws SQLException {
        Connection connection=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Root@123");
            connection.setAutoCommit(false);

    stmt=connection.createStatement();
    stmt.executeUpdate("insert into course values(19,'jquery',40)");
    stmt.executeUpdate("insert into course values(20,'hibernet',50)");
            System.out.println("records inserted");
    connection.commit();
    connection.rollback();

}
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            connection.close();
            stmt.close();
        }

    }
        }
