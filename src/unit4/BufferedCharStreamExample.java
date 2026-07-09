package unit4;

import java.io.*;

public class BufferedCharStreamExample {
    public static void main(String[] args) throws  IOException{
        //write
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("char_Example_buffer.txt"))) {
            bw.write("Hello this is a test content from buffered.");
        }catch (IOException e){
            e.printStackTrace();
        }

        //read
        try (BufferedReader br =new BufferedReader(new FileReader("char_Example_buffer.txt"))){
            int i;
            while((i=br.read())!=-1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
