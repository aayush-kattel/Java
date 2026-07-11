package unit5;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudent {
    public static void main(String[] args){
        try{
            Connection db=db_connection.getConnection();
            String sql="UPDATE student SET name=?,age=? WHERE stu_id=?";
            PreparedStatement ps=db.prepareStatement(sql);

            ps.setString(1,"sita");
            ps.setInt(2,25);
            ps.setInt(3,1);

            ps.executeUpdate();

            db.close();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
