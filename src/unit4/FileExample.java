package unit4;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args){
        File file=new File("file.txt");

        //creating new file
        try {
            if(file.createNewFile()){
                System.out.println("File Created");
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //getting file properties
        System.out.println("File Name: "+file.getName());
        System.out.println("File Last Modified: "+file.lastModified());
        System.out.println("File Path: "+file.getAbsolutePath());
        System.out.println("Is File: "+file.isFile());

        //Deleting a file
        if(file.delete()){
            System.out.println("File deleted");
        }else {
            System.out.println("Failed to delete file.");
        }
    }
}
