package unit6;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args){
        try{
            //create datagram socket
            DatagramSocket socket=new DatagramSocket(2020);
            System.out.println("UDP Server running...");

            //define buffer size
            byte[] buf =new byte[1024];

            //receive data packet from client
            DatagramPacket packet=new DatagramPacket(buf,buf.length);
            socket.receive(packet);

            String message=new String(
                    packet.getData(),0,packet.getLength());
            System.out.println("Client Says: "+message);

            //prepare response
            String response="Hello client, message receive!";
            byte[] sendBuffer=response.getBytes();

            InetAddress clientAddress=packet.getAddress();
            int clientPort=packet.getPort();

            //Send response to client
            DatagramPacket sendPacket=new DatagramPacket(
                    sendBuffer,sendBuffer.length,clientAddress,clientPort
            );
            socket.send(sendPacket);

            //close socket
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
