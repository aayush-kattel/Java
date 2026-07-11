package unit5;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertUsingPreparedStatement {
    public static void main(String[] args){
        try{
            Connection db = db_connection.getConnection();
            String sql = "INSERT INTO student(stu_id,name,age) VALUES (?,?,?)";
            PreparedStatement ps=db.prepareStatement(sql);

            ps.setInt(1,2);
            ps.setString(2,"Gopal");
            ps.setInt(3,30);

            int result= ps.executeUpdate();
            System.out.println(result + "record inserted");

            ps.close();
            db.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
