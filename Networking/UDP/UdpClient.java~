import java.io.*;
import java.net.*;
class UdpClient
{
public static void main(String[] args)throws Exception
{
DatagramSocket ds=new DatagramSocket();
String s="india is a good country";
byte b[]=s.getBytes();
InetAddress i=InetAddress.getLocalHost();
DatagramPacket dp=new DatagramPacket(b,b.length,i,1089);
ds.send(dp);
}
}
