package com.stackroute.jdbcdemo;

import java.sql.*;

public class PreparedStatementDemo {
    public void getAllStudents() throws SQLException {
        Connection connection=null;
      PreparedStatement stmt=null;
        //register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Root@123");
        stmt=connection.prepareStatement("insert into course values(?,?,?)");
        stmt.setInt(1,101);//1 specifies the first parameter in the query
        stmt.setString(2,"Core");
        stmt.setInt(3,20);

        int i=stmt.executeUpdate();
        System.out.println(i+" records inserted");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            stmt.close();
            connection.close();

            }

        }
        }

