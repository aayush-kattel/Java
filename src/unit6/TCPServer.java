package unit6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args){
        try{
            //Create server socket
            ServerSocket serverSocket=new ServerSocket(8888);
            System.out.println("Server Started: Waiting for client...");

            //accept for client connection
            Socket clientSocket=serverSocket.accept();
            System.out.println("Client Connected: "+clientSocket.getInetAddress());

            //create input and output streams
            BufferedReader inFormClient=new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            PrintWriter outToClient=new PrintWriter(
                    clientSocket.getOutputStream(),true);

            //receive message from client
            String message=inFormClient.readLine();
            System.out.println(message);

            //send message to client
            outToClient.println("Hello this is message from server!!!");

            //close connection
            serverSocket.close();
            clientSocket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
