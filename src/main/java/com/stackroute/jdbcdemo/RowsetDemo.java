package com.stackroute.jdbcdemo;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowsetDemo {
    public void getAllStudents() throws SQLException {
        Connection connection = null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Root@123");
            //creating statement
            stmt=connection.createStatement();

            // Executing query
            rs=stmt.executeQuery("select * from course");

            RowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
           ((CachedRowSet) rowSet).populate(rs);
            while (rowSet.next()) {
                int id = rowSet.getInt(1);
                System.out.print(id);
                String s=rowSet.getString(2);
                System.out.print(" "+s);
                String s2=rowSet.getString(3);
                System.out.print(" "+s2);
                System.out.println("");
//                System.out.println("Id: " + rowSet.getInt(1));
//                System.out.println("Name: " + rowSet.getString(2));
//                System.out.println("Duration: " + rowSet.getInt(3));
            }
        }
   //Creating and Executing RowSet

        catch (Exception e) {
            System.out.println(e);
        } finally {
            connection.close();
            stmt.close();
            rs.close();

        }
    }
}


