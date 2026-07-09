package unit4;

import java.io.*;

public class BufferedByteStreamExample {
    public static void main(String[] args) throws IOException{
        try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("BufferedExample.txt"))){
            String content ="Hello World";
            bos.write(content.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("BufferedExample.txt"))){
            int i;
            while ((i=bis.read())!=-1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
