package unit5;

import java.sql.Statement;

public class InsertUsingStatement {
    public static void main(String[] args){
        try{
            db_connection db = new db_connection();
            Statement stmt = db.getConnection().createStatement();

            String sql="INSERT INTO student(stu_id,name,age) VALUES (1,'ram',22),(2,'pichik',25)";

            stmt.executeUpdate(sql);
            stmt.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
