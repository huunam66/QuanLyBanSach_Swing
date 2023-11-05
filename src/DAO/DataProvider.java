/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author nguye
 */
public class DataProvider {
    private static Connection connection = null;
    private static ResultSet resultSet = null;
    private final static String user = "sa";
    private final static String password = "123";
    private final static String databaseName = "CuaHangSach";
    private final static String URL = "jdbc:sqlserver://localhost\\DESKTOP-FRN8659\\SQLEXPRESS:1433;encrypt=true;trustServerCertificate=true;"
                                        + "databaseName="+databaseName;
    
    protected static ResultSet resultData(String query){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL, user, password);
            resultSet = connection.createStatement().executeQuery(query);
            return resultSet;
        } catch (Exception e) {
            System.err.print("\nError resultData !!!\n");
        }
        return null;
    }
    
    
    protected static int UpdateData(String query){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL, user, password);
            int value = connection.createStatement().executeUpdate(query);
            return value;
        } catch (Exception e) {
            System.err.print("\nError UpdateData !!!\n");
        }
        return 0;
    }
    
    protected static void CloseConnection(){
        try {
            connection.close();
            resultSet.close();
        } catch (Exception e) {
            System.err.print("\nError CloseConnection !!!\n");
        }
    }
}
