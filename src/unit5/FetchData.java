package unit5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
    public static void main(String[] args){
        try{
            Connection con=db_connection.getConnection();
            Statement stmt=con.createStatement();
            String sql="SELECT * FROM student";

            ResultSet rs=stmt.executeQuery(sql);

            while(rs.next()){
                int id=rs.getInt("stu_id");
                String name=rs.getString("name");
                int age=rs.getInt("age");

                System.out.println("ID: "+ id);
                System.out.println("Name: "+ name);
                System.out.println("Age: "+ age);
            }

            rs.close();
            stmt.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
