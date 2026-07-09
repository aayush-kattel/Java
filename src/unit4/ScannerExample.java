package unit4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=scanner.next();

        System.out.print("Enter your age: ");
        int age=scanner.nextInt();

        System.out.print("Enter your height: ");
        double height=scanner.nextDouble();

        System.out.print("Enter your full name: ");
        scanner.nextLine();
        String fullName=scanner.nextLine();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("full Name: "+fullName);
    }
}
