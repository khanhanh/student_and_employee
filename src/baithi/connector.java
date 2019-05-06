package baithi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class connector {
    public Connection conn;
    public connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String Url = "jdbc:mysql://localhost:3306/quanly";

            conn = DriverManager.getConnection(Url, "root", "");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }

    public int updateQuery(String sqlUpdate) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeUpdate(sqlUpdate);
    }

}