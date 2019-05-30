package com.stackroute.jdbcdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class JdbcBatchProcessingDemo {
    public void getAllStudents() throws SQLException {
        Connection connection=null;
        Statement stmt=null;
        //register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Root@123");
            stmt=connection.createStatement();
            stmt.addBatch("delete from course where id=101");
            stmt.addBatch("update course set name='java' where id=1");
            stmt.executeBatch();
            System.out.println("deleted and updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            connection.close();
            stmt.close();
        }

    }}