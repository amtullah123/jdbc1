package com.stackroute.jdbcdemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetadataDemo {
    public void getAllStudents() throws SQLException {
        Connection connection=null;

        //register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Root@123");
        DatabaseMetaData dbmd=connection.getMetaData();
        System.out.println("Driver Name: "+dbmd.getDriverName());
        System.out.println("Driver Version: "+dbmd.getDriverVersion());
        System.out.println("UserName: "+dbmd.getUserName());
        System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
        System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

    }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            connection.close();
        }
}
}

