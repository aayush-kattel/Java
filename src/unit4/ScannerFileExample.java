package unit4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args){
        try {
            File file=new File("example.txt");
            Scanner input=new Scanner(file);

            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
