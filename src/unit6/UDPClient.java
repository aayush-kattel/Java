package unit6;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args){
        try{
            //create Datagram socket
            DatagramSocket clientSocket=new DatagramSocket();

            String message="Hello UDP Server!!!";
            byte[] messageBytes=message.getBytes();

            InetAddress IPAddress=InetAddress.getByName("localhost");
            int port =2020;

            //send packet to server
            DatagramPacket packet=new DatagramPacket(
                    messageBytes,messageBytes.length,IPAddress,port);

            clientSocket.send(packet);

            //get response from server
            byte[] receiveBuffer=new byte[1024];
            DatagramPacket receivePacket=new DatagramPacket(
                    receiveBuffer,receiveBuffer.length);

            clientSocket.receive(receivePacket);
            String receiveMessage=new String(
                    receivePacket.getData(),0,receivePacket.getLength());
            System.out.println(receiveMessage);

            //close the connection
            clientSocket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
