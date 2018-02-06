import java.io.*;
import java.net.*;
class UdpServer
{
public static void main(String[] args)throws Exception
{
DatagramSocket ds=new DatagramSocket(1089);
byte b[]=new byte[1024];
DatagramPacket dp=new DatagramPacket(b,b.length);
ds.receive(dp);
String r=new String(dp.getData());
System.out.println(r.trim());
}
}
