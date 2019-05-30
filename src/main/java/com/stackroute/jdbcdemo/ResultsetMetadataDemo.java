package com.stackroute.jdbcdemo;

import java.sql.*;

public class ResultsetMetadataDemo {
    public void getAllStudents() throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //obtain connection
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Root@123");
            ps=connection.prepareStatement("select * from course");
            ResultSetMetaData rsmd=ps.getMetaData();

            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

        }
     catch(Exception e)
     {
         System.out.println(e);
     }
     finally {
         connection.close();
         ps.close();
     }
    }
}

