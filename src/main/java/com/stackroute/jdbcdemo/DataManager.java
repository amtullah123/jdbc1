package com.stackroute.jdbcdemo;

import java.sql.*;

public class DataManager
{
public void getAllStudents() throws SQLException {
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
        //register driver
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //obtain connection
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "Root@123");
         statement = connection.createStatement();
         resultSet = statement.executeQuery("select * from course");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            System.out.println(id);
            String name = resultSet.getString(2);
            System.out.println(name);
            int duration = resultSet.getInt(3);
            System.out.println(duration);
        }
    }
//    catch (ClassNotFoundException cnfException)
//    {
//        System.out.println("exception thrown" +cnfException.getStackTrace());
//    }
//    catch (SQLException sqlException )
//    {
//        System.out.println("exception thrown" +sqlException.getStackTrace());
//    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    finally {
        connection.close();
        statement.close();
        resultSet.close();
    }
    }
}


