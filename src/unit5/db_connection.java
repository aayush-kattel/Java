package unit5;

import java.sql.Connection;
import java.sql.DriverManager;

public class db_connection {
    static final String connURL ="jdbc:mysql://localhost:3306/db_bit";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static Connection getConnection(){
        Connection conn= null;
        try{
            conn = DriverManager.getConnection(connURL,USER,PASSWORD);
            System.out.println("Database Connected");
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
