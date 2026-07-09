package unit6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args){
        try{
            //create socket
            Socket socket = new Socket("localhost",8888);
            System.out.println("Connected to the server");

            //create input and output stream
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //send message to server
            out.println("Hello this is message from client");

            //read message from server
            String message=in.readLine();
            System.out.println("Server says : "+ message);

            //close connection
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
