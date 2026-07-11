package unit5;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteStudent {
    public static void main(String[] args){
        try{
            Connection conn=db_connection.getConnection();
            String sql="DELETE FROM student  WHERE stu_id=1";

            Statement stmt=conn.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Data deleted successfully");

            conn.close();
            stmt.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
