package unit4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {
    public static void main(String[] args)throws IOException{
        //write
        try (FileWriter fw=new FileWriter("Char_Example.txt")){
            fw.write("Hello,this is a test content");
        }catch (IOException e){
            e.printStackTrace();
        }

        //read
        try (FileReader fr=new FileReader("Char_Example.txt")){
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
