package unit4;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}

public class SerializationExample {
    public static void main(String[] args){
        //Serialization
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.ser"))){
            Student s1=new Student(1,"Jack");
//            Student s2=new Student(2,"Dark");
            oos.writeObject(s1);
//            oos.writeObject(s2);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Deserialization
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.ser"))){
            Student s1=(Student)ois.readObject();
//            Student s2=(Student)ois.readObject();

            System.out.println("ID : "+s1.id);
            System.out.println("Name : "+s1.name);

//            System.out.println("ID : "+s2.id);
//            System.out.println("Name : "+s2.name);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
