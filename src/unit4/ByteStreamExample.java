package unit4;

import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException{
        try(FileOutputStream fos=new FileOutputStream("Example.txt")){
            String content ="Hello World";
            fos.write(content.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileInputStream fis=new FileInputStream("Example.txt")){
            int i;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
