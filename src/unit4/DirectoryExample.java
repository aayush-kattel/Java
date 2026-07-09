package unit4;

import java.io.File;

public class DirectoryExample {
    public static void main(String[] args){
        File dir=new File("MyDir");

        if(dir.mkdir()){
            System.out.println("Directory created.");
        }else{
            System.out.println("Directory already exists.");
        }

        //listing files in a directory
//        File[] files=dir.listFiles();
//        if(files!=null){
//            System.out.println(files.getname());
//        }
    }
}
