package com.stackroute;

import com.stackroute.jdbcdemo.*;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        DataManager dataManager=new DataManager();
        dataManager.getAllStudents();
//        PreparedStatementDemo psd=new PreparedStatementDemo();
//        psd.getAllStudents();
//        ResultsetMetadataDemo rsmd=new ResultsetMetadataDemo();
//         rsmd.getAllStudents();
//        DatabaseMetadataDemo dbm=new DatabaseMetadataDemo();
//        dbm.getAllStudents();
//        JdbcBatchProcessingDemo jpd=new JdbcBatchProcessingDemo();
//        jpd.getAllStudents();
//        JdbcTransactionDemo jbtd=new JdbcTransactionDemo();
//        jbtd.getAllStudents();
//          RowsetDemo rs=new RowsetDemo();
//          rs.getAllStudents();

}
}
